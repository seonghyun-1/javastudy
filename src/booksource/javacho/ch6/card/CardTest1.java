package booksource.javacho.ch6.card;

public class CardTest1 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 9;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 " + "크기는 " + "(" + c1.width + ", " +c1.height + ") 입니다");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 " + "크기는 " + "(" + c2.width + ", " +c2.height + ") 입니다");

        c1.width = 50;
        c1.height = 50;

        System.out.println("c1.width와 c1.height을 다음과 같이 변경합니다." + "( " + "50, 50" + " )");

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 " + "크기는 " + "(" + c1.width + ", " +c1.height + ") 입니다");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 " + "크기는 " + "(" + c2.width + ", " +c2.height + ") 입니다");

    }
}
