package Programmers.Level1.정수_제곱근_판별;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(1000000000000L));
    }

    public long solution(long n) {
        long answer = 0;

        // x을 Math.sqrt()의 반환값인 double로 설정하면 부동소수점 오차 떄문에
        // n == Math.pow(x, 2)에서 오류가 발생할 수 있음
        // Math.round()으로 반올림하여 오차 보정
        long x = Math.round(Math.sqrt(n));

        if(n == Math.pow(x, 2)){
            answer = (long) Math.pow(x + 1, 2);
        }else {
            answer = -1;
        }

        return answer;
    }
}
