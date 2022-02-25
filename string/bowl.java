//문제출처 : https://www.acmicpc.net/problem/7567

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Main { 
    public static void main(String[] args) throws IOException { //예외처리필수.
        
        //콘솔에서 입력받을 경우 BufferdReader 사용. 
        //Scanner보다 빠름.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
        String string = bufferedReader.readLine(); 
        int answer = 10; 
        for (int i = 1; i < string.length(); i++){ 
            if (string.charAt(i) == string.charAt(i - 1)){ 
                answer += 5; 
            } else{ 
                answer += 10; 
            }
        } 
        System.out.println(answer); 
        bufferedReader.close();
    }
}
