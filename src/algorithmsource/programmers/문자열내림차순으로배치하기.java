package studyalgorithm.programmers;

// <NOTE>
// ** 문자열 비교 ** : compareTo
// System.out.println("a".compareTo("A")); // 양수 32가 나왔다는 것은 a가 A보다 크다는 의미이다.
// 소문자가 대문자보다 아스키 코드가 크다. A : 65, a : 97
// 즉, 오름차순시 대문자A가 먼저나오고 내림차순시 소문자z가 먼저나온다.

// ** 문자열 접근 ** : 아스키 코드로 비교
//for(int i=0;i<s.length();i++){
//    System.out.println(s.charAt(i)+":"+(int)s.charAt(i));
//}

// 두가지 풀이 : 문자열을 배열로 만들어서 풀이 / 문자열을 조작해서 풀이

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class 문자열내림차순으로배치하기 {
    public String solution(String s) {

        // 주어진 s를 배열로 변환해서 저장한다.
        String[] words = s.split(""); // [Z, b, c, d, e, f, g]
        // 주어진 문자들을 아스키 값을로 바꿔서 크기비교를 수행한다. || compareTo함수를 이용한다.

        // # 정렬
        // 정렬 시에 어레이리스트로 변환 후 Collections라이브러리의 내림차순 메소드를 사용해서 문제를 해결함
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) list.add(s.charAt(i));
        Collections.sort(list,Collections.reverseOrder());

        // # StringBuilder대신 String을 사용해서 문제를 해결함
        String answer = "";
        for(int i=0;i<list.size();i++) answer = answer + list.get(i);
        return answer;
    }

    public static void main(String[] args) {
        문자열내림차순으로배치하기 a = new 문자열내림차순으로배치하기();
        String s = "Zbcdefg";
        String answer = a.solution(s);
        System.out.println(answer);
    }
}
