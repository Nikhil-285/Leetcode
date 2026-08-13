class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        while(i<nums.length){
            //TO handle boundary values
          if(i==0){
            if( nums.length==1 || nums[0]>nums[1])
            return 0;
          }else if(i==nums.length-1){
            if(nums[i]>nums[i-1])
            return i;
          }else{
               if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                
                return i;
             
            }
                
            
          }
          i++;
            
          
        }
        
        return -1;
    }
}