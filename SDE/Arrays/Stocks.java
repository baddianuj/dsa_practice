public class Stocks {
    public static int maxProfit(int[] prices){
        int max=0;
        int bestbuy=0;
        for(int i=0; i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                bestbuy=prices[i];
                for(int j=i+1; j<prices.length;j++){
                    int diff = prices[j] - bestbuy;
                    // System.out.println(i+" "+ j);
                    if(diff>max) max=diff;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
