package question;

import baeckjoon_interface.Munje;

public class Num2577 implements Munje{
	
	@Override
	public String toString() {
		return "Num2577";
	}

	public void print() {
		
		int A = 100;
		int B = 200;
		int C = 300;
		int Isum = A*B*C;
	

		String Ssum = Integer.toString(Isum);

		String[] str = Ssum.split("");

		// 0-9까지 반복
		// i를 스트링으로 변환하여
		// str배열에 있는 문자와 비교한다.
		// 같으면 +1을 해준다.
		
		int i =0;
		int j =0;
		int sum = 0;
		
		for (i = 0; i < 10; i++) {
			for(j = 0; j<str.length; j++) {
				if((Integer.valueOf(str[j])==i)==true) { 
					sum++;
				}
			}
			System.out.println(i+" : "+sum);
			sum =0;
		}
		
	}
}
