package studygrammar.StringStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 예제 {
    public static void main(String[] args) {
        int one = 100;
        int two = 80;
        int three = 80;
        // 최고 작은 사람의 점수를 반환, 점수가 중복되면 두명을 반환한다.

        // 콜렉션 어레이리스트를 활용해서 메소드중에 최소값, 최대값을 뽑고
        // 리스트 세트로 만들어서 밸류가 최소값이랑 일치하는 것을 뽑는다.
        List<Integer> list = new ArrayList<Integer>();
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println(Collections.min(list));
        // indexOf
        for(int num : list){

        }


        String[] answer = {"two","three"};
    }
}
