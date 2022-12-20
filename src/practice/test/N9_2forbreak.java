package test;

// * 이중포문 내부에서 break를 걸어서 완전히 종료시키고 싶다
//   flag변수를 선언해서 종료시킨다.

public class N9_2forbreak {
    public static void main(String[] args) {
        int flag = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("i:"+i+", j:"+j);
                if(i==1&&j==1) {
                    flag = 1;
                    break;
                }
            }
            if(flag==1) break;
        }
    }
}
