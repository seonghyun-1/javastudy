// 문제해결

package studyalgorithm.programmers;
import java.util.Arrays;
public class 제일작은수 {
    public int[] solution(int[] arr) {
        int[] answer;
        // 주어진 배열의 길이 1 -> [-1]리턴하기
        if(arr.length==1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[arr.length-1];
        // arr에서 가장 작은 값을 찾기 -> leastNum변수에 가장 작은값 저장
        // arr배열에서 answer배열로 값을 옴긴다.
        // 이때, leastNum변수에있는 값을 만나면 건너뛰고 순차적으로 배열에 저장한다.

        // 가장 작은 값을 찾기 -> 변수저장
        int leastNum = arr[0];
        for(int num : arr) {
            if(num <= leastNum) {
                leastNum = num;
            }
        }
//        System.out.println(leastNum);

        // arr배열에서 answer배열로 값을 이동
        int count = 0;
        for(int num : arr){
            if (num == leastNum){
//                System.out.println(leastNum);
                continue;
            }
            answer[count] = num;
            if(count > answer.length) break;
            count = count + 1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        제일작은수 a = new 제일작은수();
        int[] arr1 = {4,3,2,1};
        int[] show = a.solution(arr1);
//        System.out.println(Arrays.toString(show));
    }
}
