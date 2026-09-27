package Week3.algorithm;

import edu.princeton.cs.algs4.*;

class StackCopy{
    public static Stack<String> copy(Stack<String> stack){
        Stack<String> temp = new Stack<>();
        Stack<String> copied = new Stack<>();

        for(String s: stack){
            temp.push(s);
        }
        while(!temp.isEmpty()){
            copied.push(temp.pop());
        }
        return copied;
    }

    public static void main(String[] args){
        Stack<String> original = new Stack<>();
        original.push("A");
        original.push("B");
        original.push("C");
        Stack<String> cop = copy(original);

        StdOut.print("Stack gốc: ");
        for (String s : original) StdOut.print(s + " ");
        
        StdOut.print("\nStack bản sao: ");
        for (String s : cop) StdOut.print(s + " ");
    }
}