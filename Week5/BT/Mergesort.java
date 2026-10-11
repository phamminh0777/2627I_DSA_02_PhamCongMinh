package Week5.BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mergesort {
    public static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> inputFiles = new ArrayList<>();
        boolean printSortedValues = false;

        for (String arg : args) {
            if ("--print".equals(arg)) {
                printSortedValues = true;
            } else {
                inputFiles.add(arg);
            }
        }

        if (inputFiles.isEmpty()) {
            sortStandardInput();
            return;
        }

        for (String inputFile : inputFiles) {
            int[] values = readIntegers(Path.of(inputFile));
            long start = System.nanoTime();
            mergesort(values, 0, values.length - 1);
            long elapsedNanos = System.nanoTime() - start;

            System.out.printf(
                    Locale.ROOT,
                    "%s: n=%d, sort time=%.3f ms (%d ns)%n",
                    inputFile,
                    values.length,
                    elapsedNanos / 1_000_000.0,
                    elapsedNanos);

            if (printSortedValues) {
                printValues(values);
            }
        }
    }

    private static int[] readIntegers(Path inputFile) throws IOException {
        int[] values = new int[1024];
        int size = 0;

        try (BufferedReader reader = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(line);
                while (tokens.hasMoreTokens()) {
                    String token = tokens.nextToken();
                    final int value;
                    try {
                        value = Integer.parseInt(token);
                    } catch (NumberFormatException e) {
                        throw new IOException(
                                "Expected whitespace-separated 32-bit integers in "
                                        + inputFile + ", but found: " + token,
                                e);
                    }

                    if (size == values.length) {
                        values = Arrays.copyOf(values, values.length * 2);
                    }
                    values[size++] = value;
                }
            }
        }

        return Arrays.copyOf(values, size);
    }

    private static void sortStandardInput() {
        int[] values;
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n < 0) {
                throw new IllegalArgumentException("The number of input values cannot be negative.");
            }

            values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = scanner.nextInt();
            }
        }

        long start = System.nanoTime();
        mergesort(values, 0, values.length - 1);
        long elapsedNanos = System.nanoTime() - start;

        printValues(values);
        System.out.printf(
                Locale.ROOT,
                "Sort time=%.3f ms (%d ns)%n",
                elapsedNanos / 1_000_000.0,
                elapsedNanos);
    }

    private static void printValues(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


/*
Insertionsort:
n = 9 mất 0.004ms
n = 1000 mất 7.061ms
n = 1000000 mất 179250.981ms

Mergesort:
8ints.txt: n=9, sort time=0.013 ms (12667 ns)
1Kints.txt: n=1000, sort time=1.646 ms (1646259 ns)
1Mints.txt: n=1000000, sort time=348.909 ms (348909281 ns)

----> với mảng càng lớn thì mergesort hiệu quả và chạy nhanh hơn rất nhiều so với insertionsort
*/
