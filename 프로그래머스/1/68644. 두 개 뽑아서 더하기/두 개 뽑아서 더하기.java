import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 배열에서 두 수를 선택하는 모든 경우의 수를 구한다.
        // 위에서 구한 수를 새로운 배열에 저장하고 중복값을 제거한다.
        // 배열을 오름차순으로 정렬하고 반환한다.
        
        HashSet<Integer> set = new HashSet<>();
        
        // 배열에서 두 수를 선택하는 방법
        // 각 수에서 자신보다 뒤에 있는 수를 선택하면 됨. 빠짐없이 선택가능.
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}