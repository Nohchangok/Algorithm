package sort;

import java.util.Scanner;

public class SelectSort2750 {

	public static void main(String[] args) {

		// 2750 : 수 정렬하기(selectSort)
		
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
		
		Scanner input = new Scanner(System.in);
		System.out.print("수의 개수 : ");
		int size = input.nextInt();
		
		int[] list = new int[size];
		
		while (true) {

			System.out.print("숫자 입력  : ");
			int number = input.nextInt();

			// 배열안에 입력값과 같은 값이 있는지 확인하기 위해 배열크기 만큼 반복.
			for (int i = 0; i < size; i++) {

				if (list[i] == number) { // 중복이아닐경우.
					break;
				} else { // 중복일 경우
					if (list[i] == 0) { // 중복이 아니지만 0일 경우.
						list[i] = number;
						break;
					} else { // 중복은 아니지만 0도 아닐경우(배열에 다른값이 들어있는경우)
						continue;
					}
				}

			}
			
			//배열 초기 세팅값이 0이므로, 마지막 배열 값이 0이 아닐경우 STOP.
			if (list[size - 1] != 0) {
				break;
			}

		}

		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		int temp;
		//주어진 리스트 중에 최소값을 찾는다.
		for(int i=0; i<list.length-1; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[j]<list[i]) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
				
			}
		}
		for (int n : list) {
			System.out.print(n+" ");
		}
		System.out.println();

	}

}
