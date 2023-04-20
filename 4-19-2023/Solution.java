// My solution and this worked for me!
class Solution {
    public int lengthOfLastWord(String s) {
        String lastWord = "";
        for (String z : s.split(" ")){
            lastWord = z;
        }
        return lastWord.length();
    }
}

// Better solution
// String[] arr = s.split(" ");
// return arr[arr.length-1].length();

// Another way I could have done this is by using break and also using a for loop
// this way might have been better. It seems like looking at the solutions this is a 
// better solution.