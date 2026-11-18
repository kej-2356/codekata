package Programmers.Level2.수박수박수박수박수박수;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(4));
    }

    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < 10000 / 2; i++) {
            answer += "수박";
        }

        answer = answer.substring(0, n);
        return answer;
    }

}
