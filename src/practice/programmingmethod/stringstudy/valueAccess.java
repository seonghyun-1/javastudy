package programmingmethod.stringstudy;

// str.length();
// charAt(index);

public class valueAccess {
    public static void main(String[] args){
        String a = "Hello World";
        for(int i = 0;i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
