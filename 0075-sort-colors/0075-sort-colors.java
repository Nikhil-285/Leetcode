class Solution {
    public void sortColors(int[] nums) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);
        }
        //count array
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
             nums[j]=i;
             j++;
             count[i]--;
            }
        }
        //Prinnt array
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}