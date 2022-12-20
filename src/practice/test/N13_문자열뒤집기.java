package test;

// note : 문자열을 뒤집을 때는 StringBuilder를 활용한다.

public class N13_문자열뒤집기 {
    public static void main(String[] args) {
        int number = 1000;
        String binaryNum = Integer.toString(number,2);
        System.out.println(binaryNum);

        // 문자열 뒤집기
        StringBuilder sb = new StringBuilder();
        String s = sb.append(binaryNum).reverse().toString();
        System.out.println(s);

        // 만들어진 문자열을 이진수로 만들어서 다시 String으로 저장하기
        System.out.println(Integer.toString(Integer.parseInt(s,2),2));
    }
}
