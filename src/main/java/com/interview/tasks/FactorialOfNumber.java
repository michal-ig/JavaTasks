package com.interview.tasks;

/**
 * Calculate factorial
 * The factorial of a natural number is a number multiplied by "number minus one", then by "number minus two", and so on till 1. The factorial of n is denoted as n!
 * <p>
 * We can write a definition of factorial like this:
 * n! = n * (n - 1) * (n - 2) * ...*1
 * <p>
 * Values of factorials for different n:
 * 1! = 1
 * 2! = 2 * 1 = 2
 * 3! = 3 * 2 * 1 = 6
 * 4! = 4 * 3 * 2 * 1 = 24
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public interface FactorialOfNumber {

    long calculateFactorial(int number);
}
