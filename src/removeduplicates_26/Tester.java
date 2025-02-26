package removeduplicates_26;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.removeDuplicates(new int[]{1,1,2}));
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int prevPointer = 0;
        int nextPointer = 1;

        while(nextPointer < nums.length) {

            if (!(nums[prevPointer] == nums[nextPointer])){
                nums[prevPointer + 1] = nums[nextPointer];

                ++prevPointer;
            }

            ++nextPointer;
        }

        return prevPointer + 1;
    }
}
