package Programmers.Level1.나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(new int[]{3,2,6}, 10)));
    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList<>();
        for (int i : arr) {
            if(i % divisor == 0) {
                answerList.add(i);
            }
        }
        if(answerList.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(answerList);
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
