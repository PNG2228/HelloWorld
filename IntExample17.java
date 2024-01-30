package com.pg;
public class IntExample17 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
