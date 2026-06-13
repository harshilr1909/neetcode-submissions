class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int matr[][] = new int[nums.length][2];
      int ans[] = new int [k];
      int freq = 1;
      int j = 0;

      Arrays.sort(nums);
      int prev = nums[0];

      for(int i = 1;i<nums.length;i++){
        if(nums[i] == prev){
            freq++;
        }else{
            matr[j][0] = freq;
            matr[j][1] = prev;
            prev = nums[i];
            freq = 1;
            j++;
        }
      }
         matr[j][0] = freq;
        matr[j][1] = prev;

        Arrays.sort(matr,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i = 0;i<k;i++){
            ans[i] = matr[nums.length-1-i][1];
        }
        return ans;
    }
}
