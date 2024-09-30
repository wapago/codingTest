import java.lang.StringBuilder;

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        
        System.out.println(stringBuilder);
        
        return stringBuilder.toString();
    }
}