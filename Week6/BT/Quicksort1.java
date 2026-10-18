package Week6.BT;

import java.util.*;

public class Quicksort1{
    public static List<Integer> quicksort1(List<Integer> arr){
        int pivot = arr.get(0);
        List<Integer> Larr = new ArrayList<>();
        List<Integer> Rarr = new ArrayList<>();

        Rarr.add(pivot);

        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) > pivot){
                Rarr.add(arr.get(i));
                System.out.println("Larr: " + Larr);
            }else{
                Larr.add(arr.get(i));
                System.out.println("Rarr: " + Rarr);
            }
        }
        Larr.addAll(Rarr);
        return Larr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        List<Integer> result = quicksort1(arr);

        for(int val: result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}