package Arrays;

public class BestTime_To_Buy_Sell_stack {

	
	//Naive Solution
	public static int findMaximumProfit(int[] prices) {
		int n = prices.length;
		int maxProfit = 0;
		for(int i=0 ;i < n; i++ ) {
			for(int j = i+1; j < n; j++) {
			  int profit = prices[j] - prices[i];
			  if(profit > maxProfit)
				  maxProfit = profit;
			}
		}
		
		return maxProfit;
	}
	
	//Optimized solution
	public static int findMaximumProfitOpt(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            if (price - minPrice > maxProfit)
                maxProfit = price - minPrice;
        }
        return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = findMaximumProfit(prices);
		System.out.println(maxProfit);
		
		
		int maxProfitOpt = findMaximumProfitOpt(prices);
		System.out.println(maxProfitOpt);
		
		

	}

}
