package Week2;
import java.util.Scanner;

class localMinimumArray{
    public static int findLocal(int[] a){
        if(a.length == 1) return 0;
        if(a[0] < a[1]) return 0;
        
        if(a[a.length -1] < a[a.length - 2]) return a.length - 1;

        int l = 1;
        int r = a.length - 2;
        while(l <= r){
            int mid = l + (r - l) / 2;

            if(a[mid] > a[mid-1]){
                r = mid - 1;
            }else if(a[mid] > a[mid + 1]){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("LocalMinimum: " + findLocal(a));
        sc.close();
    }
}