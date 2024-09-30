import java.util.*;

class Solution {
    private static final String ENTER_FORMAT = "%s님이 들어왔습니다.";
    private static final String LEAVE_FORMAT = "%s님이 나갔습니다.";
    
    private HashMap<String, UserInfo> userMap = new HashMap<>();
    
    private class UserInfo {
        public String userId;
        public String nickName;
        
        public UserInfo(String userId, String nickName) {
            this.userId = userId;
            this.nickName = nickName;
        }
    }
    
    private class Command {
        public char command;
        public String userId;
        
        public Command(char command, String userName) {
            this.command = command;
            this.userId = userName;
        }
    }
    
    public String[] solution(String[] record) {
        ArrayList<Command> commandList = new ArrayList<>();
        
        for(String rec : record) {
            String[] split = rec.split(" ");
            String command = split[0];
            String userId = split[1];
            String nickName = null;
            
            switch(command.charAt(0)) {
                case 'E':
                    nickName = split[2];
                    if(userMap.containsKey(userId) == false) {
                        userMap.put(userId, new UserInfo(userId, nickName));
                    }else {
                        userMap.get(userId).nickName = nickName;
                    }
                    
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'L':
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'C':
                    nickName = split[2];
                    userMap.get(userId).nickName = nickName;
                    break;
            }
        }
        
        return commandList.stream()
            .map(cmd -> String.format(cmd.command == 'E' ? ENTER_FORMAT : LEAVE_FORMAT , userMap.get(cmd.userId).nickName))
            .toArray(ary -> new String[commandList.size()]);
    }
}