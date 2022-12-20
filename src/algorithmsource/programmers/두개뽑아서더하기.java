package studyalgorithm.programmers;

// 두개의 포인터를 두고 순차적으로 덧셈을 수행해서 결과값을 중복포함해서 더하고 어레이리스트에 저장한다.
// 1) 어레이리스트를 하나 더 생성해서 중복을 제거한다. / 2) 저장된 어레이리스트를 HashSet을 통해서 중복을 제거한다.
// 1-1) 배열로 변환해서 출력

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                list.add(numbers[i]+numbers[j]);
            }
        }

        ArrayList<Integer> setList = new ArrayList<>();
        for(int num : list){
            if(!setList.contains(num)){
                setList.add(num);
            }
        }

        Collections.sort(setList);
        int[] answer = new int[setList.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = setList.get(i).intValue();
        }

        return answer;
    }

    public static void main(String[] args) {
        두개뽑아서더하기 a = new 두개뽑아서더하기();
        int[] numbers = {2,1,3,4,1};
        int[] answer = a.solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
}