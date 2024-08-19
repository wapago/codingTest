import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}

// 틀린풀이 추가 : 시간초과
class Solution {
    public boolean solution(String[] phone_book) {
        
        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book.length; j++) {
                if(phone_book[i].equals(phone_book[j])) {
                    continue;
                }
                
                if(phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
