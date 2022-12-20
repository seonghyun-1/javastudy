package booksource.javacho.ch6.tv;


public class TvTest1 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        boolean ps = tv.power();
        int cs = tv.channelUp();
        System.out.println("cs = " + cs);
        System.out.println("ps = " + ps);
    }
}
