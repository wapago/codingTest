class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(my_string.length() >= is_prefix.length()) {
            String[] strArr = my_string.split("");
            String[] prefixArr = is_prefix.split("");
            int cnt = 0;
            
            for(int i=0; i<prefixArr.length; i++) {
                if(strArr[i].equals(prefixArr[i])) {
                    cnt++;
                }
            }
            
            if(cnt == prefixArr.length) {
                return 1;
            }
        }
        
        return answer;
    }
}