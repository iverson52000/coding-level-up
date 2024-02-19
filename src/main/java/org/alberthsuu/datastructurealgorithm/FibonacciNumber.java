package org.alberthsuu.datastructurealgorithm;

/**
 * 509. Fibonacci Number
 */
public class FibonacciNumber {
    public int fib(int n) {
        int fib0 = 0;
        int fib1 = 1;

        int result = 0;

        if (n == 0) return fib0;
        if (n == 1) return fib1;

        for (int i = 2; i < n + 1; i++) {
            result = fib0 + fib1;
            fib0 = fib1;
            fib1 = result;
        }

        return result;
    }
}
