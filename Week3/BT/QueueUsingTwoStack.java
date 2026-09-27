package Week3.BT;
import java.util.Scanner;
public class QueueUsingTwoStack{
    private Mystack<Integer> stackIn = new Mystack<>();
    private Mystack<Integer> stackOut = new Mystack<>();

    public void enqueue(int x){
        stackIn.push(x);
    }

    private void shiftStack(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }

    public void dequeue(){
        shiftStack();
        if(!stackOut.isEmpty()){
            stackOut.pop();
        }
    }

    public void printFront(){
        shiftStack();
        if(!stackOut.isEmpty()){
            System.out.println(stackOut.peek());
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueUsingTwoStack queue = new QueueUsingTwoStack();
        
        if (!sc.hasNextInt()) return;
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (type == 2) {
                queue.dequeue();
            } else if (type == 3) {
                queue.printFront();
            }
        }
        sc.close();
    }
}