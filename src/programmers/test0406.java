package programmers;

public class test0406 {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '+') answer = Integer.parseInt(s.substring(1));
        else if(s.charAt(0) == '-') answer = -1 * Integer.parseInt(s.substring(1));
        else answer = answer = Integer.parseInt(s);
        return answer;
    }
}
