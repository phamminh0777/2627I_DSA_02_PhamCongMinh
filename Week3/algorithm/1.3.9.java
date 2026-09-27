package Week3.algorithm;
import java.util.*;


class completeParantheses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                ops.push(s);
            }else if(s.equals(")")){
                String op = ops.pop();
                String v2 = vals.pop();
                String v1 = vals.pop();
                String subExp = "(" + v1 +" " + op + " " + v2 + ")";
                vals.push(subExp); 
            }else{
                vals.push(s);
            }
        }
        System.out.println(vals.pop());
        sc.close();

    }
}
