package programmingmethod.nestedInterface;

// 버튼 클래스 선언
class Button {

    // 중첩 인터페이스타입으로 필드를 선언
    static interface OnClickListener {
        void onClick();
    }

    // 중첩 인터페이스타입으로 필드를 선언
    OnClickListener listener;

    // Setter메소드로 구현 객체를 받아 필드에 대입
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    // 버튼이벤트가 발생했을때 인터페이스를 통해 구현 객체의 메소드를 호출
    void touch() {
        listener.onClick();
    }
}

// 버튼 클래스의 중첩 인터페이스인 onClickListener를 구현한 2개의 클래스를 보여줌
// #1
class CallListener implements Button.OnClickListener{
    public void onClick(){
        System.out.println("전화를 겁니다");
    }
}

// #2
class MessageListener implements Button.OnClickListener {
    public void onClick() {
        System.out.println("메시지를 보냅니다");
    }
}

public class example6 {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new CallListener());
        btn.touch();

        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
