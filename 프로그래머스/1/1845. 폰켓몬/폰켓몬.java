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

// 다른 사람 풀이 1
class Solution {
    public int solution(int[] nums) {

            HashSet<Integer> hs = new HashSet<>();

            for(int i =0; i<nums.length;i++) {
                hs.add(nums[i]);
            }

            if(hs.size()>nums.length/2)
                return nums.length/2;

            return hs.size();
    }
}
