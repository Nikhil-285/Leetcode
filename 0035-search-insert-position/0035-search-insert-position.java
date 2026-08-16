class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        int mid=0;
       
        while(beg<=end && nums[mid]!=target){
            mid=beg+(end-beg)/2;
            if( target >nums[mid]){
                beg=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(nums[mid]==target){
            return mid;
        }
       
        return beg;
    }
}