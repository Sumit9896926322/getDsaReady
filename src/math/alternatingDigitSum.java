package math;

//https://leetcode.com/problems/alternating-digit-sum/description/
public class alternatingDigitSum {
    public static int alternateDigitSum(int n) {
        int sum = 0;
        int count = 0;
        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            if (++count % 2 != 0) {
                sum += remainder;
            } else {
                sum -= remainder;
            }
        }
        return count % 2 == 0 ? -sum : sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }
}


