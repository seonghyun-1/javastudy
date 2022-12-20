package booksource.javacho.ch6.staticstudy;

class SoccerPlayer {
    static int number = 0;
    int playerNum;

    {
        number++;
        playerNum = number;
    }
    SoccerPlayer() {
        System.out.println("자동으로" + playerNum + "번 플레이어가 생성되었습니다.");
    }

    SoccerPlayer(int number) {
        System.out.println("지정하신" + number + "번 플레이어가 생성되었습니다.");
    }

}

public class MyTest {
    public static void main(String[] args) {
        SoccerPlayer sp1 = new SoccerPlayer();
        SoccerPlayer sp2 = new SoccerPlayer();
        SoccerPlayer sp3 = new SoccerPlayer();
        SoccerPlayer sp4 = new SoccerPlayer(9);
    }
}
