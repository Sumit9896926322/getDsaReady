package bitManipulation;

public class xorQueries {

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor = new int[arr.length];
        int[] ans = new int[queries.length];

        int prefixSoFar = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSoFar ^= arr[i];
            prefixXor[i] = prefixSoFar;
        }

        for (int i = 0; i < queries.length; i++) {
            int leftRange = queries[i][0];
            int rightRange = queries[i][1];

            if (leftRange == 0)
                ans[i] = prefixXor[rightRange];
            else
                ans[i] = prefixXor[rightRange] ^ prefixXor[leftRange - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,8,2,10};
        int[][] queries = {{2, 3}, {1, 3}, {0, 0}, {0, 3}};

        int[] ans = xorQueries(arr, queries);

        for (int a : ans) {
            System.out.println(a);
        }
    }
}
