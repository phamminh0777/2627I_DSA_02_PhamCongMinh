package Week6.BT;
import java.util.*;

public class QuickSort{
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int j = low -1;
        for(int i = low; i < high; i++){
            if(arr[i] < pivot){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = temp;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return j + 1;
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            
            quicksort(arr, pi + 1, high);
            
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        quicksort(arr, 0, arr.length-1);
        

    }
}