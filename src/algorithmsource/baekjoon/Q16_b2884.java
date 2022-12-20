package studyalgorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class AlarmSolve {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        // 시간을 나타내보자.
        // 1. 분을 뺀다. -> if처리가 필요한 상황 : SubtractionMinute이 음수 일 때,
//        int subtractionMinute = minute - 45;
//        if(subtractionMinute < 0) {
//            subtractionMinute = 60 + subtractionMinute;
//            hour = hour - 1;
//            if(hour < 0) {
//                hour = 23;
//            }
//        }
//        minute = subtractionMinute;

        // 리팩토링 -> 맨 마지막이 아닌 경우를 위에서 나열하고 각각 처리
        // minute이 45보다 작아서 음수가 될때
        if((minute - 45) < 0){
            minute = minute + 60;
            hour = hour - 1;
        }
        if(hour < 0){
            hour = 23;
        }
        System.out.println(hour+" "+(minute-45));
    }
}

public class Q16_b2884 {
    public static void main(String[] args) throws IOException {
        AlarmSolve.solve();
    }
}
