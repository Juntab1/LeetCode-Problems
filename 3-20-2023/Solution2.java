// need to fix this so there is only one for loop
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i <= prices.length-1; i++){
            if (prices[i] < min){
                min = prices[i];
            }
            int valRn = prices[i] - min;
            if (valRn > max){
                max = valRn;
            }
        }
        if (max <= 0){
            return 0;
        }
        return max;

    }
}
