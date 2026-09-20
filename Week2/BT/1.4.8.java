package Week2.BT
import java.util.Arrays;
class EqualPair{
    public static long countPair(int[] a) {
        if(a == null || a.length < 2) return 0;

        Arrays.sort(a);

        long count = 0;
        long total = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i-1]) {
                count++;
                total += count;

            }else {
                count = 0;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        int[] input = {1, 3, 2, 3, 1, 3, 2, 4};

        System.out.println("Mảng đầu vào: " + Arrays.toString(input));
        long result = countPair(input);
        System.out.println(result);
    }
}