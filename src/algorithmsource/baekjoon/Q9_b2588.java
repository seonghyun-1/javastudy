package studyalgorithm.baekjoon;
import java.util.Scanner;

public class Q9_b2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int inputNum2 = sc.nextInt();
        int inputNum3 = inputNum2;
        int calNum;

        while( inputNum2 != 0 ){
            calNum = inputNum2 % 10;
            System.out.println(inputNum * calNum);
            inputNum2 = inputNum2 / 10;
        }
        System.out.println(inputNum3*inputNum);
    }
}
