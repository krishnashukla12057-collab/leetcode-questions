class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int opr=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }
        for(int i=0;i<nums.length;i++){
            opr+=nums[i]-min;
        }
        return opr;
    }
}