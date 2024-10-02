import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            System.out.println(num);
            set.add(num);
        }
        
        int targetTypeCount = (nums.length / 2);    // 가질 수 있는 종류의 수
        
        if(targetTypeCount >= set.size()) return set.size();
        
        // return (set.size() * (set.size() - 1)) / 2;
        return targetTypeCount;
    }
}