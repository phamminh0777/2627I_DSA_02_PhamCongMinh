package Week3.algorithm;
import java.util.*;

class RisizingQueueOfString{
    private int n = 0;
    private int first = 0;
    private int last = 0;
    private String[] q = new String[2];

    public boolean isEmpty(){
        return n == 0;
    }
    public void queue(String item){
        if(n == q.length) resize(2 * q.length);
        q[last] = item;
        last = (last + 1) % q.length;
        n++;
    }
    public String dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        String item = q[first];
        q[first] = null;
        first = (first + 1) % q.length;
        n--;
        if(n > 0 && n == q.length / 4){
            resize(q.length / 2);
        }
        return item;
    }

    private void resize(int capacity){
        String[] copy = new String[capacity];
        for(int i = 0; i < capacity; i++){
            copy[i] = q[(first + 1) % q.length];
        }
        q = copy;
        first = 0;
        last = n;
        
    }
}