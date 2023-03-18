
// Correct way to do it. This way is way easier
class Solution3 {
    public boolean isSubsequence(String s, String t) {
      int i = 0;
      int j = 0;
      int sSize = s.length();
      int tSize = t.length();
      char[] ss = s.toCharArray();
      char[] tt = t.toCharArray();

      if (sSize < 1){
        return true;
      }

      while (j < tSize){
        if (ss[i] == tt[j]){
          i++;
        }
        j++;
        if (i == sSize){
            return true;
        }
      }
      return false;
    }
}


// Could not pass two test cases.
// It got too long and complicated
// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         // a
//         if (s.isEmpty() && t.isEmpty()){
//             return true;
//         }
//         else if (s.isEmpty()){
//             return true;
//         }
//         else if (s.length() == 1 && t.length() == 1){
//             if (s.equals(t)){
//                 return true;
//             }
//             return false;
//         }
//         else if (s.length() == 1){
//             if (t.contains(s)){
//                 return true;
//             }
//             return false;
//         }
//         char firstS = s.charAt(0);
//         // c
//         char lastS = s.charAt(s.length()-1);
//         // 0
//         int placeFirst = t.indexOf(firstS);
//         // 6
//         int placeLast = t.indexOf(lastS);
//         // check 0 < 6
//         if (placeFirst > placeLast || placeFirst == placeLast){
//             return false;
//         }
//         int indexInc = 1;
//         boolean found = false;
//         // b
//         for (int i = 1; i < s.length()-1; i++){
//             // char currS = s.charAt(i);
//             // if (!t.contains(currS)){
//             //     return false;
//             // }
//             for (int j = placeFirst + 1; j < placeLast; j += indexInc){
//                 if (t.charAt(j) == s.charAt(i)){
//                     placeFirst = j;
//                     found = true;
//                 }
//             }
//             if (found){
//                 found = false;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }