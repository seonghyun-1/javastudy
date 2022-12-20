package booksource.javacho.ch6.param;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);
    }

    static void change(int x ){
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
