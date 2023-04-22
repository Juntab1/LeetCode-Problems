// This problem was an easy level one. 
// The only tricky part I got confused with was
// by what value I should do the n % ?
// First, I did it with 2 but that was a problem becuase
// with 6 it would get be false even though it is true
// the pattern is:
// w w w L w w w L
// 1 2 3 4 5 6 7 8
// As you can see the first user can span 3 stones at a time,
// so on that 4th stone they will always lose.
// So, instead of 2 I need to do it by 4!
// Doing it by 4 will get me the winning pattern that I need!

class Solution {
    public boolean canWinNim(int n) {
        if (n == 1){
            return true;
        }
        if (n == 2){
            return true;
        }
        if (n % 4 == 0){
            return false;
        }
        else {
            return true;
        }
    }
}

