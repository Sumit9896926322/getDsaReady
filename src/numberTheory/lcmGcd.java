package numberTheory;

public class lcmGcd {
    public static int calculateLcm(int num1, int num2) {
        //naive method
        int prod1 = num1, prod2 = num2, a = 1, b = 1;
        while (prod1 != prod2) {
            if (prod1 < prod2) {
                prod1 = num1 * ++a;
            } else {
                prod2 = num2 * ++b;
            }
        }
        return prod1;

        // lcm * hcf  = a * b
        // lcm = (a*b)/hcf
    }

    public static int calculateGCD(int num1, int num2) {
//        //naive method
//        int min = Math.min(num1, num2);
//        int ans = 1;
//
//        for (int j = 2; j <= min; j++) {
//            if ((num1 % j == 0) && (num2 % j == 0)) {
//                ans = j;
//            }
//        }
//        return ans;

        if (num1 == 0) {
            return num2;
        }

        return calculateGCD((num2 % num1), num1);
    }

    public static void main(String[] args) {
        int lcm = calculateLcm(8, 14);
        int gcd = calculateGCD(8, 14);

        System.out.println(lcm + " " + gcd);
    }
}
