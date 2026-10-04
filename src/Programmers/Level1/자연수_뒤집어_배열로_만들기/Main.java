package Programmers.Level1.자연수_뒤집어_배열로_만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(12345)));
    }

    public int[] solution(long n) {
        int[] answer = {};

        List<Long> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        answer = list.stream().mapToInt(Long::intValue).toArray();
        return answer;
    }
}
