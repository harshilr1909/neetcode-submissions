class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        for(int i = 0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                int currProf = 0;
                if(prices[j] - prices[i]<0){
                    currProf = 0;
                }else{
                    currProf = prices[j] - prices[i];
                }if(maxProf<currProf){
                    maxProf = currProf;
                }
            }
        }
        return maxProf;
    }
}
