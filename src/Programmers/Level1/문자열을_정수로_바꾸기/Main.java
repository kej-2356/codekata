package Programmers.Level1.문자열을_정수로_바꾸기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution("-1234"));
    }

    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);
        return answer;
    }
}
