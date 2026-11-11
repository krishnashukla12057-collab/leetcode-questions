class Solution {
    public int minMoves(int[] nums) {
        int n =nums.length;
        int min=nums[0];
        for(int i=0;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans= ans+(nums[i]-min);
        }
        return ans;
    }
}