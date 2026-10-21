package Programmers.Level1.없는_숫자_더하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new int[]{5,8,4,0,6,7,9}));
    }

    public int solution(int[] numbers) {
        int answer = 0;

        boolean[] check = new boolean[10];

        for (int number : numbers) {
            check[number] = true;
        }

        for (int i = 0; i  < check.length; i++) {
            if(!check[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
