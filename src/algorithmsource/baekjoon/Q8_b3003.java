package studyalgorithm.baekjoon;
import java.util.Scanner;

public class Q8_b3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kingInput = sc.nextInt();
        int queenInput = sc.nextInt();
        int rookInput = sc.nextInt();
        int bishopInput = sc.nextInt();
        int knightInput = sc.nextInt();
        int phoneInput = sc.nextInt();

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int phone = 8;

        System.out.println((king-kingInput)+" "+(queen-queenInput)+" "+(rook-rookInput)+" "+(bishop-bishopInput)+" "+(knight-knightInput)+" "+(phone-phoneInput));
    }
}
