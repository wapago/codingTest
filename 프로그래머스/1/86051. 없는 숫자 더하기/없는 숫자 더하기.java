class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean isPresent = false;
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i == numbers[j]) {
                    isPresent = true;
                }
            }
            
            if(!isPresent) {
                System.out.println(i);
                answer = answer + i;
            }
                
            isPresent = false;
        }
        
        return answer;
    }
}