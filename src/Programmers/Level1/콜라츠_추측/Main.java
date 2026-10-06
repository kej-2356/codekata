package Programmers.Level1.콜라츠_추측;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(626331));
    }

    public int solution(int num) {
        int answer = 0;

        long temp = num;
        int cnt = 0;
        while (temp != 1) {
            if(cnt >= 500) {
                return -1;
            }

            if(temp % 2 == 0) {
                temp /= 2;
            }else {
                temp = temp * 3 + 1;
            }
            cnt++;
        }

        answer = cnt;
        return answer;
    }
}
