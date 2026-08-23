class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
      for(int i=0;i<nums.length;i++){
        int digits=0;
       
          String str=Integer.toString(nums[i]);
          for(int j=0;j<str.length();j++){
            digits++;
          }
          if(digits%2==0){
            count++;
          }
      }
      return count;
    }
}