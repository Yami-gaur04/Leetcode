class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        int duplicate = 0;
        int actual = (n*(n+1))/2;
        int left = 0;
        
        for (int i =0 ;i<n-1; i++){
            if(nums[i]== nums[i+1]){
                duplicate = nums[i];
            }
            else{
                sum = sum+ nums[i];}

            }
       
        sum = sum + nums[n - 1];  
        left = actual - sum ;  
        int[] myarr = {duplicate , left};
        return myarr;
        }
        
    }
