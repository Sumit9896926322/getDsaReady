package math;

import java.util.*;

//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
public class minFourDigitSumAfterSplitInTwoNumber {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int index = 0;
        while (num > 0) {
            digits[index++] = num % 10;
            num = num / 10;
        }
        Arrays.sort(digits);
        return (digits[0] * 10 + digits[3]) + (digits[1] * 10 + digits[2]);
    }

    public static void main(String[] args) {

    }
}
