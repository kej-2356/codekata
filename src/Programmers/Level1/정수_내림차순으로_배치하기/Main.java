package Programmers.Level1.정수_내림차순으로_배치하기;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(118372));
    }

    public long solution(long n) {
        long answer = 0;

        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }
        list.sort((a, b) -> b - a); // 내림차순

        String iter = "";
        for (Integer i : list) {
            iter += i;
        }
        answer = Long.parseLong(iter);
        return answer;
    }
}
