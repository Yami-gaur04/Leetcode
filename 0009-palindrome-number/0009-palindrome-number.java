class Solution {
    public boolean isPalindrome(int x) {
        int b = x;
        int c = 0;

        if (x<0){
            return false;
        }

        while (b>0){
             int dig = b % 10;
             c = c*10 + dig;
             b= b/10;
        }
        if (c==x){
            return true;
        }else{
            return false;
        }
        
    }

}