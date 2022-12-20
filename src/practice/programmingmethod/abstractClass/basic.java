package programmingmethod.abstractClass;

abstract class Phone {
    public String owner;
    public Phone(String owner) {
        this.owner = owner;
    }

    public abstract void logo();

    public void turnOn() {
        System.out.println("폰 전원을 켭니다");
    }
    public void turnOff() {
        System.out.println("폰 전원을 끕니다");
    }
}

class Smartphone extends Phone {
    public Smartphone(String owner) {
        super(owner);
    }
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다");
    }

    public void logo() {
        System.out.println("삼성");
    }
}

public class basic {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone("홍길동");
        sp.turnOn();
        sp.turnOff();
        sp.internetSearch();
    }
}
