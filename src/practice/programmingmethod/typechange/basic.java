package programmingmethod.typechange;

public class basic {
    public static void main(String[] args){
        // - 자동타입변환 vs 강제타입변환
        // ++ 자동타입변환 : 값의 허용 범위가 큰 타입 <= 값의 허용 범위가 작은 타입
        byte a = 10;
        int b = a;
        // ++ 강제타입변환 : 값의 허용 범위가 작은 타입 <= 값의 허용 범위가 큰 타입
        int intValue = 10;
        byte byteValue = (byte) intValue;

        // ++

    }
}
