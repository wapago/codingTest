import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        
        // 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        // beginIndex위치에서 시작하여 endIndex 전 위치까지의 값을 리턴한다.
        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        
        return true;
    }
//     public boolean solution(String[] phone_book) {
//         Arrays.sort(phone_book);
        
//         for(int i=0; i<phone_book.length-1; i++) {
//             if(phone_book[i+1].startsWith(phone_book[i])) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
}