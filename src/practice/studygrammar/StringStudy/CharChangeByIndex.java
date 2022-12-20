package studygrammar.StringStudy;

import java.lang.StringBuilder;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitArr = s.split(" ");
        StringBuilder sb;
        for(int i=0;i<splitArr.length;i++){
            sb = new StringBuilder(splitArr[i]);
            for(int j=0;j<splitArr[i].length();j++){
                if(j%2==0){
                    sb.setCharAt(j,'ㄷ');
                } else {

                }
            }
        }
        return answer;
    }
}

public class CharChangeByIndex {
    public static void main(String[] args) {

    }
}
