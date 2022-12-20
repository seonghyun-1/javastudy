package studyalgorithm.programmers;

// -------------------------------
// ------오버플로우를 고려해봐라-------
// -------------------------------

public class 콜라츠추측 {
    public int solution(long num) { // int에서 long으로 변환
        if(num == 1) return 0;
        int answer = 0;
        int count = 0;
        while(true){
            if(count >= 500) {
                answer = -1;
                break;
            }
            // num == 1이 되어 break를 했을때 정확하게 count를 셀 수 있는가?
            if(num == 1) break;
            // 에러가 발생 why???
            // num =2 ;

            if(num%2 == 1){ // 홀수일때 -> 형변환 :: int -> Long ( 오버플로우 )
                num = (num * 3) + 1;
            } else { // 짝수일때
                num = num/2;
            }

            count = count + 1;
            answer = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠추측 a = new 콜라츠추측();
//        System.out.println(a.solution(6));
//        System.out.println(a.solution(16));
        System.out.println(a.solution(626331));
    }
}
