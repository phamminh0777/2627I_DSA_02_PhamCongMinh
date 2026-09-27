package Week3.algorithm;

import edu.princeton.cs.algs4.ResizingArrayStack;
import edu.princeton.cs.algs4.Stack; // Class Stack của algs4 mặc định dùng Linked List
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdOut;

class StackComparison {

    // Đo thời gian chạy N lần push và N lần pop trên ResizingArrayStack
    public static double timeResizingArrayStack(int N) {
        Stopwatch timer = new Stopwatch();
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        for (int i = 0; i < N; i++) {
            stack.push(i);
        }
        for (int i = 0; i < N; i++) {
            stack.pop();
        }
        return timer.elapsedTime();
    }

    // Đo thời gian chạy N lần push và N lần pop trên Linked List Stack
    public static double timeLinkedListStack(int N) {
        Stopwatch timer = new Stopwatch();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            stack.push(i);
        }
        for (int i = 0; i < N; i++) {
            stack.pop();
        }
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        StdOut.printf("%10s %15s %15s %15s\n", "N", "Array (s)", "Linked (s)", "Ratio (L/A)");
        StdOut.println("---------------------------------------------------------------");

        // Bắt đầu thử nghiệm từ N = 1,000,000 và nhân đôi N ở mỗi vòng lặp
        for (int N = 1000000; N <= 64000000; N += N) {
            double timeArray = timeResizingArrayStack(N);
            double timeLinked = timeLinkedListStack(N);
            double ratio = timeLinked / timeArray;

            StdOut.printf("%10d %15.3f %15.3f %15.2f\n", N, timeArray, timeLinked, ratio);
        }
    }
}