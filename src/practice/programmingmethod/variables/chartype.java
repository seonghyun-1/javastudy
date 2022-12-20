package programmingmethod.variables;

// 하나의 문자를 작은따옴표(')로 감싼 것을 문자리터럴이라고 함. 문자 리터럴은 "유니코드"로 변환되어 저장.
public class chartype {
    public static void main(stringtype[] args){
        char var1 = 'A'; // 작은 따옴표
        int var2 = 'A'; // 변수를 숫자로 받으면 유니코드 숫자가 출력
        System.out.println(var1);
        System.out.println(var2);

        char var3 = 'A'; // 문자표현
        char var4 = 65; // 아스키코드표현
        char var5 = '\uac00'; // 유니코드표현

        char var6 = '가';
        char var7 = 44032;
        char var8 = '\uac00';

        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
    }
}
