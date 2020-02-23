package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2750 {

	public static void main(String[] args) {

		// 2720 : 수 정렬하기

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

		int[] numberList = new int[size];

		// size만큼 배열에 값 입력

		while (true) {

			System.out.print("숫자 입력  : ");
			int number = input.nextInt();

			// 배열안에 입력값과 같은 값이 있는지 확인하기 위해 배열크기 만큼 반복.
			for (int i = 0; i < size; i++) {

				if (numberList[i] == number) { // 중복이아닐경우.
					break;
				} else { // 중복일 경우
					if (numberList[i] == 0) { // 중복이 아니지만 0일 경우.
						numberList[i] = number;
						break;
					} else { // 중복은 아니지만 0도 아닐경우(배열에 다른값이 들어있는경우)
						continue;
					}
				}

			}

			if (numberList[size - 1] != 0) {
				break;
			}

		}

		for (int i : numberList) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		
//		오름차순으로 넣을 arrayList 생성.
		int changeNum;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (numberList[j] > numberList[j + 1]) {
					changeNum = numberList[j];
					numberList[j] = numberList[j + 1];
					numberList[j + 1] = changeNum;
				}
			}
		}

		for (int i : numberList) {
			System.out.print(i + " ");
		}
		
	}
}

