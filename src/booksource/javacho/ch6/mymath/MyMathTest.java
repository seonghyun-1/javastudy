package booksource.javacho.ch6.mymath;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long a=1L,b=2L;
        long result1 = mm.add(a,b);
        long result2 = mm.sub(a,b);
        long result3 = mm.mul(a,b);
        double result4 = mm.div(a,b);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}
