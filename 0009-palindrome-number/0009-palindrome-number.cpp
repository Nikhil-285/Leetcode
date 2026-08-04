class Solution {
public:
    bool isPalindrome(int x) {
        long temp = x; 
        long num = 0; 
        while(temp>0){
            num = temp%10 + (num*10);
            temp = temp/10;  
        }
        if(num == x){
            return true; 
        }
        else return false; 

    }
};