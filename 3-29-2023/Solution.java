// It was an easy level dp question but I used the idea of using what
// we built before in the array and it worked!
class Solution {
    public boolean divisorGame(int n) {
        boolean[] whoWins = new boolean[n+1];
        whoWins[0] = true;
        for (int i = 1; i <= n; i++){
            if (whoWins[i-1] == true){
                whoWins[i] = false;
            }
            else{
                whoWins[i] = true;
            }
        }
        return whoWins[n];
    }
}
