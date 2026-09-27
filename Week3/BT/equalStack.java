package Week3.BT;
import java.util.*;

public class equalStack{
    public static int equalStacks(int[] h1, int[] h2, int[] h3){
        Mystack<Integer> s1 = new Mystack<>();
        Mystack<Integer> s2 = new Mystack<>();
        Mystack<Integer> s3 = new Mystack<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for(int i = h1.length - 1; i >= 0; i--){
            s1.push(h1[i]);
            sum1 += h1[i];
        }
        for(int i = h2.length - 1; i >= 0; i--){
            s2.push(h2[i]);
            sum2 += h2[i];
        }
        for(int i = h3.length - 1; i >= 0; i--){
            s3.push(h3[i]);
            sum3 += h3[i];
        }

        while(!(sum1 == sum2 && sum2 == sum3)){
            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= s1.pop();
            }else if (sum2 >= sum1 && sum2 >= sum3){
                sum2 -= s2.pop();
            }else {
                sum3 -= s3.pop();
            }
        }
        return sum1;

    }

    public static void main(String[] args){
        int[] h1 ={1, 3, 4, 1};
        int[] h2 = {1, 2, 3, 4, 5};
        int[] h3 = {3, 4, 2, 1, 1, 1};
        System.out.println("Chieu cao tối đa bằng nhau: " + equalStacks(h1, h2, h3));
    }
}