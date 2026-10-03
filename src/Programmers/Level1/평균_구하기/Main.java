package Programmers.Level1.평균_구하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new int[]{5,5}));
    }

    public double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }
        return answer / arr.length;
    }
}
