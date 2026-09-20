package Week2;
import java.util.Arrays;
class CommonElements{
    public static void PrintCommon(int[] a, int[] b) {
        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                i++;
            } else if(a[i] > b[j]) {
                j++;
            } else {
                int val = a[i];
                System.out.println(val);

                while(i < a.length &&  a[i] == val) i++; // khi này i, j sẽ nhảy qua hết các giá trị bằng val
                while(j < b.length && b[j] == val) j++;  // để ko bị in lặp giá trị 
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int[] b = {2, 4, 4, 5, 6, 6};

        System.out.println("Arrays a: " + Arrays.toString(a));
        System.out.println("Arrays b: " + Arrays.toString(b));

        PrintCommon(a, b);
    }
}
    




