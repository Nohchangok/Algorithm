package question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Num1157 {

	// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
	// 단, 대문자와 소문자를 구분하지 않는다.

	public static void main(String[] args) {

		// 소문자를 대문자로 변환.
		String str = "Mississipp";
		String strcopy = str.toUpperCase();

		// str의 문자열을 하나씩 꺼내어 char자료형 배열에 집어 넣음.
		char[] array = strcopy.toCharArray();
		
		int sum = 0;
		int max = 0; //가장 큰 값.

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					sum += 1;
					System.out.println(array[i]);
					max = (sum > max) ? sum : max;
				}
			}
			System.out.println(array[i] + "의 갯수  : " + sum);
			sum = 0;
		}
		System.out.println("가장 큰 수 : " + max);
	}

	// max값이 가장큰 index값을 구해야함!!

}
