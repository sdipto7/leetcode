package searchinsertposition_35;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.searchInsert(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int startPosition = 0;
        int endPosition = nums.length - 1;

        while (startPosition <= endPosition) {
            int midPosition = (startPosition + endPosition) / 2;

            if (target == nums[midPosition]) {
                return midPosition;
            }

            if (target > nums[midPosition]) {
                startPosition = midPosition + 1;
            } else {
                endPosition = midPosition - 1;
            }
        }

        return startPosition;
    }
}
