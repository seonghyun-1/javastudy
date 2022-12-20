package studygrammar;

// Util 클래스 - 날짜 구하기
import java.text.SimpleDateFormat;
import java.util.Date;
class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}


// Counter 스태틱 클래스 생성
class Counter  {
    static int count = 0;
    Counter() {
        count++;  // count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다.
//        System.out.println(count);  // this 제거
    }
    public static int getCount() {
        return count;
    }
}

// 싱글톤 패턴(singleton pattern)
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




// 클래스 메인
public class StaticStudy {
    public void execution() {
        // 변수는 모든 새롭게 생성된 객체에서도 이전 상태를 유지하고 있다.
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        // 메서드는 클래스이름으로 호출가능
        System.out.println(Counter.getCount());
    }
}
