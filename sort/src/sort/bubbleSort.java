package sort;

public class bubbleSort {

	public static void main(String[] args) {
		
		int[] numberList = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
		
		int changeNum;
		int result = 1;
		
		System.out.println("버블 정렬로 정렬할 원소 : 69, 10, 30, 2, 16, 8, 31, 22\n");

		for (int i = 7; i > 0; i--) {
			System.out.println("버블정렬 "+result+"단계 : ");

			for (int j = 0; j < numberList.length - 1; j++) {
				if (numberList[j] > numberList[j + 1]) {
					changeNum = numberList[j];
					numberList[j] = numberList[j + 1];
					numberList[j + 1] = changeNum;
				}
				
					
				if(i>j) {
					System.out.print("\t");
					for (int k : numberList) {
						System.out.print(k + " ");
					}
					System.out.println();
				}
				
			}
			result++;
			
		}

	}

}
