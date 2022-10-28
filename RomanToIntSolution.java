//22:27 to 23:11


import java.util.*;
class RomanToIntSolution {
    public int romanToInt(String s) {
        
        Map<Character, Integer>  roman= new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int sum = (roman.get(s.charAt(s.length() - 1)));
        
        
        for (int i = s.length() - 2; i >= 0; i--) {
            
            char c = s.charAt(i);
       
            
                
            if ((c == 'C') && ((s.charAt(i+1) == 'D')||(s.charAt(i+1) == 'M')) ){
                sum = sum - (roman.get(c));
                    
            }
            
            else if ((c == 'X') && ((s.charAt(i+1) == 'L')||(s.charAt(i+1) == 'C'))){
                sum = sum - (roman.get(c));
            }
            
            else if ((c == 'I') && ((s.charAt(i+1) == 'X')||(s.charAt(i+1) == 'V'))){
                sum = sum - (roman.get(c));
            }
            else{
                sum = sum + (roman.get(c)); 
            }

        }
        
    return sum;
            

         
    }
        
    
}
   
