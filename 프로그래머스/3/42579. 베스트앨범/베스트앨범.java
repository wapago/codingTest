import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 베스트 앨범에 들어갈 노래의 고유 번호를 저장할 리스트
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 각 장르별로 노래의 총 재생횟수를 저장할 해시맵
        HashMap<String, Integer> num = new HashMap<>();
        
        // 각 장르에 속하는 각 노래의 고유 번호와 재생 횟수를 저장할 해시맵의 해시맵
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        
        for(int i=0; i<plays.length; i++) {
            // genres 배열을 순회하며 각 노래에 대한 정보를 수집
            if(!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            }else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }
        
        // num 해시맵의 키셋(장르명)을 리스트로 변환(정렬하기 위해)
        List<String> keySet = new ArrayList(num.keySet());
        
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));
        
        for(String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
            
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
            
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}