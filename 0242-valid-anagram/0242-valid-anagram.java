//STILL NEED TO FINND THE OPTIMAL SOLUTION

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length()){
            char stoArray[]=s.toCharArray();
            char tToArray[]=t.toCharArray();
            
            Arrays.sort(stoArray);
            Arrays.sort(tToArray);

            if(Arrays.equals(stoArray,tToArray)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}