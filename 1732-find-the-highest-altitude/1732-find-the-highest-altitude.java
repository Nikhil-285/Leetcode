class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int maxx=0;
        
        for(int i=0;i<gain.length;i++){
           
            sum+=gain[i];
            maxx=Math.max(maxx,sum);
        }
        return maxx;
    }
}