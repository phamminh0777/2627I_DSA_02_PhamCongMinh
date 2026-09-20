package Week2.BT;
import java.util.Scanner;
class FarthestPair{
    public static void FindFarthestPair(double[] a){
        if(a == null || a.length < 2) return;

        double min = a[0];
        double max = a[0];

        

        for(int i = 1; i < a.length; i++){
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }

        double maxdiff = max - min;
        System.out.println("maxdiff = " + maxdiff);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Vui lòng nhập N >= 2!");
            return;
        }

        double[] a = new double[n];
        System.out.println("Nhập " + n + " số thực double (cách nhau bởi khoảng trắng hoặc xuống dòng):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        FindFarthestPair(a);
        sc.close();
        
    }
}