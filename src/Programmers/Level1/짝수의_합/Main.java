package Programmers.Level1.짝수의_합;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(10));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            answer += i % 2 == 0 ? i : 0;
        }
        return answer;
    }
}
