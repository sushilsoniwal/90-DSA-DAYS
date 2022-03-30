package com.company;

public class Sieve_Of_Eratosthenes {

    public static void main(String[] args) {
        Print_Primes(30);
    }

    static void Print_Primes(int n) {
        boolean[] primes = new boolean[n + 1];
        // Mark all as true.
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                // Update all multiples of i.
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        // Print Primes.
        for (int p = 2; p <= n; p++) {
            if (primes[p]) {
                System.out.print(p + " ");
            }
        }
    }
}
