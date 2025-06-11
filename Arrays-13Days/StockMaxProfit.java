public class StockMaxProfit {

    public int maximumProfit(int prices[]) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        StockMaxProfit solver = new StockMaxProfit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};

        System.out.println("Max profit for prices1: " + solver.maximumProfit(prices1)); // 7
        System.out.println("Max profit for prices2: " + solver.maximumProfit(prices2)); // 4
        System.out.println("Max profit for prices3: " + solver.maximumProfit(prices3)); // 0
    }
}

