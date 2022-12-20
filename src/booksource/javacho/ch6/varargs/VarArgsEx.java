package booksource.javacho.ch6.varargs;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = new String[]{ "100", "200", "300" };
        System.out.println(concatenate(" ", "100","200","300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",",new String[]{"3","4","5"}));
    }

    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args) {
            result = result + str + delim;
        }

        return result;
    }
    // 오버로딩 에러 발생 why?
    //static String concatenate(String... args) {
    //    return concatenate("",args);
    //}

}
