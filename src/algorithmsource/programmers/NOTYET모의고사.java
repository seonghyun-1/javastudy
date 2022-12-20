package studyalgorithm.programmers;

// 배열적 사고를 나타냄

import java.util.Arrays;
import java.util.HashMap;

public class NOTYET모의고사 {
    public int[] solution(int[] answers) {
        // #문제파악
        // answers는 1번문제부터 최대 10000번까지 주어진 답안
        // 가장 많은 문제를 맞힌 사람이 누구인지 return
        // -> 맞춘 갯수가 같은 사람이 있는 경우 순차적으로 리턴, 다르면 가장많이 맞춘사람 한명만 리턴

        // 1,2,3번 수포자의 답안배열패턴
        int[] one_pattern = {1, 2, 3, 4, 5};
        int[] two_pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three_pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // #실행계획
        // answers 배열 길이에 맞게 1,2,3번 답안배열패턴을 이용한 배열생성
        int[] one_answer = new int[answers.length];
        int[] two_answer = new int[answers.length];
        int[] three_answer = new int[answers.length];
        // for문이 answers.length까지 순회하면서 one_pattern을 참조해서 one_answer를 생성한다.
        int onePatternCount = 0;
        int twoPatternCount = 0;
        int threePatternCount = 0;
        for(int i=0;i<answers.length;i++){
            one_answer[i] = one_pattern[onePatternCount++];
            two_answer[i] = two_pattern[twoPatternCount++];
            three_answer[i] = three_pattern[threePatternCount++];
            if(onePatternCount >= one_pattern.length){
                onePatternCount = 0;
            }
            if(twoPatternCount >= two_pattern.length){
                twoPatternCount = 0;
            }
            if(threePatternCount >= three_pattern.length){
                threePatternCount = 0;
            }
        }
        // 생성된 1,2,3 배열과 각각 answers 배열을 비교해서 맞춘 갯수 각각의 새로운 1,2,3 변수에 리턴
//        int oneAnswerCount = 0;
//        int twoAnswerCount = 0;
//        int threeAnswerCount = 0;
        int[] answerCount = new int[3];
        for(int i=0;i<answers.length;i++){
            // 생성된 1,2,3 배열과 답안 비교해서 맞춘 정답 갯수를 카운트해서 저장하기
            if(answers[i] == one_answer[i]) answerCount[0]++;
            if(answers[i] == two_answer[i]) answerCount[1]++;
            if(answers[i] == three_answer[i]) answerCount[2]++;
        }
        // 해시맵에 저장 (점수 : 사람) -> 문제가 있음 점수가 중복되서 키 충돌이 말생
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<3;i++){
            hm.put(answerCount[i],i+1);
        }

        // answerCount 정렬
        Arrays.sort(answerCount);
        System.out.println(Arrays.toString(answerCount));
        // 정렬된 answerCount 배열 안에서



        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        NOTYET모의고사 a = new NOTYET모의고사();
        int[] answers={1,3,2,4,2};
        int[] answer = a.solution(answers);
//        System.out.println(Arrays.toString(answer));
    }
}
