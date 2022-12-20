package studyalgorithm.programmers;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int x2 = x;
        while(x>0){
            sum = sum + (x%10);
            System.out.println(sum);
            x=x/10;
        }
        if(x2%sum == 0) {
            System.out.println(x);
            System.out.println(sum);
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        하샤드수 n = new 하샤드수();
        int input = 11;
        boolean result = n.solution(input);
        System.out.println(result);
    }
}
