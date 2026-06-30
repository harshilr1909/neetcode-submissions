class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while(left < right){
            int currArea = 0;
            currArea = Math.min(heights[left],heights[right])*(right - left);
            if(maxArea < currArea){
                maxArea = currArea;
            }
            if(heights[left]<heights[right]){
                left+=1;
            }else{
                right-=1;
            }
            
        }
        return maxArea;
    }
}
