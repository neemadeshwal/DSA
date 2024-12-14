package Recursion2;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(FibonacciFunc(10));
    }

    // fibonacci series

    // 0 1 1 2 3 5 8 13 21 34 55
    // 0 1 2 3 4 5 6 7 8 9 10

    public static int FibonacciFunc(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        return FibonacciFunc(n - 1) + FibonacciFunc(n - 2);

    }

}
