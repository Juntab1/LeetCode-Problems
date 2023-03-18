import java.util.*;

// This was practice using a hashMap and also using a boolean list to check 
// if the two words are isomorphic or not.
class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        boolean[] check = new boolean[128];
        Map<Character, Character> answer = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);  
            if (!answer.containsKey(sChar)){
                if (check[tChar]){
                return false;
                }
                check[tChar] = true;
                answer.put(sChar, tChar);
            }
            else{
                if (!answer.get(sChar).equals(tChar)){
                    return false;
                }
            }
        }
        return true;
    }
}
