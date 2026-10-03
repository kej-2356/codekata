package Programmers.Level1.나머지가_1이_되는_수_찾기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(12));
    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i < n; i++ ) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
