package test;
// 배열을 List로 변환 :
// List를 배열로 변환 :
// *주의 : 스트링배열을 명령어 한줄로 쉽게 변환이 가능하다.
//        하지만, 프리미티브 타입 int배열을 for문을 돌려서 변환해야한다. why?

// int와 integer의 차이점 -> wrapper class
import java.util.ArrayList;
import java.util.Arrays;

public class N14_어레이리스트를인트배열 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int[] ret = new int[list.size()]; // 새로운 고정배열을 생성
        for(int i=0;i<ret.length;i++){ // 만들어진 배열을 순회하면서 어레이리스트에서 값을 꺼내서 int로 언박싱해서 저장
            ret[i] = list.get(i).intValue();
        }
        System.out.println(Arrays.toString(ret));
        System.out.println();

    }
}
