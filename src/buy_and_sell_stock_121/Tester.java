package buy_and_sell_stock_121;

/*
 * @author shahriar.rumi.dipto
 */
public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(solution.maxProfit(new int[]{7, 3, 7, 1, 2, 3, 1}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }

        return maxProfit;
    }
}
