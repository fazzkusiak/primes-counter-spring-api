package com.kub.async_api;

import java.util.Arrays;

public class CountPrimes {

    static int sieveOfEratosthenes(int start, int end)
    {
        int i;
        boolean[] a = new boolean[end + 1];
        Arrays.fill(a, true);
        int count = 0;
        // 0 and 1 are not prime
        a[0] = false;
        a[1] = false;
        for (i = 2; i <= Math.sqrt(end); i++)

            // Check if number is prime
            if (a[i])
                for (int j = i * i; j <= end; j += i) {
                    a[j] = false;
                }
        for (i = start; i <= end; i++) {

            // Printing only prime numbers
            if (a[i])
                count++;
        }
        return count;
    }
}
