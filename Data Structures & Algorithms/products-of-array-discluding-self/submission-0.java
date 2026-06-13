class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            int product = 1;
            int j = 0;
            while(j != i){
                product *= nums[j];
                j++;
            }
            j++;
            while(j <= nums.length-1){
                product *= nums[j];
                j++;
            }
            ans[i] = product;
        }
        return ans;
    }
}  
