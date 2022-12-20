package studyalgorithm.programmers;
import java.util.Arrays;

// 차원변환 : 2차원 -> 1차원
// 완전탐색이란 -> 브루트포스(모든경우의수를 세는것)
// 다른사람들 소스보기
public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int setWidth = 0; // 가장 큰 가로를 찾는다.
        int setHeight = 0; // 가장 큰 세로를 찾는다.
        for(int[] size : sizes){

            // 세로길이 구하기
            for(int num : size) {
                if(num >= setWidth){
                    setWidth = num;
                }
            }

            // 가로길이 구하기
            if(size[0] >= size[1]){
                if(size[1] >= setHeight){
                    setHeight=size[1];
                }
            } else {
                if(size[0] >= setHeight){
                    setHeight=size[0];
                }
            }
        }
        // 최대길이를 구함
        answer = setHeight * setWidth;

        return answer;
    }

    public static void main(String[] args) {
        최소직사각형 a = new 최소직사각형();
        int[][] input1 = {{60,50},{30,70},{60,30},{80,40}};
        int answer1 = a.solution(input1);
        System.out.println(answer1);
//        int[][] input2 = {{10, 7},{12, 3},{8, 15},{14, 7},{5, 15}};
//        int answer2 = a.solution(input2);
//        System.out.println(answer2);
//        int[][] input3 = {{14, 4},{19, 6},{6, 16},{18, 7},{7, 11}};
//        int answer3 = a.solution(input3);
//        System.out.println(answer3);
    }
}
