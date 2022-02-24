import java.util.Scanner;

public class SelectSort2750 {

	public static void main(String[] args) {

		// 2750 : 수 정렬하기(selectSort)
		
		/*
		 * 주어진 리스트 중에 최소값을 찾는다.
		 * 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
		 * 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
		 */
		
		int[] list = new int[] {10,8,11,4,1};
		int temp;
		int size = list.length;
		int min;
		
		
		//주어진 리스트 중에 최소값을 찾는다.
		for(int i=0; i<size-1; i++) { //마지막 요소는 자연스럽게 정렬됨.
			min = i;
			
			for(int j=i+1; j<size; j++) { //2번째 값부터 정렬	

				//최소값을 찾아 min에 저장.
				if(list[min]>list[j]) {
					min = j; //4		
				}
				System.out.println("min ::: "+min);
			}
			
			temp = list[i];
			list[i] = list[min];
			list[min] = temp;
			
			System.out.print(i+"번째 : ");
			for (int k : list) {
				System.out.print(k + " ");
			}
			System.out.println();
			
		}

	}

}
