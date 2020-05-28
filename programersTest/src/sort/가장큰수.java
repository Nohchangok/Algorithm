package sort;

import java.util.ArrayList;

public class 가장큰수 {
	
	/*
	 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
	 * 
	 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중
	 * 가장 큰 수는 6210입니다.
	 * 
	 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어
	 * return 하도록 solution 함수를 작성해주세요.
	 * 
	 * 제한 사항 numbers의 길이는 1 이상 100,000 이하입니다. numbers의 원소는 0 이상 1,000 이하입니다. 정답이 너무
	 * 클 수 있으니 문자열로 바꾸어 return 합니다.
	 * 
	 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/42746
	 */
	
	public static void main(String[] args) {
		
		String[] numbers = new String[] {"3", "30", "34", "5", "9"};
		ArrayList<Integer> Copy = new ArrayList<Integer>();
		
		int size = numbers.length;
		int temp;
		
		
		
/*		for(int i = 0; i<size; i++) {
			String number="";
			number = numbers[i];
			for(int j = 0; j<size; j++) {
				if(i==j) {
					continue;
				}
				number += numbers[j];
			}
			Copy.add(Integer.parseInt(number));
			
			number="";
			number = numbers[i];
			
			for(int j = size-1; j>=0; j--) {
				if(i==j) {
					continue;
				}
				number += numbers[j];
			}
			Copy.add(Integer.parseInt(number));
		}
		System.out.println(Copy.toString());
	
		
		for (int i = 1; i < Copy.size(); i++) {
			for (int j = i-1; j >= 0; j--) {
				if (Copy.get(j) > Copy.get(j+1)) {
					temp = Copy.get(j);
					Copy.set(j, Copy.get(j+1));
					Copy.set(j+1,temp);
				}
			}
			System.out.print(i+"번째 : ");
			for (int k : Copy) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		System.out.println("가장큰수는 ::: "+Copy.get(Copy.size()-1));
	}
*/
}
