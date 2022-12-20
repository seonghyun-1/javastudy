package studyalgorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18_b2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st1.nextToken());
        int minute = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int addMinute = Integer.parseInt(st2.nextToken());
        int devidedMinute = addMinute % 60;
        int devidedHour = addMinute / 60;

        // minute 더하기
        if( minute + devidedMinute >= 60) {
            minute = ( minute + devidedMinute ) % 60;
            hour = hour+1;
        } else {
            minute = ( minute + devidedMinute);
        }

        // hour 더하기
        if( hour + devidedHour >= 24){
            hour = hour + devidedHour - 24;
        } else {
            hour = hour + devidedHour;
        }

        System.out.println(hour+" "+minute);
    }
}
