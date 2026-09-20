package Week2.BT;

import java.util.Arrays;

class ThreeSumFaster{
    public static int CountTwoSum(int[] a) {
        int l = 0;
        int r = a.length - 1;
        int count = 0;

        while(l < r) {
            long sum = (long) a[l] + a[r];
            if(sum < 0) {
                l++;
            }else if(sum > 0) {
                r--;
            }else{
                count++;
                l++;
                r--;
            }

        }
        return count;
    }

    public static int CountThreeSum(int[] a) {
        int count = 0;
        Arrays.sort(a);
        for(int i = 0; i < a.length -2; i++){
            int l = i + 1;
            int r = a.length - 1;

            while(l < r){
                long sum = (long) a[i] + a[l] + a[r];
                if(sum < 0){
                    l++;
                }else if(sum > 0){
                    r--;
                }else{
                    count++;
                    l++;
                    r--;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {
        int[] a = {-3, -1, -0, 1, 2, 3, 4};
        System.out.println("Count: " + CountTwoSum(a));
        System.out.println("Count: " + CountThreeSum(a));
    }
    
}