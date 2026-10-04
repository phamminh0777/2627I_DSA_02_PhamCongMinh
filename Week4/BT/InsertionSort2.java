package Week4.BT;
import java.util.*;

public class InsertionSort2{
    public static void insertionSort2(int n, List<Integer> arr){
        for(int i = 1; i < arr.size(); i++){
            int j = i;
            while(j > 0 && arr.get(j-1) > arr.get(j)){
                int temp = arr.get(j-1);
                arr.set(j-1, arr.get(j));
                arr.set(j, temp);
                j--;
            }

            printArray(arr);
        }


    }
    private static void printArray(List<Integer> arr){
        for(int s: arr){
            System.out.print(s + " ");

        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        insertionSort2(n, arr);
    }
}