//문제 풀이 : https://programmers.co.kr/learn/courses/30/lessons/68644
//두 개 뽑아서 더하기

import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        
        HashSet<Integer> arr = new HashSet<Integer>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j =i+1; j<numbers.length; j++){
                arr.add(numbers[i]+numbers[j]);
            }    
        }
        
        //set을 list로 변환
        List<Integer> answer = new ArrayList<Integer>(arr);
        //list 정렬
        Collections.sort(answer);
        return answer;
    }
}
