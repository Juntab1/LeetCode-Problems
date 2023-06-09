// This is the correct solution. I had the correct intuition below!
// I just had to change the 0's to 1's and get rid of one more for loop
// iteration for the big for loop
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        finalAns.add(first);
        // gives us the index's available in a list
        for (int i = 0; i < numRows-1; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < i; j++){
                curr.add(finalAns.get(i).get(j) + finalAns.get(i).get(j+1));
            } 
            curr.add(1);
            finalAns.add(curr);
        }
        return finalAns;
    }   
}


// close output but you have some aspects of it wrong for example you 
// are printing out 0's
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> finalAns = new ArrayList<>();
//         List<Integer> first = new ArrayList<>();
//         first.add(0);
//         first.add(1);
//         first.add(0);
//         finalAns.add(first);
//         // gives us the index's available in a list
//         for (int i = 0; i < numRows; i++){
//             List<Integer> curr = new ArrayList<>();
//             curr.add(0);
//             for (int j = 0; j < i; j++){
//                 curr.add(finalAns.get(i).get(j) + finalAns.get(i).get(j+1));
//             } 
//             curr.add(0);
//             finalAns.add(curr);
//         }
//         return finalAns;
//     }   
// }
