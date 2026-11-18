package Programmers.Level1.가운데_글자_가져오기;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("abde"));
    }

    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;

        if(s.length() % 2 == 0) {
            answer = s.substring(mid - 1, mid + 1); // 0 ~ n -1까지
            
        }else {
            answer = String.valueOf(s.charAt(mid));    
        }

        return answer;
    }

}
