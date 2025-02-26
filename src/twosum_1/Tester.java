package twosum_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @author shahriar.rumi.dipto
*/
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3, 1, 1, 5, 7, 2}, 5)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; ++index) {
            int difference = target - nums[index];
            if (map.containsKey(difference)) {
                return new int[]{index, map.get(difference)};
            }

            map.put(nums[index], index);
        }

        return new int[2];
    }
}
