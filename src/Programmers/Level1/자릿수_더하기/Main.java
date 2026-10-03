package Programmers.Level1.자릿수_더하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(987));
    }

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
