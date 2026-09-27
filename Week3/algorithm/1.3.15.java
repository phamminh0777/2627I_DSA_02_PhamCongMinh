package Week3.algorithm;

import edu.princeton.cs.algs4.*;

class KthFromLast{
    public static void main(String[] args){
        int k = Integer.parseInt(args[0]);
        Queue<String> queue = new Queue<>();
        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            queue.enqueue(s);
            if(queue.size() > k){
                queue.dequeue();
            }
        }
        if(!queue.isEmpty()){
        StdOut.println(queue.dequeue());
        }
    }
}
