package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2750 {

	public static void main(String[] args) {

		// 2720 : 수 정렬하기(bubbleSort)

		/*
		 * 자신의 옆에 인덱스와 비교한다.
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

				if (numberList[i] == number) { // 중복일 경우.
					break;
				} else { // 중복이 아닐 경우
					if (numberList[i] == 0) { // 중복이 아니지만 0일 경우.
						numberList[i] = number;
						break;
					} else { // 중복은 아니지만 0도 아닐경우(배열에 다른값이 들어있는경우)
						continue;
					}
				}

			}
			
			//배열 초기 세팅값이 0이므로, 마지막 배열 값이 0이 아닐경우 STOP.
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
			System.out.print(i+"번째 : ");
			for (int k : numberList) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		
		
	}
}

