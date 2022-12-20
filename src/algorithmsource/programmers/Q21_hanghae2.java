package studyalgorithm.programmers;


import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution2 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>(); // 리스트선언
        for(int num : arr){
            if(num%divisor==0) list.add(num);
        }
        list.sort(Comparator.naturalOrder());
        // 어레이리스트 배열로 변환
        int[] answer = new int[list.size()];
        int[] noAnswer = {-1};
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i).intValue();
        }
        if(answer.length==0) return noAnswer;

        return answer;
    }
}

public class Q21_hanghae2 {
}
