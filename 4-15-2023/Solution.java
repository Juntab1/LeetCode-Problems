// This was an easy question. I should have been able to do it all by myself but I over thought the question. 
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        // I did not know that this was a possible line of code.
        // However, I do now! I will use it from now on.
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
// First try did not work!
// class Solution {
//     public int[] plusOne(int[] digits) {
//         int length = digits.length - 1;
//         boolean runOut = false;
//         if ((digits[digits.length-1] + 1) == 10){
//             while (length-1 >= 0 || digits[length-1] == 10 || runOut == false){
//                 if (length == 0){
//                     runOut = true;
//                 }
//                 else{
//                     length -= 1;
//                 }

//             }
//         }
//         if (length < 0){
//             int[] newAns = new int[digits.length];
//             newAns[0] = 1;
//             int count = 1;
//             for (int num : digits){
//                 newAns[count] = num;
//                 count++;
//             }
//             return newAns;
//         }
//         else{
//             digits[length] += 1;
//         }
//         return digits;
//     }
// }
