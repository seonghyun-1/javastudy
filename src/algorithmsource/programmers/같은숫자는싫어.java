// 알려준 HINT : 이 문제는 queue문제

// 학습한 것
// queue에서 nextNum은 int형인데 queue.peek()에서 null이 발생해서 대입 저장시 에러가 남

package studyalgorithm.programmers;

import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};

        Queue<Integer> queue = new LinkedList<>(); // 중복된 수 거르기 연산은 여기서 한다.
        List<Integer> list = new ArrayList<>(); // 거르기 연산이 되면 ArrayList에 저장하고 배열로 변환한다.

        // 저장연산 arr -> queue
        for(int num : arr) {
            queue.add(num);
        }
        // queue에서 중복된 수 거르기 연산하기
        int priorNum = 0;
        int nextNum = 0;
        while(true){
            priorNum = queue.poll();
            if(queue.peek() == null){ // 이 부분이 이해안감
                list.add(priorNum);
                break;
            }
            nextNum = queue.peek(); // 주의 : 여기서 nextNum은 int형인데 queue.peek()에서 null이 발생해서 저장시 에러가 남
            if(priorNum == nextNum){
                System.out.println("같아서 저장안함");
            } else {
                list.add(priorNum);
            }
        }
        System.out.println(list);

        return answer;
    }
    public static void main(String[] args) {
        같은숫자는싫어 a = new 같은숫자는싫어();
        int[] arr = {1,1,1,1,0,0,0,2,2,3,3};
        int[] answer = a.solution(arr);
//        System.out.println(Arrays.toString(answer));
    }
}
