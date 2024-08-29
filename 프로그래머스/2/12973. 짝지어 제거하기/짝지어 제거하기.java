import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);   // 주어진 문자열을 charAt()을 통해 인덱스를 매길 수 있다.

            if(!stack.isEmpty() && stack.peek() == c) { // Stack의 peek()은 원본 Stack을 유지하면서 값만 비교할 수 있다.
                stack.pop();
            }else { // i=0일 때, 일단 empty. 일부러 이렇게 시작해서 첫 글자를 stack에 넣어 비교 시작.
                stack.push(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}