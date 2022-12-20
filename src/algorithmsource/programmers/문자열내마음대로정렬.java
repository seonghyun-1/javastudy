package studyalgorithm.programmers;

import java.util.Arrays;

// 문제를 구조적으로 분해하기 -> 문자열정렬하는방법?
// 문자열 배열 정렬?
// 문자열의 특정단어 접근 및 특정단어 기준으로 문자열 정렬
// 1. 각 문자열의 특정단어에 접근한다.
// 2. 각 문자열의 특정단어를 기준으로 나열한다.
// 3. 같은 특정단어가 있다면 사전순으로 정렬한다.

public class 문자열내마음대로정렬 {
    public String[] solution(String[] strings, int n) {



        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        문자열내마음대로정렬 a = new 문자열내마음대로정렬();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] answer = a.solution(strings,n);
        System.out.println(Arrays.toString(answer));

    }
}
