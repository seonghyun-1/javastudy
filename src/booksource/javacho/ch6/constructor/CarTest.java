package booksource.javacho.ch6.constructor;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        Car c3 = new Car();
        Car c4= new Car(c3);
    }
}
