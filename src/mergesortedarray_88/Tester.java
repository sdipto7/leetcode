package mergesortedarray_88;

import java.util.Arrays;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[0];
        solution.merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        solution.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rearIdx = m-- + n-- - 1;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[rearIdx--] = nums1[m--];
            } else {
                nums1[rearIdx--] = nums2[n--];
            }
        }

        while (n >= 0) {
            nums1[rearIdx--] = nums2[n--];
        }
    }
}
