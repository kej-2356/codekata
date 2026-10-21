package Programmers.Level1.핸드폰_번호_가리기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution("027778888"));
    }

    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}
