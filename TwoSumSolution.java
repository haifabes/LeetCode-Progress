// From 12:17 to 12:44

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        
       
        int[] sol = {0,0};
        
        
        for (int i = 0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    sol[0]=i;
                    sol[1]=j;
                    
                }
            }
        }
        return sol;
    }
}
