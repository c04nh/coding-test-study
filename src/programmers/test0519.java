package programmers;

public class test0519 {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(s.length() % 2 == 0){
            answer += s.charAt(len / 2 - 1);
            answer += s.charAt(len / 2);
        }
        else answer += s.charAt(len / 2);
        return answer;
    }
}
