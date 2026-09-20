package Week2;
import java.util.Arrays;
class ClosestPair{
    public static void FindClosestPair(double[] a){
        if(a == null || a.length < 2) return;

        Arrays.sort(a);
        double mindiff = Double.POSITIVE_INFINITY;
        double p1 = a[0], p2 = a[1];
        for(int i = 1; i < a.length - 1; i++){
            double diff = a[i+1] - a[i];

            if(mindiff > diff) {
                mindiff = diff;
                p1 = a[i];
                p2 = a[i + 1];
            }
            
        }

        System.out.println("so cap gan nhat: (" + p1 + ", " + p2 + ") khoang cach = " + mindiff);
        
    }

    public static void main(String[] args){
        double[] a = {4.6, 5.6, 4.3, 6.8, 9,8, 2.6};
        FindClosestPair(a);
    }
}