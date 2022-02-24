//문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12977(
//소수만들기 
//Math.sqrt(num)을 사용하여 2 이상 √N 이하의 수 중에 나누어 떨어지는 수가 존재한다면 소수가 아님을 이용한 소수 판별법이다.
//블로그 참고 : https://st-lab.tistory.com/81#recentComments(심화)

class Solution {
    public int solution(int[] nums) {
        int answer = 0 ;

        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(isTrue(nums[i]+nums[j]+nums[k])){
                        answer++;
                    }           
                }
            }
        }
        return answer;
    }
    
    public boolean isTrue(int num){
        int cnt = 0;
        
        //Math.sqrt(num) : 제곱근 구하기
        for(int i = 1; i<=(int)Math.sqrt(num); i++){
            if(num % i == 0){
                cnt += 1;
            }
        }
        if(cnt == 1){
            return true;
        }else{
            return false;
        }
    }
}
