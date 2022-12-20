package studyalgorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class LeapYear {
    public static int solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        // / - 나누기, % - 나머지

        // 디자인패턴
        // 참이 아닌것으로 검증하고
        // 마지막에 참을 출력하기
        if(year%4 != 0){
            return 0;
        }

        if( year%100==0 && year%400!=0){
            return 0;
        }

        return 1;
    }
}

public class Q13_b2753 {
    public static void main(String[] args) throws IOException{
        System.out.println(LeapYear.solve());
    }
}
