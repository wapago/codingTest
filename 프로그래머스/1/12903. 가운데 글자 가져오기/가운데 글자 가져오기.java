class Solution {
    public String solution(String s) {
        String[] stringArray = s.split("");
        int length = stringArray.length;
        
        if(length % 2 != 0) {
            return stringArray[length / 2];
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(stringArray[length / 2 - 1]);
        sb.append(stringArray[length / 2]);

        return sb.toString();            
    }
}