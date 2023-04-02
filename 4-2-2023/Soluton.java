// This works
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Ex: car, dog, racecar
        // Ex: flight, flow, flower
        Arrays.sort(strs);
        int first = strs[0].length();
        int last = strs[strs.length-1].length();
        int index = 0;
        while (index < first && index < last){
            if (strs[0].charAt(index) == strs[strs.length-1].charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        if (index == 0){
            return "";
        }
        return strs[0].substring(0,index);
    }

}

// First attempt at the question did not work as well.
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String preFix = "";
//         char curr = ' ';
//         boolean same = false;
//         for (int i = 0; i < strs[2].length(); i++){
//             curr = strs[0].charAt(i);
//             for (int j = 1; j < strs.length; j++){
//                 if (curr == strs[j].charAt(i)){
//                     same = true;
//                 }
//             }
//             if (same == false){
//                 return "";
//             }
//             else{
//                 preFix += curr;
//             }
//             same = false;
//         }
//         return preFix;
//     }
// }
