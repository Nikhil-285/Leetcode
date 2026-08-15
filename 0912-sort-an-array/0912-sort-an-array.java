class Solution {
    public int[] sortArray(int[] nums) {
         Mergesort(nums,0,nums.length-1);
         return nums;      
    }
     public static void Mergesort(int nums[],int si,int ei){
    //base
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    Mergesort(nums,si,mid);
    Mergesort(nums,mid+1,ei);
    Merge(nums,mid,si,ei);
   }
   public static void Merge(int nums[],int mid,int si,int ei){
    int temp[]=new int[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=ei){
        if(nums[i]<nums[j]){
            temp[k]=nums[i];
            k++;
            i++;
        }else{
            temp[k]=nums[j];
            k++;
            j++;
        }
    }
    ///corner case
    while(i<=mid){
        temp[k++]=nums[i++];
        }
        while(j<=ei){
         temp[k++]=nums[j++];
            
    }
     for(i=si,k=0;k<temp.length;i++,k++){
        nums[i]=temp[k];
    }
   
    }
}
   
   
