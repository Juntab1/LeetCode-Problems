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