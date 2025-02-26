package removeelement_27;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(solution.removeElement(new int[]{1}, 1));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int currentPointer = 0;
        int prevPointer = 0;

        while (currentPointer < nums.length) {
            if (nums[currentPointer] != val) {
                nums[prevPointer] = nums[currentPointer];
                ++prevPointer;
            }

            ++currentPointer;
        }

        return prevPointer;
    }
}
