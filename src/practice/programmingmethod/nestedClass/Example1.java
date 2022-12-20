package programmingmethod.nestedClass;


// * 스터디 포인트 *
// 1. 내부 클래스 종류 4가지
// 2. 내부 클래스 종류별 선언 가능범위
// 3. Example1Main에서 어떻게 선언하는지

// 바깥 클래스
class A {
    A() {
        System.out.println("A 객체 생성");
    }
    // 인스턴스 멤버 클래스
    class B {
        B(){
            System.out.println("B 객체 생성");
        }
        int field1;
        void method1(){}
    }

    // 정적 멤버 클래스
    static class C {
        C() {
            System.out.println("C 객체 생성");
        }
        int field1;
        static int field2;
        void method1(){};
        static void method2(){};
    }

    // 로컬 클래스
    void method() {
        class D {
            D() {
                System.out.println("D 객체 생성");
            }
            int field1;
            void method1(){}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}

public class Example1 {

}
