// easy dynamic programming question
class Solution {
    public int fib(int n) {
        // + 1 for 0 case
        int[] intArr = new int[n+2];
        intArr[0] = 0;
        intArr[1] = 1;
        for (int i = 2; i <= n; i++){
            intArr[i] = intArr[i-1]+intArr[i-2];
        }
        return intArr[n];
    }
}

// Recursion this way could have worked too!
// public int fib(int n) {
//     if(n<=1)
//         return n;
    
//     return fib(n-1)+fib(n-2);
// }