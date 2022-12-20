package programmingmethod.anonymousObj;

interface RemoteControl {
    public void turnOn();
    public void turnOff();
}

class Anonymous2 {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn(){
            System.out.println("TV를 켭니다");
        }
        @Override
        public void turnOff(){
            System.out.println("TV를 끕니다");
        }
    };
    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn(){
                System.out.println("audio를 켭니다");
            }
            @Override
            public void turnOff(){
                System.out.println("audio를 끕니다");
            }
        };
        localVar.turnOn();
    }
    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}

public class example2 {
    public static void main(String[] args) {
        Anonymous2 anony = new Anonymous2();
        anony.field.turnOn();
        anony.method1();
        anony.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("Smart TV를 켭니다.");
                    }
                    @Override
                    public void turnOff() {
                        System.out.println("SmartTV를 끕니다.");
                    }
                }
        );
    }
}
