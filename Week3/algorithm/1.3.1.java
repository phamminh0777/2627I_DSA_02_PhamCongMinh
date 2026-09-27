package Week3.algorithm;
class FixedCapacityStackOfStrings{
    private int n;
    private String[] a;

    public FixedCapacityStackOfStrings(int capacity){
        n = 0;
        a = new String[capacity];

    }

    public boolean isEmpty(){
        return n ==0;

    }
    public boolean isFull(){
        return n == a.length;  // 

    }
    public int size(){
        return n;
    }

    public void push(String item){
        a[n] = item;
        n++;
    }

    public String pop(){
        n--;
        return a[n];
    }
}