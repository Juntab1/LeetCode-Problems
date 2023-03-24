// SO MUCH EASIER USING RECURSION!!!!!!!!!
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color){return image;}
        // need to keep track of the image, starting points, changing color and most likely whatever the color of the original is at
        int originalColor = image[sr][sc];
        helper(image,sr,sc,color,originalColor);
        return image;
    }

    private void helper(int[][] image, int sr, int sc, int color, int originalColor){
        if (0 <= sr && sr < image.length && 0 <= sc && sc < image[0].length && image[sr][sc] == originalColor){
            image[sr][sc] = color;
            helper(image, sr-1, sc, color, originalColor);
            helper(image, sr, sc-1, color, originalColor);
            helper(image, sr+1, sc, color, originalColor);
            helper(image, sr, sc+1, color, originalColor);
        }
    }
}



// tried it iterativly but it was not fun doing it this way.
// Queue<ArrayList<Integer>> q = new LinkedList<>();
        // List<Integer> change = new ArrayList<>();
        // q.add(sr);
        // q.add(sc);
        // while (!q.isEmpty()){
        //     int size = q.size()/2;
        //     List<Integer> points = new ArrayList<>(); 
        //     for (int i = 0; i < size; i++){
        //         int first = q.remove();
        //         int second = q.remove();
        //         int value = image[first][second];
        //         if (0 <= first && first <= image.size() && 0 <= second && second <= image[second].size()){
        //             if (value == image[first-1][second]){
        //                 image[first-1][second] = color;
        //                 q.add(first-1);
        //                 q.add(second);
        //             }
        //             else if (value == image[first][second-1]){
        //                image[first][second-1] = color; 
        //                q.add(first);
        //                q.add(second-1);
        //             }
        //             else if (value == image[first+1][second]){
        //                image[first+1][second] = color; 
        //                q.add(first+1);
        //                q.add(second);
        //             }
        //             else if (value == image[first][second+1]){
        //                image[first][second+1] = color; 
        //                q.add(first);
        //                q.add(second+1);
        //             }
        //         }
                
        //     }
        // }