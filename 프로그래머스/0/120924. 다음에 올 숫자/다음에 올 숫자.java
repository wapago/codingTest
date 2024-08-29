class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int[] differenceArr = new int[common.length-1];
        int difference = 0;
        
        // 원소의 뺄셈을 해본다
        for(int i=1; i<common.length; i++) {
            differenceArr[i-1] = common[i] - common[i-1];
        }
        
        // 차이가 같은지 다른지 본다
        for(int i=0; i<differenceArr.length-1; i++) {
            if(differenceArr[i] == differenceArr[i+1]) {
                difference = differenceArr[i];
                // 같으면 차이만큼 더하여 구한다
                return common[common.length-1] + difference;
            }
            
            difference = differenceArr[i+1] / differenceArr[i];
        }
        
        return common[common.length-1] * difference;
    }
}