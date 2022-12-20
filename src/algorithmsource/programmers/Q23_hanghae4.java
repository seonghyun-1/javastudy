package studyalgorithm.programmers;

import java.util.Arrays;

class Solution4 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(i=0;i<participant.length;i++){
            if(!participant[i].equals(completion[i])) break;
        }
        return participant[i];
    }
}

public class Q23_hanghae4 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        String[] s1 = {"leo", "kiki", "eden"};
        String[] s2 = {"leo", "kiki"};
        System.out.println(s4.solution(s1,s2));
    }
}
