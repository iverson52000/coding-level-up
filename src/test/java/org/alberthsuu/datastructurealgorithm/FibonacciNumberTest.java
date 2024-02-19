package org.alberthsuu.datastructurealgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FibonacciNumberTest {
    private FibonacciNumber fibonacciNumber;

    @BeforeEach
    void setUp() {
        fibonacciNumber = new FibonacciNumber();
    }

    @Test
    void FibonacciNumberFirstTestCase() {
        int n = 2;
        int result = fibonacciNumber.fib(n);
        int expectedResult = 1;

        assertEquals(result, expectedResult);
    }

    @Test
    void FibonacciNumberSecondTestCase() {
        int n = 3;
        int result = fibonacciNumber.fib(n);
        int expectedResult = 2;

        assertEquals(result, expectedResult);
    }

    @Test
    void FibonacciNumberThirdTestCase() {
        int n = 4;
        int result = fibonacciNumber.fib(n);
        int expectedResult = 3;

        assertEquals(result, expectedResult);
    }
}