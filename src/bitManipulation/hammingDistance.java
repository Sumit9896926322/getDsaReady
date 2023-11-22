package bitManipulation;

//https://leetcode.com/problems/total-hamming-distance/description/
public class hammingDistance {
    public static int calculateHammingDistance(int[] arr) {
        int totalHammingDistance = 0;
        for (int i = 0; i < 32; i++) {
            int zeroesCount = 0, onesCount = 0;
            for (int num : arr) {
                //This approach is using left shift operator
                // ( (num >> i) & 1)
                if ((num & (1 << i)) > 0)
                    onesCount++;
            }
            zeroesCount = arr.length - onesCount;
            totalHammingDistance += zeroesCount * onesCount;
        }
        return totalHammingDistance;
    }

    public static void main(String[] args) {
        int[] arr = {4, 14, 4};
        System.out.println(calculateHammingDistance(arr));
    }
}
