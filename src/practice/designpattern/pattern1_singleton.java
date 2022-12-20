package designpattern;

class Singleton {
    private static Singleton one;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if(one==null){
            one = new Singleton();
        }
        return one;
    }
}



public class pattern1_singleton {
    public static void main(String[] args){

    }
}
