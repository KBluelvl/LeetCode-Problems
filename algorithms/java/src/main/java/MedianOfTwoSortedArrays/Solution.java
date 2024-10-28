package MedianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int n = nums1.length;
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, n, nums2.length);

        Arrays.sort(result);

        if(result.length % 2 == 1) {
            return result[result.length/2];
        }

        return (double) (result[(result.length/2)-1] + result[result.length/2])/2;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double r1 = findMedianSortedArrays(nums1, nums2);
        System.out.println("result = "+r1+", expected = 2.000");
        System.out.println(r1 == 2.0000);

        nums1 = new int[]{1,2};
        nums2 = new int[]{3,4};
        r1 = findMedianSortedArrays(nums1, nums2);
        System.out.println("result = "+r1+", expected = 2.5");
        System.out.println(r1 == 2.5);
    }
}
