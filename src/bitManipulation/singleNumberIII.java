package bitManipulation;

import java.util.ArrayList;

//https://leetcode.com/problems/single-number-iii/

//Solution
//Find the rightmost set bit, divide numbers into two groups. Each group will end up being one unique number.
public class singleNumberIII {
    public static int[] findTwoSingleNumber(int[] arr) {
        int resultantXor = 0;
        for (int num : arr) {
            resultantXor ^= num;
        }

        int rightMostBitSet = resultantXor & ~(resultantXor - 1);
        int ans1 = resultantXor, ans2 = resultantXor;
        for (int i = 0; i < arr.length; i++) {
            if ((rightMostBitSet & arr[i]) == 0) {
                ans1 ^= arr[i];
            } else {
                ans2 ^= arr[i];
            }
        }

        return new int[]{ans1, ans2};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 2, 5};
        int []anss = findTwoSingleNumber(arr);

        int n = 6;
        System.out.println(Math.log10(n & -n));

        for (int ans:anss) {
            System.out.println(ans);
        }
    }
}
