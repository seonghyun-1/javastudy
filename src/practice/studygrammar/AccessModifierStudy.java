package studygrammar;
//// 클래스 - 접근제어자, 키워드, 클래스 이름, 클래스의 멤버(필드, 메소드), 접근제어자(private, public, default, protect)
//// 클래스 > 접근 제어자 ( 같은 클래스, 같은 패키지, 자식 클래스, 그 외영역(다른패키지) )

//// 1. private 접근제어자 :: 클래스 멤버가 외부에 공개되지 않으면서, 외부에서는 직접접근하지 못함. 해당 객체의 public메소드를 통해서만 접근가능.
class SameClass {
    private String var = "같은 클래스만 허용";
    private String getVar() {
        return this.var;
    }
    public String func() {
        return getVar();
    }
}
//// 2. default 접근제어 - 같은 패키지의 멤버, 같은 클래스의 멤버가 접근가능
class SamePackageSameClass {
    String var = "같은 패키지, 같은 클래스는 허용";
}
//// 3. protected 자바 클래스는 private 멤버로 정보를 은닉하고, public 멤버로 사용자나 프로그램과의 인터페이스를 구축합니다.
////    여기에 부모 클래스(parent class)와 관련된 접근 제어자가 하나 더 존재합니다.
////    protected 멤버는 부모 클래스에 대해서는 public 멤버처럼 취급되며, 외부에서는 private 멤버처럼 취급됩니다.
////    클래스의 protected 멤버에 접근할 수 있는 영역은 다음과 같습니다.
////    1) 이 멤버를 선언한 클래스의 멤버
////    2) 이 멤버를 선언한 클래스가 속한 패키지의 멤버
////    3) 이 멤버를 선언한 클래스를 상속받은 자식 클래스(child class)의 멤버
class AnotherPackage {
    protected String var = "같은 패키지, 같은 클래스, 다른패키지의 자식클래스";
}
//// 4. public 접근 제어자 - 어디서나 허용이 가능하며 누구나 참여가 가능함
class EveryWhere {
    public String var = "어디서나 허용";
    public String getVar() {
        return this.var;
    }
}
public class AccessModifierStudy {
    public static void main(){
        System.out.println("hello");
    }
}
