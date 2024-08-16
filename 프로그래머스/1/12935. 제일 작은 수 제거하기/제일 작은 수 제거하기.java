import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        
        List<Integer> arrayToList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            arrayToList.add(arr[i]);
        }
        
        Integer minValue = arrayToList.stream()
            .mapToInt(x -> x)
            .min()
            .orElse(0);
        
        for(int j=0; j<arrayToList.size(); j++) {
            if(arrayToList.get(j) == minValue)
                arrayToList.remove(j);
        }
        
        int[] listToArray = new int[arrayToList.size()];
        
        for(int k=0; k<arrayToList.size(); k++) {
            listToArray[k] = arrayToList.get(k);
        }
        
        return listToArray;
    }
}