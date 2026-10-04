package Week4.BT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class countingSort {

    // Sửa tên hàm thành countingSort và chỉ giữ lại 1 tham số arr
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] a = new int[100]; // Đảm bảo các phần tử trong arr nằm trong khoảng [0, 99]

        for (int e : arr) {
            a[e] += 1;
        }

        List<Integer> result = new ArrayList<>();
        for (int val : a) {
            result.add(val);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Kiểm tra biến môi trường OUTPUT_PATH để chạy được cả trên máy local lẫn HackerRank
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = new BufferedWriter(
            outputPath != null ? new FileWriter(outputPath) : new OutputStreamWriter(System.out)
        );

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Gọi trực tiếp hàm countingSort trong cùng class
        List<Integer> result = countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}