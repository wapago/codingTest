import java.lang.NumberFormatException;

class Solution {
    public boolean solution(String s) {
        String[] strArr = s.split("");
        
        if(strArr.length != 4 && strArr.length != 6) return false;
        
        for(int i=0; i<strArr.length; i++) {
            try{
                int num = Integer.parseInt(strArr[i]);    
            }catch(NumberFormatException nfe) {
                return false;
            }
        }
        
        return true;
    }
}