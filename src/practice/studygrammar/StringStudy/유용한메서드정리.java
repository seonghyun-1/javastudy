package studygrammar.StringStudy;

import java.util.Arrays;

public class 유용한메서드정리 {
    public static void main(String[] args) {

//        String sentence = "Hello World";
        // startWith
        // endWith
//        System.out.println(sentence.startsWith("H"));
//        System.out.println(sentence.endsWith("d"));

        // equals, equalsIgnoreCase
        String[] arr = {"sun","sun","wee"};
        String s1 = "hello";
        String s2 = "hello";
        String s11 = "HEllo";

//        System.out.println(arr[0].equals(arr[1]));
//        System.out.println(s1.equalsIgnoreCase(s11));

        // indexOf, lastIndexOf, length()
        String s3 = "This is worlds";
//        System.out.println(s3.indexOf("s"));
//        System.out.println(s3.lastIndexOf("s"));
//        System.out.println(s3.length());

        // replace : 모든 문자를 변경
        String s4 = "Hello world Hello world Hello world";
//        System.out.println(s4.replace("world","global"));

        // split
        String s5 = "Hello world Hello world Hello world";
        String[] s5Arr = s5.split(" ");
//        System.out.println(Arrays.toString(s5Arr));

        // subString
        String s6 = "Hello world Hello world Hello world";
//        System.out.println(s6.substring(1,2));

        // trim : 앞뒤 공백을 제거한다
        String s7 = " Helloworld Hello world Hello world ";
//        System.out.println(s7.trim());

        // String.valueOf(s) : String으로 형변환
        String s8 = " Helloworld Hello world Hello world ";
//        System.out.println(s8.valueOf(1));

        // s.compareTo, s.compareToIgnorecase();
        // 스트링에서의 결과값은 같으면 0, 다르면 다른것을 기준으로 아스키값을 빼서 음수 or 양수를 반환한다.
        String s9 = "abca";
        String s99 = "abcd";
        String s10 = "abcx";
        System.out.println(s9.compareTo(s99)); // 같으면 0
        System.out.println(s9.compareTo(s10));

        // contains
        String s12 = "HelloWorld";
        System.out.println(s12.contains("world"));

        // charAt
        String s13 = "hello world";
        String tmp13 = " " + s13.charAt(2); // 자동형변환

        // concat,join
        String[] arr14 = {"hello","world","nice","to","meet","you"};
        System.out.println(arr14[0].concat(arr14[1]));
        System.out.println(String.join(" ",arr14));


    }
}
