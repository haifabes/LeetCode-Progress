// 15:30 to 15:42

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersionSolution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid =0;
        
        while ( left<= right){
            
            mid = (int)Math.floor((left + right)/2); 
            
            if(isBadVersion(mid)== true){
                right = mid -1;
            }
            else {
                left = mid+1;
            }
                        
        }
        return mid;
    }
}