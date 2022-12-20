package programmingmethod.array;

public class arrayCopy {
    public static void main(String[] args){
        String[] oldStrArray = {"java","array","copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
    }
}
