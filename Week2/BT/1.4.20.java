package Week2.BT;
import java.util.Scanner;

class bitonicSearch{
    public static int search(int[] a, int key){
        if(a == null || a.length == 0) return -1;

        int peak = findPeak(a);

        int idx1 = BinarySearchAsc(a, 0, peak, key);
        if(idx1 != -1) return idx1;

        return BinarySearchDesc(a, peak + 1, a.length - 1, key);

    }

    private static int findPeak(int[] a){
        int l = 0;
        int r = a.length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] < a[mid] + 1){
                l = mid + 1;
            }else{
                r = mid;
            }
            
        }
        return l;
    }

    private static int BinarySearchAsc(int[] a, int l, int r, int key){
       while(l <= r){
        int mid = l + (r - l) / 2;
        if (a[mid] > key){
            r = mid - 1;
        }else if(a[mid] < key){
            l = mid + 1;
        }else{
            return mid;
        }
        }
        return -1;
       
    }


    private static int BinarySearchDesc(int[] a, int l, int r, int key){
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] < key){
                r = mid - 1;
            }else if(a[mid] > key){
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

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Nhap key: ");
        int key = sc.nextInt();

        int result = search(a, key);
        if(result != -1){
            System.out.println("Gia tri key: " + key + "tai indx: " + result);

        }else {
            System.out.println("ko tim thay!");
        }
    }
}