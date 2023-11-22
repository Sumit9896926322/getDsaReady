package bitManipulation;

//https://leetcode.com/problems/single-number-ii/

//Solution
//the resultant submission of bit will occur in 3n pairs for number repeating 3 times
// except 1 which occurs 3n+1 times
public class singleNumberII {
    public static int findSingleNumberInTriplets(int[] arr) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (((arr[j] >> i) & 1) > 0) {
                    count++;
                }
            }
            count %= 3;
            ans |= count<<i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-2,-2,-4,-2};
        System.out.println(findSingleNumberInTriplets(arr));
    }
}
