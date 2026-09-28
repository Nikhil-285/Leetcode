class Solution {
    public int[] shuffle(int[] nums, int n) {
        int first[]=new int[n];
        int second[]=new int[n];
        int ans[]=new int[nums.length];
        int j=0;
      int k=0;
      
      for(int i=0;i<nums.length;i++){
        
         if(i<n){
            first[j]=nums[i];
            j++;
         }else{
            second[k]=nums[i];
            k++;
         }
      } 
        j=0;
         k=0; 
      for(int i=0;i<nums.length;i+=2){
       
        ans[i]=first[j];
        j++;
        ans[i+1]=second[k];
        k++;
      } 
      return ans;
    }
}