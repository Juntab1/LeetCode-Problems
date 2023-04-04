// first question that I was able to fully solve by myself in a while!
// Even though it was an easy question it was a good thinking exercise of 
// how to actually get the int reversed. I probably did not do it the most
// efficient way by turning it into a string but it worked!
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String intToString = Integer.toString(x);
        Stack<Character> reverse = new Stack<>();
        String sameS = "";
        for (char c : intToString.toCharArray()){
            reverse.push(c);
        }
        while (!reverse.isEmpty()){
            char addBack = reverse.pop();
            sameS += addBack;
        }
        if (intToString.equals(sameS)){
           return true;
        }
        return false;
    }
}
