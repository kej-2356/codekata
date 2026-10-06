package Programmers.Level1.두_정수_사이의_합;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(5, 3));
    }

    public long solution(int a, int b) {
        long answer = 0;

        if(a == b) {
            return a;
        }

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
