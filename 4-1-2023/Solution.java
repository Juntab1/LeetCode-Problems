// This is a solution that passes all the tests. The only difficult part 
// I encountered with this problem was handling the case of when a 
// smaller roman numeral was infront of a bigger one.
// I started by my pointer checking the current node and putting it 
// against the node behind but I should just be testing with the current node
// and the node infront.
class Solution {
    public int romanToInt(String s) {
        int total = 0;
        Map<Character, Integer> answerKey = new HashMap<>();
        answerKey.put('I', 1);
        answerKey.put('V', 5);
        answerKey.put('X', 10);
        answerKey.put('L', 50);
        answerKey.put('C', 100);
        answerKey.put('D', 500);
        answerKey.put('M', 1000);
        for (int i = 0; i < s.length(); i++){
            if (i < s.length()-1 && answerKey.get(s.charAt(i)) < answerKey.get(s.charAt(i+1))){
                total -= answerKey.get(s.charAt(i));
            }
            else{
                total += answerKey.get(s.charAt(i));
            }
        }
        return total;
    }
}
