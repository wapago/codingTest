import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        // 1. 수포자들의 패턴
        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        // 2. 수포자들의 점수를 저장할 배열
        int[] scores = new int[3];
        
        // 3. 각 수포자의 패턴과 정답이 얼마나 일치하는지 확인
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < pattern.length; j++) {
                // ※정답패턴의 길이가 수포자의 답안길이보다 긴 경우, 정답패턴의 처음데이터와 다시 비교할 수 있도록 나머지 연산자 사용
                if(answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        // 4. 가장 높은 점수 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        // 5. 가장 높은 점수를 가진 수포자들의 번호를 찾아서 리스트에 담음
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}