package programmingmethod.nestedClass;

// B,static C -> 바깥 필드와 메소드에서 사용 제한 범위

class A2 {
    // 아래처럼 클래스 선언이 되어있을 때, 동일레벨에서 접근 범위 -> B는 static X / C는 전부 접근 가능
    class B {}
    static class C {}

    // 1. 인스턴스 필드에서는..
    B field1 = new B();
    C field2 = new C();


    // 2. 인스턴스 메소드
    void method1(){
        B var1 = new B();
        C var2 = new C();
    }

    // 3. 정적 필드 초기화 -> ?
    static C field4 = new C();

    // 4. 정적 메소드
    static void method2(){
        C var2 = new C();
    }
}

public class Example2 {}
