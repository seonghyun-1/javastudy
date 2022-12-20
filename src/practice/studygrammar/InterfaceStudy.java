package studygrammar;
//// 인터페이스 - 다형성
interface Human {
    public abstract void talk();
}
interface Animal {
    public abstract String cry();
}

class Asian implements Human {
    public void talk() {
        System.out.println("안녕하세요");
    }
}

class Europian implements Human {
    public void talk() {
        System.out.println("Hello");
    }
}

class American implements Human {
    public void talk() {
        System.out.println("hi");
    }
}

class Dog implements Animal {
    @Override
    public String cry() {
        return "멍멍";
    }
}
class Cat implements Animal {
    @Override
    public String cry() {
        return "야옹";
    }
}
public class InterfaceStudy {
    public void test(){
        Cat c1 = new Cat();
        System.out.println(c1.cry());
    }
}
