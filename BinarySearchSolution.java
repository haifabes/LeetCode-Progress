// 15:05 to 15:18

class BinarySearchSolution {
    public int search(int[] nums, int target) {
        
        int size = nums.length;
        int left = 0;
        int right = size-1;
        
        while(left <= right){
            
            int mid = (int)Math.floor((left + right)/2);
            
            if(nums[mid] < target){
                left = mid+1;
            }
            else if(nums[mid] > target ){
                right = mid-1;
            }
            else{
                return mid;
            }
        }
        
     return -1;  
    }
}