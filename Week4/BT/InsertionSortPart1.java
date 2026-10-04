package Week4.BT;
import java.util.*;
public class InsertionSortPart1{
    public static void InsertionSort1(int n, int[] a){
        int last = a[n - 1];
        int i = n - 2;

        while(i >= 0 && a[i] > last){
            a[i + 1] = a[i];
            printArray(a);
            i--;
        }

        a[i + 1] = last;
        printArray(a);


    }

    private static void printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");

        }
        System.out.println();

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        InsertionSort1(n, a);
        
    }
}