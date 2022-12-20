package studygrammar;

public class JavaStudy {
    // 람다, 스트림
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args){
//        List<String> list = new ArrayList<>();
//        list.add("korea");
//        list.add("japan");
//        list.add("france");
//        Stream<String> stream = list.stream();
//        stream.map(str -> str.toUpperCase()).forEach(it -> System.out.println(it));
//    }
//}

// 제네릭스

//// 컬렉션2 - 스택, 큐, 어레이디큐(현업사용-성능굿)
//import java.util.LinkedList;
//import java.util.Stack;
//import java.util.Queue;
//import java.util.ArrayDeque;
//public class Main {
//    public static void main(String[] args){
////        Stack<Integer> stack = new Stack<>();
////        stack.push(1);
////        stack.push(3);
////        stack.push(7);
////        stack.push(9);
////        stack.push(11);
////
////        System.out.println(stack.peek());
//
//
//
////        Queue<Integer> queue = new LinkedList<>();
////        queue.add(1);
////        queue.add(5);
////        queue.add(3);
////        System.out.println(queue);
////        System.out.println(queue.poll());
////        System.out.println(queue.peek());
////        System.out.println(queue);
//
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.addFirst(1);
//        arrayDeque.addFirst(2);
//        arrayDeque.addFirst(3);
//        arrayDeque.addFirst(4);
//        arrayDeque.addFirst(5);
//        System.out.println(arrayDeque);
//
//        arrayDeque.addLast(6);
//        System.out.println(arrayDeque);
//
//        arrayDeque.offerFirst(10);
//        System.out.println(arrayDeque);
//
//    }
//}


//// 컬렉션1 - 리스트(현업에서는 배열대신 어레이리스트), 셋, 맵
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.Map;
//import java.util.HashMap;
//
//public class Main {
//    public static void main(String[] args) {
////        * 리스트
////        List<Integer> integerList = new ArrayList<>(); // 가변크기증가
////        integerList.add(1);
////        integerList.add(21);
////        integerList.add(4);
////        integerList.add(5);
////        integerList.add(10);
////        System.out.println(integerList);
////
////        integerList.remove(4);
////
////        Collection.sort(integerList);
////        System.out.println(integerList);
////        System.out.println(integerList.size());
//
////        * 셋
////        Set<Integer> integerSet = new HashSet<>();
////        integerSet.add(1);
////        integerSet.add(1);
////        integerSet.add(5);
////        integerSet.add(2);
////        integerSet.add(3);
////        integerSet.add(9);
////        System.out.println(integerSet);
//
////        Set<String> stringSet = new HashSet<>();
////        stringSet.add("korea");
////        stringSet.add("newyork");
////        stringSet.add("hawai");
////        stringSet.add("daegu");
////        stringSet.add("daejeon");
////
////        System.out.println(stringSet);
////
////        stringSet.remove("korea");
////        List<String> sa = new ArrayList<>();
////        sa.add("hawai");
////        sa.add("daegu");
////        stringSet.removeAll(sa);
////        System.out.println(stringSet);
//
////        * 맵
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1,"apple");
//        map.put(2,"berry");
//        map.put(3,"cherry");
//        System.out.println(map);
//    }
//}




// 날짜와 시간다루기

////#1
////import java.time.LocalDate;
////import java.time.LocalDateTime;
////import java.time.LocalTime;
//
//
////#2
////import java.time.format.DateTimeFormatter;
////import java.time.format.FormatStyle;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;
//
//public class Main {
//    public static void main(String[] args){
//        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일입니다. 좋은하루에요");
//        String myDate = myFormatter.format(LocalDate.now());
//        System.out.println(myDate);
//    }
//}


//import java.io.FileOutputStream;
// 예외 = "예외사항", 에러 = "프로그램이 종료되어야하는 심각한 문제"
//public class Main {
//    public static void main(String[] args){
//       try (FileOutputStream out = new FileOutputStream( file: "text.txt")) {
//           out.write("Hello Sparta".getBytes());
//           out.flush();
//        } catch (IOException e) {
//            System.out.println("IOEXception 발생: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}



