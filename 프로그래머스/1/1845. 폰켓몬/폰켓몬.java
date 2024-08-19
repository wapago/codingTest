import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int targetNum = nums.length / 2;

        Integer[] integerArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(integerArr));

        if(targetNum <= set.size()) {
            return targetNum;
        }

        return set.size();
    }
}