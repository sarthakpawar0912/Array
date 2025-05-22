package ARRAY.EXAMPLES;

public class BuyANDSell_Stocks {

    public int maxProfit(int[] prices) {

        // Initialize minimum price to a very large value
        // Ensures any price in the array will be smaller
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        // Iterate through prices
        for (int i = 0; i < prices.length; i++) {

            // Update minPrice if current price is lower
            if (prices[i] < minPrice) {

                minPrice = prices[i];
            }
            // Calculate profit if selling today
            int profit = prices[i] - minPrice;
            // Update maxProfit if current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuyANDSell_Stocks solution = new BuyANDSell_Stocks();

        // Test case 1: prices = [7,1,5,3,6,4]
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test case 1: Max profit = " + solution.maxProfit(prices1)); // Expected: 5

        // Test case 2: prices = [7,6,4,3,1]
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test case 2: Max profit = " + solution.maxProfit(prices2)); // Expected: 0

        // Test case 3: prices = [1]
        int[] prices3 = {1};
        System.out.println("Test case 3: Max profit = " + solution.maxProfit(prices3)); // Expected: 0
    }
}
