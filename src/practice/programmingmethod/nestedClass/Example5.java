package programmingmethod.nestedClass;

// 중첩 시 내부객체 및 바깥객체 참조

class Outter2 {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            System.out.println(this.field); //
            this.method(); // 중첩객체 참조

            System.out.println(Outter2.this.field);
            Outter2.this.method(); // 바깥객체 참조
        }
    }

}

public class Example5 {
}
