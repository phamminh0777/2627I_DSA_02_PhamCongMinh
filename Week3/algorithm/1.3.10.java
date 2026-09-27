package Week3.algorithm;
import edu.princeton.cs.algs4.*;

class infixToPostfix{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            if(s.equals("(")){

            }else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                stack.push(s);

            }else if(s.equals(")")) {
                StdOut.print(stack.pop());
            }
            else{
                StdOut.print(s + " ");
            }
        }
        StdOut.println();
    }
}
