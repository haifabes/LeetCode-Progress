/* Code for first bad verison in leet code but done recursively*/

public class Solution : VersionControl {
    
    public int recursiveSolution(int left, int right){
            
		/* check if right depases left at any point*/
            if(right>left){

                int mid = (right+left)/2;

                if(IsBadVersion(mid)==true){
                    return recursiveSolution(left,mid);
                }
                else{
                    return recursiveSolution(mid+1,right);
                }         
            }
            /* if it does that means that we only have one item left on our array so it must be the first bad version, we check before returning it tho by adding and if clause in the posible chance that the array has no bad versions*/
            else{
                return left;
            }
        }
    
    public int FirstBadVersion(int n) {
        
        int firstBad;
        
        firstBad= recursiveSolution(1,n);
        return firstBad;
        
    }
}