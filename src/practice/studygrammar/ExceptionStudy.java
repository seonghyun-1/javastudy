package studygrammar;
// Exception 스터디
// 예외처리하기

// #1 Exception vs RuntimeException
// 1.Exception -> 컴파일시 발생 ( 예측가능한 예외 발생 시 사용 )
// 2.RuntimeException -> 런타임시 발생 예측이 어려운 경우 사용
class FoolException extends Exception {

}
class FoolException2 extends RuntimeException {

}

// #2 예제
class Sample{
    public void sayNick(String nick) {
//        if("fool".equals(nick)) {
//            return;
//        }
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        } catch(FoolException e) {
            System.out.println("FoolException이 발생했습니다.");
        }
    }
}

// #3 예제2
class Sample2 {
    public void sayNick(String nick) throws FoolException {
        try {
            if ("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + " 입니다.");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}


// #4 예제3 - 트랜잭션
public class ExceptionStudy {
    public static int c = 0;
    public static void exam1() {
        try {
            c = 4/0;
            System.out.println("이 코드는 실행되지 않는다");
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            System.out.println("finally속의 이 코드는 실행됩니다.");
        }
    }

    public static void exam2(){
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genious");

        // 메소드에 정의한 throws 구문 때문에 FoolException의 예외를 처리해야하는 대상이 sayNick 메소드에서 main메소드로 변경
        Sample2 sample2 = new Sample2();
//        sample2.sayNick("fool");
//        sample2.sayNick("genious");
        try {
            sample2.sayNick("fool");
            sample2.sayNick("genius");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
