class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max_row = 0;
        int max_ones = 0;
        for (int i = 0 ; i< mat.length ;i++){
            int count = 0;
            for( int j = 0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if (count> max_ones){
                max_ones = count;
                max_row = i;
            }
        }

        return new int[]{max_row, max_ones};
        
    }
}