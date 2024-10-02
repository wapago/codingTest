class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        
        if(num % 2 != 0) {
            // total / num 의 값이 가운데 인덱스의 값이 된다.
            // 가운데 인덱스 : (num / 2) - 1
            int middleIdx = (num / 2);
            answer[middleIdx] = total / num;
            
            for(int i = middleIdx - 1; i >= 0; i--) {
                answer[i] = answer[i+1] - 1;
            }
            
            for(int i = middleIdx + 1; i < answer.length; i++) {
                answer[i] = answer[i-1] + 1;
            }
        }
        
        // (num / 2)의 값이 가운데 값의 첫번째 값.
        if(num % 2 == 0) {
            int middleFirstIdx = (num / 2) - 1;
            int middleSecondIdx = (num / 2);
            
            answer[middleFirstIdx] = total / num;
            answer[middleSecondIdx] = (total / num) + 1;
            
            for(int i = middleFirstIdx - 1; i >= 0; i--) {
                answer[i] = answer[i+1] - 1;
            }
            
            for(int i = middleSecondIdx + 1; i < answer.length; i++) {
                answer[i] = answer[i-1] + 1;
            }
        }
        
        return answer;
    }
}