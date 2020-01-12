package question;

import baeckjoon_interface.Munje;

public class Num10818 implements Munje{
	
	public String toString() {
		return "Num10818";
	}

	public void print() {
		int[] numbers = new int[]{1,0,2,1,1,-1};
		
		int max = 0;
		int min = 100;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}if(numbers[i]<min) {
				min = numbers[i];
			}
		}
		System.out.println("numbers의 배열의 최댓값과 최소값 구하기.");
		System.out.println("최대값 : "+max);
		System.out.println("최솟값 : "+min);
	
	}
}
