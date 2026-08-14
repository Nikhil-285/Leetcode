class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int rsum=n*(n+1)/2;
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
        }
          return (rsum-tsum);
    }
}