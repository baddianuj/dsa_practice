public class Stocks {
    public static int maxProfit(int[] prices){
        int len = prices.length;
        int profit = 0;
        int mini=prices[0];
        for(int i=1; i<len; i++){
            int diff = prices[i]-mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, prices[i]);
        }
        return profit;
        





        // int max=0;
        // int bestbuy=0;
        // for(int i=0; i<prices.length-1;i++){
        //     if(prices[i]<prices[i+1]){
        //         bestbuy=prices[i];
        //         for(int j=i+1; j<prices.length;j++){
        //             int diff = prices[j] - bestbuy;
        //             // System.out.println(i+" "+ j);
        //             if(diff>max) max=diff;
        //         }
        //     }
        // }
        // return max;
    }
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
