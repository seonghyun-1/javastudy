package studyalgorithm.programmers;

class Solution {
    int return_limitday(int month){
        int limitday=0;
        // #1 그 달의 마지막달 계산 -> challenge : 마지막달 계산을 스위치말고 함수로 만들수있는가?
        // #2 2016년이 아닌 경우 어떻게 동적으로 계산을 바꿀 수 있는가?
        switch(month){
            case 1:
                limitday = 31;
                break;
            case 2:
                limitday = 29;
                break;
            case 3:
                limitday = 31;
                break;
            case 4:
                limitday = 30;
                break;
            case 5:
                limitday = 31;
                break;
            case 6:
                limitday = 30;
                break;
            case 7:
                limitday = 31;
                break;
            case 8:
                limitday = 31;
                break;
            case 9:
                limitday = 30;
                break;
            case 10:
                limitday = 31;
                break;
            case 11:
                limitday = 30;
                break;
            case 12:
                limitday = 31;
                break;
        }
        return limitday;
    }

    String return_stringday(int rest){
        switch(rest){
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
            case 7:
                return "THU";
        }
        return null;
    }

    public String solution(int target_month, int target_day) {
        // 2016년 1월 1일은 금요일
        // 예외처리 :: 각 월의 날짜 스코프를 계산? 월,일 ( 안해도됨 )
        // m월 n일이 주어짐
        // -> 365일의 기준 m월 n일이 몇일인지 구함 ex>2월 20일은 51일
        // -> 51일을 7로 나눔(1~7:금~목)
        // ->
        int countday = 0;
        int rest = 0;
        for(int i=1;i<=target_month;i++){
            for(int j=1;j<=return_limitday(i);i++){
                countday += 1;
                if(j==target_day){
                    break;
                }
            }
        }
        rest = countday % 7;
        return return_stringday(rest);
    }
}

public class Q20_hanghae1 {
}
