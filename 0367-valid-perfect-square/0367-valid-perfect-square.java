class Solution {
    public boolean isPerfectSquare(int num) {
     boolean m = false;
        for (long i = 1; i<=num ; i++){
            if (i*i == num){
            m = true;
            break;
        }
        else {
            m = false;
        }
        
        
    }

    return m;
    }
}
