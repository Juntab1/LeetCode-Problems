// I can't figure out why my code is not working.
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int odd = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            if (!map.containsKey(i)){
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }   
        for(int value : map.values()){
            if (value % 2 == 1){
                odd++;
            }
            else{
                odd--;
            }
        } 
        return odd > 0? n - odd + 1: n; 
    }
}
