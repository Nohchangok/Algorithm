package sort;

import java.util.Arrays;

public class k번째수 {
	
	/*
	 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	 * 
	 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	 * 
	 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다. 2에서
	 * 나온 배열의 3번째 숫자는 5입니다. 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질
	 * 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution
	 * 함수를 작성해주세요.
	 * 
	 * 제한사항 array의 길이는 1 이상 100 이하입니다. array의 각 원소는 1 이상 100 이하입니다. commands의 길이는 1
	 * 이상 50 이하입니다. commands의 각 원소는 길이가 3입니다.
	 * 
	 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
	 */
	
	public static int solution(int[] array, int i, int j, int k) {
		
		int[] arrayCopy = Arrays.copyOfRange(array, i-1, j);
		int size = arrayCopy.length;
		int temp;
		
		//bubblesort로 정렬
		for(int l = 0; l<size-1; l++) {
			for(int n = 0; n<size-1; n++) {
				
				if(arrayCopy[n]>arrayCopy[n+1]) {
					temp = arrayCopy[n+1];
					arrayCopy[n+1] = arrayCopy[n];
					arrayCopy[n] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array)+"를 "+i+"번째부터 "+j+"번째까지 자른 후 정렬합니다."+Arrays.toString(arrayCopy)+"의 "+k+"번째 숫자는 "+arrayCopy[k-1]+"입니다.");
		return arrayCopy[k-1];
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int number = 0;
		
		number = solution(array, 4, 4, 1);
		System.out.println("return값 :::"+number);
		
	}
	

}

	
