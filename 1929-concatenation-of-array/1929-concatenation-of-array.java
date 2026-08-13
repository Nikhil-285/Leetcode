class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int combo[]=new int[2*nums.length];
        for(int i=0;i<n;i++){
            combo[i]=nums[i];
            combo[i+n]=nums[i];
        }
        
        return combo;
    }
}