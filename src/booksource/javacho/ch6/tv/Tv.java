package booksource.javacho.ch6.tv;

class Tv {
    // 멤버변수 선언
    String color;
    boolean power;
    int channel;

    boolean power(){ power = !power; return power; }
    int channelUp() { return ++channel; }
    int channelDown() { return --channel; }

}
