class Solution {
    public int maxArea(int[] heights) {

        int left = 0;

       // int area = 0;
        int maxa = 0;

        int right = heights.length - 1;

        while(left < right){

            int area = Math.min(heights[left], heights[right]) * (right - left);

             maxa = Math.max(maxa, area);

            if(heights[left] <= heights[right]){
                left++;
            }
            else{
                 right--;
            }

        }
        return maxa;
        
    }
}
