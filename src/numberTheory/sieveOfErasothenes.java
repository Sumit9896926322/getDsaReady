package numberTheory;

import java.util.ArrayList;

public class sieveOfErasothenes {

    public static ArrayList<Integer> findPrime(int n) {
        boolean isVisited[] = new boolean[n + 1];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 2; (i * i) <= n; i++) {
            if (!isVisited[i]) {
                // i*i should be written to prevent repeated factor
                for (int j = i * i; j <= n; j += i) {
                    isVisited[j] = true;
                }
            }
        }

        for (int i = 2; i < isVisited.length; i++) {
            if (!isVisited[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = findPrime(100);
        System.out.println(ans);
    }
}
