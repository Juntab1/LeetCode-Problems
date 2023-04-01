// This way passed all the basic tests but not the complext tests.
// There is some way called the sliding window technique that I need to do to be able to fully solve this.
// class Solution2 {
//     public int lengthOfLongestSubstring(String s) {
//         int counter = 0;
//         int highestCounter = 0;
//         char lastChar = ' ';
//         String soFar = "";
//         for (char curr: s.toCharArray()){
//             if (lastChar != curr && !soFar.contains(String.valueOf(curr))){
//                 counter += 1;
//                 soFar += curr;
//                 lastChar = curr;
//             }
//             else if (lastChar == curr){
//                 counter = 1;
//                 soFar = String.valueOf(curr);
//                 lastChar = ' ';
//             }
//             else if (soFar.contains(String.valueOf(curr))){
//                 soFar = soFar.substring(soFar.indexOf(curr)) + curr;
//                 counter = soFar.length();
//                 lastChar = curr;
//             }
//             if (counter > highestCounter){
//                 highestCounter = counter;
//             }
//         }
//         return highestCounter;
//     }
// }
