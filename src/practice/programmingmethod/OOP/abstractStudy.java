package programmingmethod.OOP;

abstract class Phone {
    //필드
    public String owner;

    //생성자
    public Phone(String owner){
        this.owner = owner;
    }

    //메소드
    public void turnOn() {
        System.out.println("폰 전원을 켭니다");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다");
    }

    public abstract void featureExplain();
}

class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }

    @Override
    public void featureExplain() {
        System.out.println("스마트폰입니다");
    }
}

public class abstractStudy {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
