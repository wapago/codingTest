import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // Enter/Leave 메시지를 저장할 해시맵 생성
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");
        
        HashMap<String, String> uid = new HashMap<>();
        
        // 1. record의 각 줄을 하나씩 처리
        for(String s : record) {
            String[] cmd = s.split(" ");
            if(cmd.length == 3) { // 2. Enter 또는 Change인 경우
                uid.put(cmd[1], cmd[2]); // 같은 키를 가지면 덮어쓰기한다.
            }
        }
        
        // 답을 저장할 answer List 생성
        ArrayList<String> answer = new ArrayList<>();
        
        // 3. record의 각 줄을 하나씩 처리
        for(String s : record) {
            String[] cmd = s.split(" ");
            // 4. 각 상태에 맞는 메시지를 answer에 저장
            if(msg.containsKey(cmd[0])) { // cmd[0].equals() 를 쓰는 것이 아니라 역으로 msg에 있는 key값을 기준으로 비교하기
                answer.add(uid.get(cmd[1]) + msg.get(cmd[0]));
            }
        }
        
        return answer.toArray(new String[0]);
    }
}