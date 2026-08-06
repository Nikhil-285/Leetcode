class Solution {
    public boolean isPowerOfTwo(int n) {
   
     if(divison(n)){
        return true;
     } 
     return false;
    }
    public static boolean divison(int x){
        if(x==1){
            return true;
        }
        if(x<=0 || x%2!=0){
            return false;
        }
        return divison(x/2);
    }
}