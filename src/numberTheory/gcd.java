package numberTheory;

public class gcd {

    //gcd(a,b) = gcd(b,a%b)
    public static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {8, 16, 4, 24};
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            ans = findGcd(ans, arr[i]);
        }
        System.out.println(ans);
    }
}
