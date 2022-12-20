package programmingmethod.nestedClass;

class Outter {
    public void method1(final int arg){ // java 8부터 final안붙여도됨
        final int localvariable = 1;
        // arg = 100; -> 매개변수 사용시 제한
        // localVariable = 100; -> 로컬변수 사용시 제한
        class Inner {
             public void method() {
                 int num = arg + localvariable;
             }
        }
    }
}

public class Example4 {
}
