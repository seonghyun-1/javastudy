package studyalgorithm.programmers;
import java.lang.StringBuilder;
// int를 String으로 변환 : String.valueOf(int a);
// String을 int로 변환 : Integer.valueOf(String s);

// n진수 -> 10진수 변환 : Integer.parse(x, n);

// note : 자바에서 진법 문제를 풀때는 while문안에서 나오는 진수
//        왜냐하면 String에 덧셈을 할때 위치를 어떻게 바꾸느냐에 따라서 역으로
//        혹은 순으로 변환할 수 있기때문이다.

public class 문제3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        String sn = "";
        while(n>0){
//            sn = n%3 + sn;
            sn = sn + n%3;
            n=n/3;
        }
        answer = Integer.parseInt(sn, 3); // 이때 sn은 문자열
        return answer;
    }

    public static void main(String[] args) {
        문제3진법뒤집기 a = new 문제3진법뒤집기();
        int answer = a.solution(125);
        System.out.println(answer);
    }

}
