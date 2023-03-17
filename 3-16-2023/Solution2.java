import java.util.*;

// Problem is find the numbers that are repeated among the 3 lists. The number only
// has to appear in 2 out of the 3 lists for it to count.
class Solution2 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
        List<Integer> correct = new ArrayList<>();
        Set<Integer> l1 = new HashSet<>();
        Set<Integer> l2 = new HashSet<>();

        for (int num : nums1){
            l1.add(num);
        }

        for (int num2 : nums2){
            if (l1.contains(num2) && !correct.contains(num2)){
                correct.add(num2);
            }
            l2.add(num2);
        }

        for (int num3 : nums3){
            if ((l1.contains(num3) || l2.contains(num3)) && (!correct.contains(num3))){
                correct.add(num3);
            }
        }
        return correct;
    }
}



// This way was not that effective. Could not pass all cases also uses a lot of data
// class Solution2 {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
//         List<Integer> correct = new ArrayList<>();
//         Map<Integer, Integer> duplicate = new HashMap<>();
//         for (int num: nums1){
//             if (num < nums1.length){
//                 int number = nums1[num];
//                 if (!duplicate.containsKey(number)){
//                     duplicate.put(number, 0);
//                 }
//             }
//         }
//         for (int num2: nums2){
//             if (num2 < nums2.length){
//                 int number2 = nums2[num2];
//                 if (duplicate.containsKey(number2)){
//                     duplicate.put(number2, duplicate.get(number2) + 1);
//                 }
//             }
//         }
//         for (int num3: nums3){
//             if (num3 < nums3.length){
//                 int number3 = nums3[num3];
//                 if (duplicate.containsKey(number3)){
//                     duplicate.put(number3, duplicate.get(number3) + 1);
//                 }
//             }
//         }
//         for (int keyVal : duplicate.keySet()){
//             if (duplicate.get(keyVal) > 0){
//                 correct.add(keyVal);
//             }
//         }
//         return correct;
//     }
// }
