package sort;

import java.util.Scanner;

public class SelectSort2750 {

	public static void main(String[] args) {

		// 2750 : 수 정렬하기(insertSort)
		
		/*
		 * 주어진 리스트 중에 최소값을 찾는다.
		 * 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
		 * 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
		 */

		/*
		 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오. 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤
		 * 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지
		 * 않는다. 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다. ex 입력 : 5 5 2 3 4 1 ex
		 * 출력 : 1 2 3 4 5
		 *
		 */
		
		int[] list = new int[] {10,8,11,4,1};
		int temp;
		
		//주어진 리스트 중에 최소값을 찾는다.
		for(int i=1; i<list.length; i++) {
			
			//자신의 앞 원소들을 비교한다.
			for(int j=0; j<i; j++) {
				
				//앞에 원소가 자신보다 크면 자리를 바꾼다.
				if(list[i]<list[j]) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
			
		}
		for (int i : list) {
			System.out.println(i+" ");
		}
	}

}
