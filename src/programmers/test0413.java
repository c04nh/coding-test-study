package programmers;

public class test0413 {
    public boolean solution(int x) {
        boolean answer;
        int sumNum = sum(x);
        if(x % sumNum == 0) answer = true;
        else answer = false;
        return answer;
    }

    public int sum(int a){
        int result = 0;
        while(a != 0){
            result += a % 10;
            a /= 10;
        }
        return result;
    }
}
