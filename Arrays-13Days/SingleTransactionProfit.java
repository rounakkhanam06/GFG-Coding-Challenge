public class SingleTransactionProfit {

    public int maximumProfit(int prices[]) {
        if (prices == null || prices.length == 0) return 0;

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price > buyPrice) {
                int profit = price - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        SingleTransactionProfit solver = new SingleTransactionProfit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 2, 3, 4, 5};

        System.out.println("Max profit for prices1: " + solver.maximumProfit(prices1)); // 5
        System.out.println("Max profit for prices2: " + solver.maximumProfit(prices2)); // 0
        System.out.println("Max profit for prices3: " + solver.maximumProfit(prices3)); // 4
    }
}

