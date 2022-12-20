package test;

// n진수 <-> 10진수
// * 숫자를 String으로 바꿔서 Integer랑 왔다갔다함
// 1.N진수를 10진수로 변환 : Integer.parseInt(스트링변수,진수);
// 2.그렇다면 10진수를 N진수를 변환할때는? Integer.toString(a,2);

// 추가로 문자열 뒤집기

public class N12_진법 {
    public static void main(String[] args) {
        String a = "101010";
        int b = Integer.parseInt(a,3);
        System.out.println(b);

        int c = 1234;
        String d = Integer.toString(c,3);

        System.out.println(d);
    }
}
