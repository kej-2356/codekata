package Programmers.Level1.하샤드_수;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(10));
    }

    public boolean solution(int x) {
        boolean answer = true;

        int temp = x;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if(x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
