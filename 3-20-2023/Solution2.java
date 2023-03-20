// need to fix this so there is only one for loop
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int index = 0;
        for (int i = 1; i < prices.length-1; i++){
            if (prices[i] < min){
                min = prices[i];
                index = i;
            }
        }
        int max = prices[index];
        for (int j = index + 1; j < prices.length; j++){
            if (prices[j] > max){
                max = prices[j];
            }
        }
        if (max == prices[index]){
            return 0;
        }
        else{
            return max - min;
        }
    }
}