//import java.util.Objects;
//// 인터페이스
//interface Flyable {
//    void howold();
//    void howold(int x);
//}
//
//class Me implements Flyable {
//    private int age;
//
//    Me(int age){
//        this.age = age;
//    }
//
//    @Override
//    public void howold(){
//        System.out.println(age+"살 입미다.");
//    }
//
//    @Override
//    public void howold(int age){
//        this.age = age;
//        System.out.println(age+"살 입니다");
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Me hyun = new Me(33);
//        hyun.howold();
//    }
//}



//// 추상클래스
//abstract class Bird {
//    private int x,y,z;
//
//    void fly(int x, int y, int z){
//        printLocation();
//        System.out.println("이동합니다.");
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        if(ㅈ+ "," + z + "}");
//
//
//    }
//}
//
//class Pigeon extends Bird {
//    @Override
//    void fly(int x, int y, int z){
//        System.out.println(x + y + z);
//    }
//}
//
//public class Main {
//    public static void Main(String[] args) {
//
//    }
//}





//--------------------------------------------------------------------------------------------------------------------
//import java.util.Arrays;
//import java.util.Objects;
//
////class Calculation {
////    int add(int x, int y) {
////        return x + y;
////    }
////}
////
////class Phone {
////    String model;
////    String color;
////    int price;
////
////    Phone (String model, String color, int price) {
////        this.model = model;
////        this.color = color;
////        this.price = price;
////    }
////}
//
//
//// 상속에 상속에 상속을 구현
//// Animal -> Dog -> MyDog
////class Animal {
////    String name;
////
////    public void cry() {
////        System.out.println(name + "이 울고 있습니다.");
////    }
////}
////
////
////class Dog extends Animal {
////    // 부모로 부터 물려받은 name 속성 생략
////    // 부모로 부터 물려받은 cry 동작 생략
////
////    // 생성자 함수 호출
////    Dog(String name) {
////        this.name = name;
////    }
////
////    // 새로운 동작을 추가했음
////    public void swim(){
////        System.out.println(name + "is swimming");
////    }
////}
////
////class MyDog extends Dog {
////
////    MyDog(String name) {
////        super(name);
////    }
////}
//
////class Human {
////    String name;
////    int age;
////    String address;
////    public Human(String name, int age, String address) {
////        this.name = name;
////        this.age = age;
////        this.address = address;
////    }
////    public void smiling() {
////        System.out.println("hahahaha");
////    }
////}
////
////class MetaHuman extends Human {
////    public MetaHuman(String name, int age, String address) {
////        super(name, age, address);
////    }
////    public void smiling() {
////        System.out.println("나는 안웃음");
////    }
////    public void jump100m() {
////        System.out.println("삽가능");
////    }
////}
////
////class SuperHuman extends MetaHuman {
////    public SuperHuman(String name, int age, String address) {
////        super(name, age, address);
////    }
////    public void lightening() {
////        System.out.println("라이트닝!");
////    }
////}
//
//
//import pkg.moTest;
//class Child extends moTest {
//    void callParentProtected() {
//        System.out.println("call my parent's protected method");
//        super.messageProtected();
//    }
//}
//
//
//// 자동 실행 Ctrl + R
//public class Main {
//    public static void main(String[] args) {
//        // 출력
//         // System.out.println ~
//        // 자료형
//         // char byte short long float double int float boolean
//         // Primitive Type : short(2byte 2^16), int(4byte 2^32), float vs double, Char
////        float f = 5.5F;
////        double d =5.5;
////        System.out.println(f);
////        System.out.println(d);
////        System.out.println(Short.MAX_VALUE);
////        System.out.println(Integer.MIN_VALUE);
//
//        // 자바에서는 스트링은 " ", 캐릭터는 ' '로 묶는다.
////        char a = 'b';
////        byte data = 'a';
//        // 아스키코드 = 바이트코드
////        System.out.println("bytecode:" + data);
//
//
//        // Reference Type :
//        // 상수
//         // final = 접근제어자
//         // final int staticnumber = 1;
//         // System.out.println(staticnumber);
//        // 자바 언어 컨벤션 : camelCase
//
////        참조자료형 = !기본적인자료형
//
////        String sparta = "Hello sparta";
////        System.out.println(sparta);
//
//        // 참조자료형에 배열도 함께 있음... 배열을 사용하려면 import java.util.Arrays를 사용해야하고,
////        int[] intArray = new int[] {1,2,3,4,5}; // Array를 객체로 선언한 후에
////        char[] charArray = new char[] {'a','b','c','d','e'};
////        System.out.println(charArray);// Char배열은 그냥 배열로 출력이 가능한건가?
////        System.out.println(Arrays.toString(charArray));//
////        System.out.println(Arrays.toString(intArray)); // Array객체를 Arrays.toString으로 랩해줘야 배열모양이 된다.
////        for (int i=0;i<intArray.length;i++){
////            System.out.println(intArray[i]);
////        }
//        // 빈배열 선언
////        int[] intArray = new int[5];
////        System.out.println(Arrays.toString(intArray));
//        // 즉시 선언
////        String[] session = {"봄","여름","가을","겨울"};
////        System.out.println(Arrays.toString(session));
//
//
//        // 사칙연산 : +, -, *, /, %
//
//        // 대입연산자 : -=, +=, *=, /=, %=
//
//        // 비교연산자 : >, < , <=, >=, !=
//
//        // 논리연산자 : && ||
//
//        // 비트연산자 -> 생략 ( &, |, ^, ~, <<, >> )
//
//        // 조건문
//        // if
////        int a = 1;
////        if(a != 1){
////            System.out.println("1이 아닙니다ㅣ");
////        }else{
////            System.out.println("1입니다.");
////        }
//        // switch
////
////        char score = 'A';
////        switch (score) {
////            case 'A':
////                System.out.println("재훈재훈 축하축하");
////                break;
////            case 'B':
////                System.out.println("용진용진 축하노노");
////                break;
////            case 'C':
////                System.out.println("끝");
////                break;
////            default:
////                System.out.println("디폴드");
////                break;
////        }
//
//        // 삼항연산자
////        int a = 5;
////        String result = (a < 10) ? "10보다 작음" : "10보다 큼";
////        System.out.println(result);
//
//        // 반복문1 - for1
////        int sum = 0;
////        for ( int i = 0; i < 10; i++){
////            sum += (i + 1);
////        }
//        // 반복문2 - for2
////        String[] days = {"Monday","Tuesday","Wednesday","Thursdfay","Friday","Saturday","Sunday"};
////        for (String day: days) {
////            System.out.println(day);
////        }
//
//        // 반복문3 - while
////        int i = 0;
////        int sum = 0;
////        while( i < 10 ){
////            System.out.println(i);
////            i++;
////        }
//
//        // 반복문4 - do while
//
//        // ------------------------------------------------------------------------
////      // OOP
//        // 클래스 생성 -> 인스턴스 생성
//        // 클래스 변수, 함수 생성
////        Calculation cal = new Calculation();
////        System.out.println(cal.add(1,2));
//        // 클래스 생성자
////        Phone mine = new Phone("m1","red",10000);
//        // 객체 인스턴스를 띄우려면 어떻게 해야함? -> 미해결 구글링 하기##1
////        System.out.print(mine.toString());
//        // 상속스 -> UML로 표시할 수 있는데 음,,, 도구? UML (속성-데이터, 동작-함수)
//        // 부모한테서 상속을 받는데. 코드 형태?
////        class Animal extends cell
////        Animal monkey = new Animal();
////        monkey.name = "성원숭";
////        System.out.println(monkey.name);
////
////        Dog nyang = new Dog("멍멍이");
////        System.out.println(nyang.name);
////
////        MyDog dang = new MyDog("댕댕이");
////        System.out.println(dang.name);
////        // 오버로딩
////        Human seonghyun1 = new Human("성현1",1,"성북구");
////        MetaHuman seonghyun2 = new MetaHuman("성현2",2,"둔산동");
////        SuperHuman seonghyun3 = new SuperHuman("성현3",3,"세종시");
//
////        System.out.println(seonghyun1.smiling()); // 반환값이 void 라서 프린트를 못하나봄.
////        seonghyun1.smiling();
////        seonghyun2.smiling();
////        seonghyun2.jump100m();
////        seonghyun3.smiling();
////        seonghyun3.jump100m();
////        seonghyun3.lightening();
//          // 접근제어자 - private, default protected -> public
////        Child ch = new Child();
////        ch.callParentProtected();
////        ch.messageOutside();
////
////        // 추상클래스 - 추상메소드를 선언할 수 있는 클래스
//
//    }
//}

}
