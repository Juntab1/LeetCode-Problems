class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}

// 2nd way but did not pass all the tests
// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (!haystack.contains(needle)){
//             return -1;
//         }
//         if (haystack.equals(needle)){
//             return 0;
//         }
//         for (int i = 0; i < haystack.length() - needle.length(); i++){
//             if (haystack.substring(i,i+needle.length()).equals(needle)){
//                 return i;
//             }
//         } 
//         return -1;
//     }
// }

// First try did not work
// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (!haystack.contains(needle)){
//             return -1;
//         }
//         int index = 0;
//         boolean containRn = true;
//         for (char hay : haystack.toCharArray()){
//             for (char need : needle.toCharArray()){
//                 if (need == hay){
//                     containRn = true;
//                 }
//                 else{
//                     containRn = false;
//                 }
//             }
//             if (containRn == true){
//                 return index;
//             }
//             index++;
//         }
//         return index;
//     }
// }
