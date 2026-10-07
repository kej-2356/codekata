package Programmers.Level1.서울에서_김서방_찾기;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[] {"Jane", "Kim"}));
    }

    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
