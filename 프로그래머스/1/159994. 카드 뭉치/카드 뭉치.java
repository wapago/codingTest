import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards와 goal을 deque로 변환
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));
        
        // goalDeque에 문자열이 남아 있으면 계속 반복
        while(!goalDeque.isEmpty()) {
            if(!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            }else if(!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            }else {
                break;
            }
        }
        
        return goalDeque.isEmpty() ? "Yes" : "No";
        
        
//         Queue<String> cards1Queue = new ArrayDeque<>();
//         Queue<String> cards2Queue = new ArrayDeque<>();        
        
//         for(int i=0; i<cards1.length; i++) {
//             cards1Queue.add(cards1[i]);
//         }
        
//         for(int i=0; i<cards2.length; i++) {
//             cards2Queue.add(cards2[i]);
//         }
        
//         for(int i=0; i<goal.length; i++) {
//             if(cards1Queue.size() != 0 && cards1Queue.peek().equals(goal[i])) {
//                 cards1Queue.poll();
//             }else if(cards2Queue.size() != 0 && cards2Queue.peek().equals(goal[i])) {
//                 cards2Queue.poll();
//             }
//         }
        
//         if(cards1Queue.size() == 0 && cards1Queue.size() == 0) {
//             return "Yes";
//         }
        
//         return "No";
    }
}