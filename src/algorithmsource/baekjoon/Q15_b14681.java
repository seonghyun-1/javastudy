package studyalgorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QuadrantSolve{
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        if(X > 0 && Y > 0){
            System.out.println(1);
        }
        if(X < 0 && Y > 0){
            System.out.println(2);
        }
        if(X < 0 && Y < 0){
            System.out.println(3);
        }
        if(X > 0 && Y < 0){
            System.out.println(4);
        }
    }
}

public class Q15_b14681 {
    public static void main(String[] args) throws IOException {
        QuadrantSolve.solve();
    }
}
