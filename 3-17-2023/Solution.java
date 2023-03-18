import java.util.*;

// This was practice using a hashMap and also using a boolean list to check 
// if the two words are isomorphic or not.
class Solution {
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

// DID NOT HAVE THE BOOLEAN LIST CHECK TO SEE IF THE WORD 
// IS ALREADY ASSOCIATED OR NOT.
// This solution does not work fully. It can't pass a few tests
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         List<Character> s1 = new ArrayList<>();
//         List<Character> t1 = new ArrayList<>();
//         Map<Character, Character> answer = new HashMap<>();
//         for (int i = 0; i < s.length(); i++){
//             s1.add(s.charAt(i));
//         }
//         for (int j = 0; j < t.length(); j++){
//             t1.add(t.charAt(j));
//         }
//         for (int g = 0; g < s.length(); g++){  
//             char sChar = s1.get(g);
//             char tChar = t1.get(g);  
//             if (!answer.containsKey(sChar)){
//                 answer.put(sChar, tChar);
//             }
//             else{
//                 if (!answer.get(sChar).equals(tChar)){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
