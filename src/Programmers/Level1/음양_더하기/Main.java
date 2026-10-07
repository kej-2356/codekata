package Programmers.Level1.음양_더하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new int[]{1,2,3}, new boolean[]{false,false,true}));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            }else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
