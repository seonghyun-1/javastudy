package studyalgorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q19_b2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int price = 0;

        if(num1 == num2 && num2 == num3){
            price = 10000 + (num1*1000);
        }

        if(
                ((num1 == num2) && (num2 != num3) )
                || ((num1 == num3) && (num1 != num2))
                || ((num2 == num3) && (num1 != num2))
        )
        {
            if(num1 == num2){
                price = 1000 + (num1 * 100);
            }
            if(num1 == num3){
                price = 1000 + (num1 * 100);
            }
            if(num2 == num3){
                price = 1000 + (num2 * 100);
            }
        }

        if( (num1 > num2) && (num1 > num3) ){
            price = num1 * 100;
        }
        if( (num2 > num1) && (num2 > num3) ){
            price = num2 * 100;
        }
        if( (num3 > num1) && (num3 > num2) ){
            price = num3 * 100;
        }
    }
}
