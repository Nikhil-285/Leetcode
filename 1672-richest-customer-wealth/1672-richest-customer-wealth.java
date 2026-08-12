class Solution {
    public int maximumWealth(int[][] accounts) {
        int money=0;
        int maxx=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
              money+=accounts[i][j];
              maxx=Math.max(money,maxx);
              
            }
            money=0;
        }
         return maxx;
    }
   
}