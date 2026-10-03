package Programmers.Level1.짝수와_홀수;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(4));
    }

    public String solution(int num) {
        String answer = "";

        return answer = num % 2 == 0 ?  "Even" : "Odd";
    }


}
