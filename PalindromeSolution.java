// From 11:38 to 12:11

class PalindromeSolution {
    public boolean isPalindrome(int x) {
        
        String s = Integer.toString(x);
        String reverse_s="" ;
     
        for (int i=s.length()-1 ; i>=0 ; --i){
            reverse_s= reverse_s+s.charAt(i);
        }
        
      
        return (s.equals(reverse_s));
    }
}
