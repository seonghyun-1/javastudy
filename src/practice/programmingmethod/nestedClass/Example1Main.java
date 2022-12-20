package programmingmethod.nestedClass;

public class Example1Main {
    public static void main(String[] args){
        // 1. 외부 객체 생성
        A a = new A(); // 1.외부 객체 생성

        // 2. 인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        // 3. 정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();

        // 4. 로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();

    }
}
