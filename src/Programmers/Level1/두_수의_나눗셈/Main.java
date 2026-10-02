package Programmers.Level1.두_수의_나눗셈;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution(3,2));
    }

    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000;
        return (int)answer;
    }
}
