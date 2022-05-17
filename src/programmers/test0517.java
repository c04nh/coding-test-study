package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class test0517 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList list = new ArrayList();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) arrList.add(arr[i]);
        }

        if(arrList.size() < 1) arrList.add(-1);

        Collections.sort(arrList);
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
