package Week2.BT;

import java.util.Scanner;

class FibonacciSearchDecreasing {
    public static int search(int[] a, int key){
        int n = a.length;
        int fib2 = 0;
        int fib1 = 1;
        int fibm = fib1 + fib2;

        while(fibm < n){
            fib2 = fib1;
            fib1 = fibm;
            fibm = fib1 + fib2;
        }

        int offset = -1;

        while(fibm > 1){
            int i = Math.min(offset + fib2, n - 1);

            if(a[i] < key) {
                fibm = fib2;
                fib1 = fib1 - fib2;
                fib2 = fibm - fib1;
            }else if(a[i] > key) {
                fibm = fib1;
                fib1 = fib2;
                fib2 = fibm - fib1;
                offset = i;
            }else{
                return i;
            }
        }

        if(fib1 == 1 && offset + 1 < n && a[offset + 1] == key) {
            return offset + 1;
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

        int key = sc.nextInt();

        System.out.println("idx= " + search(a, key));
    }
}