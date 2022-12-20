package programmingmethod.nestedClass;

public class Example5Main {
    //psvm
    public static void main(String[] args) {
        Outter2 outter = new Outter2();
        Outter2.Nested nested = outter.new Nested();
        nested.print();
    }
}
