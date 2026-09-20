package Week2;
import java.util.Arrays;
class FourSum{
    public static int count(int[] a) {
        int count = 0;
        Arrays.sort(a); // NlogN

        for(int i = 0; i < a.length - 3; i++) {
            for(int j = i + 1; j < a.length - 2; j++) {
                int l = j + 1;
                int r = a.length - 1;

                while(l < r) {
                    long sum = (long)a[i] + a[j] + a[l] + a[r];
                    if(sum == 0) {
                        count++;
                        l++;
                        r--;
                    } else if(sum < 0) {
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 0, 1, -2, 2};
        System.out.println("count: " + count(a));
    }
}
