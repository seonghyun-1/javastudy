package test;

// java 8에서는 함수형 프로그래밍 패러다임이 들어와서
// java 8이랑 java 11의 변화 -> 최소 java 8의 피처는 다 알고 있어야 함
// 보통 회사에서는 기존 java 6으로 되어있는 것을 java 8, 11로 끌어올리는 작업을 함
public class N8_var {
    public static void main(String[] args){
        var v = 10;
        System.out.println(v);
    }
}
