package studyalgorithm.programmers;

import java.util.Arrays;

// 오름차순활용
public class 로또최고순위최저순위 {

    private int setRank(int num){
        switch(num) {
            case 0:
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 7;
        }
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int zeroCount = 0;
        int sameCount = 0;
//        int[] rank = {6,5,4,3,2,1};

        // 배열을 오름차순정리한다.
        // 두 배열의 같은 수가 몇개인지 먼저 비교한다. & 0의 갯수를 센다.

        for(int myNum : lottos){
            if(myNum == 0){
                zeroCount++;
                continue;
            }
            for(int loNum : win_nums){
                if(myNum == loNum){
                    sameCount++;
                    break;
                }
            }
        }

        // 같은 수의 갯수를 카운트해서 랭크에 대입시키면 최소수가 도출된다.
        // 같은 수를 알게되었을때 0의 갯수를 모두 다 카운트해서 랭크에 대입시키면 같은수의 갯수에 더하면 최대수

        int minNum = sameCount;
        int maxNum = sameCount + zeroCount;
        int maxNumRank = setRank(maxNum);
        int minNumRank = setRank(minNum);
        // 같은 수가 6개면 -> 랭크 1반환
        // 같은 수가 5개면 -> 랭크 2반환
        // 같은 수가 4개면 -> 랭크 3반환
        // 같은 수가 3개면 -> 랭크 4반환
        // 같은 수가 2개면 -> 랭크 5반환
        // 같은수가 1개 또는 0개면 -> 랭크 6반환




        int[] answer = { maxNumRank, minNumRank};
        return answer;
    }
    public static void main(String[] args) {
        로또최고순위최저순위 a = new 로또최고순위최저순위();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = a.solution(lottos,win_nums);
        System.out.println(Arrays.toString(answer));
    }
}
