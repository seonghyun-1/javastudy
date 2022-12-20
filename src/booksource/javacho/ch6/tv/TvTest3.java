package booksource.javacho.ch6.tv;


public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t2 = t1; // t1이 저장하고 있는 주소를 t2에 저장한다. -> 원래 t2가 참조하고 있던 인스턴스는 더 이상 사용할 수 없게 된다.
        t1.channel = 7;
    }
}
