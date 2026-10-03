package Programmers.Level1.배열의_평균값;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public double solution(int[] numbers) {
        double answer = 0;

        for (int number : numbers) {
            answer += number;
        }

        return answer / numbers.length;
    }
}
