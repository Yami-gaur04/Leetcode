class Solution {
    public int countKeyChanges(String s) {
      
      
        int p = 0;

        int l = s.length();
      
       for (int i = 1; i < s.length(); i++) {

           int m = s.charAt(i - 1);
           int n = s.charAt(i);

            if(n<=90 && n>=65 ){
             n = n+32;
            }
            if (m>= 65 && m<= 90) {
                m = m + 32;
             
             }

             if(n!= m){
                p++;
             }
           
        
    }
    return p;
    
    }
    }
    