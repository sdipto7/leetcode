package containerwithmostwater_11;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int result = 0;
        while (rightPointer > leftPointer) {
            int distance = rightPointer - leftPointer;
            int maximumOccupancy = Math.min(height[leftPointer], height[rightPointer]);

            result = Math.max(result, (maximumOccupancy * distance));

            if (height[leftPointer] <= height[rightPointer]) {
                ++leftPointer;
            } else {
                --rightPointer;
            }
        }

        return result;
    }
}
