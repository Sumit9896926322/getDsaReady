package math;

import java.util.Arrays;

//https://leetcode.com/problems/prime-arrangements/
//TODO: pending
public class primeArrangements {
    public static boolean isPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int primeBelowNum = 0;
        int n = 5;
        for (int i = 2; i <= n; i++) {
            primeBelowNum += isPrime(i) ? 1 : 0;
        }
        System.out.println(factorial(primeBelowNum) * factorial(n - primeBelowNum));

    }
}
