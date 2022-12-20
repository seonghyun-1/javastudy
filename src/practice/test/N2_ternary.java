package test;
import java.util.Scanner;

public class N2_ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String tv = (num > 100) ? "over hundred" : "under hundred";
        System.out.println(tv);
    }
}
