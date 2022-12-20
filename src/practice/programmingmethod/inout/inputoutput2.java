package programmingmethod.inout;

// System.in vs System.out
public class inputoutput2 {
    public static void main(String[] args) throws Exception{
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

    }
}
