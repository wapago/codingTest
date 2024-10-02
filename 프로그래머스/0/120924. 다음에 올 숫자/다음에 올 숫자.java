import java.util.HashSet;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int length  = common.length;
        int[] gap = new int[length-1];        
        
        for(int i = 0; i < length - 1; i++) {
            gap[i] = common[i+1] - common[i];
        }
        
        if(gap[0] == gap[1]) {
            answer = common[length-1] + gap[0];
        }
        
        if(gap[0] != gap[1]) {
            answer = common[length-1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}