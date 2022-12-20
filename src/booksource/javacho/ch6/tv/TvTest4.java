package booksource.javacho.ch6.tv;

public class TvTest4 {
    public static void main(String[] args) {
        // 배열 생성
        Tv[] tvArr = new Tv[3];

        // 객체 생성
        for(int i=0;i<tvArr.length;i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i+10을 저장
        }
    }
}
