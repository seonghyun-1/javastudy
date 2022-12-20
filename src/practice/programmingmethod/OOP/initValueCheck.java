package programmingmethod.OOP;

class Values {
    byte a;
    short b;
    int c;
    long d;

    boolean e; // false
    char f;

    float g; // 0.0
    double h; // 0.0

    int[] i; //null
    String j; // null
}

public class initValueCheck {
    public static void main(String[] args){
        Values v = new Values();
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
        System.out.println(v.d);
        System.out.println(v.e);
        System.out.println(v.f);
        System.out.println(v.g);
        System.out.println(v.h);
        System.out.println(v.i);
        System.out.println(v.j);


    }
}
