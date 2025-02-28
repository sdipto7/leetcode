package plusone_66;

import java.util.Arrays;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 9, 9, 9, 9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 9, 9, 9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 2, 3, 9, 9})));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int nineCount = 0;
        int reversePointer = digits.length - 1;

        while (reversePointer >= 0) {
            if (digits[reversePointer] != 9) {
                digits[reversePointer] += 1;

                return digits;
            }

            digits[reversePointer] = 0;
            --reversePointer;
            ++nineCount;

            if (reversePointer == -1 && nineCount == digits.length) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;

                return newArray;
            }
        }

        return digits;
    }
}
