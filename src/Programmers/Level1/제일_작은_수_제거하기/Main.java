package Programmers.Level1.제일_작은_수_제거하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution(new int[]{4,3,2,1})));
    }

     public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
            return answer = new int[]{-1};
        }
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int min = Collections.min(list);
        list.remove(Integer.valueOf(min));
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();    
        return answer;
    }


}
