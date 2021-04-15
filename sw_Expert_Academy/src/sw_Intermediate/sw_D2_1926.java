package sw_Intermediate;

import java.util.Scanner;

public class sw_D2_1926 {

	/*
 	[예제 풀이]
	N이 5일 경우,
	1 – 2 + 3 – 4 + 5 = 3
	
	N이 6일 경우,
	1 – 2 + 3 – 4 + 5 – 6 = -3
	
	[제약사항]
	N은 1 이상 10 이하의 정수이다. (1 ≤ N ≤ 10)
	
	[입력]
	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
	각 테스트 케이스에는 N이 주어진다.
	
	[출력]
	각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 누적된 값을 출력한다.
	(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] count = new int [T];
		
		for(int j = 0; j<T; j++) {
			int N = sc.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 1; i<=N; i++) {
				
				//홀수일 경우
				if(i%2==1) {
					sum1 += i;
				}else {
					sum2 += i;
				}
			}
			count[j] = sum1-sum2;
		}
		
		for(int i =0; i<count.length; i++) {
			System.out.println("#"+(i+1)+" "+count[i]);
		}
    }
}
