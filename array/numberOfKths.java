//문제 풀이 : https://programmers.co.kr/learn/courses/30/lessons/42748
//k번째의 수 

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
                
        int[] answer = new int[commands.length];
        
        for(int i =0; i<commands.length; i++){
            int[] arrayCopy = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]); 
            Arrays.sort(arrayCopy); //2 3 5 6
            answer[i] = arrayCopy[commands[i][2]-1]; 
        }
        
        return answer;
    }
}
