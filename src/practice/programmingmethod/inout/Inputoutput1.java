package programmingmethod.inout;
import java.io.*;

public class Inputoutput1 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            br.close();
            System.out.println(num);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
