package programmingmethod.anonymousObj;

class Parent2{}
class Child2 extends Parent2{}

interface Parent22{}
class Child22 implements Parent22{}


public class tmptest1 {
    public static void main(String[] args) {
        // 일반적인 객체선언
        Child2 ch2 = new Child2();

        // 일반적인 선언
        Parent2 p2 = new Child2();

        // 익명객체 선언
        Parent2 p2_1 = new Parent2();

    }
}
