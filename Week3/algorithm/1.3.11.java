package Week3.algorithm;
import edu.princeton.cs.algs4.*;

class EvaluatePostfix{
    public static void main(String[] args){
        Stack<Double> stack = new Stack<>();

        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                double v2 = stack.pop();
                double v1 = stack.pop();
                stack.push(v1 - v2);
            }else if(s.equals("*")){
                double v1 = stack.pop();
                double v2 = stack.pop();
                stack.push(v1 * v2);
            }else if(s.equals("/")){
                double v2 = stack.pop();
                double v1 = stack.pop();
                stack.push(v1 / v2);
            }else{
                stack.push(Double.parseDouble(s));
            }
        }
        StdOut.println(stack.pop());
    }
}