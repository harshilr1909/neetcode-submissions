class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       //o(nlg(n))
       Arrays.sort(nums);
       for(int i = 0;i < nums.length;i++){
        if(i>0 && nums[i] == nums[i-1]) continue;
        int start = i + 1;
        int end = nums.length - 1;
        int target = -nums[i];
        while(start<end){
            if(nums[start]+nums[end]<target){
                start+=1;
            }else if(nums[start]+nums[end]>target){
                end-=1;
            }else{
                List<Integer> currAns = new ArrayList<>();
                currAns.add(nums[i]);
                currAns.add(nums[start]);
                currAns.add(nums[end]);
                ans.add(currAns);
                start+=1;
                while(nums[start]==nums[start-1] && start < end){
                    start+=1;
                }
            }
        }
       }
       return ans;
    }
}
