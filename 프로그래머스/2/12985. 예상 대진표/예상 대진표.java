class Solution {
    public int solution(int n, int a, int b) {
        int answer;
        
        // a와 b가 다르면 answer++
        for(answer = 0; a != b; answer++) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        
        return answer;
    }
}