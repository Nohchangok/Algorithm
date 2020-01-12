package question;

public class Num2920_1 {

	public static void main(String[] args) {
		
		//임의의 값을 배열에 저장.
		int[] array = new int[] {7,6,5,4,3,2,1,0};
		boolean asc = true;
		boolean desc = true;
		
		
		/* 배열안의 값이 1씩 증가하는 배열은 ascending 출력
		 * 배열안의 값이 1씩 감소하는 배열은 descending 출력
		 * 둘다 아닐경우 mixed를 출력
		 * */
		for (int i = 0; i < array.length-1; i++) {
			if(asc==true) {
				asc = (array[i]+1)==(array[i+1]);
				
			}else if(desc==true) {
				desc = (array[i]-1)==(array[i+1]);
				
			}else if(asc==false){
				asc = false;
				break;
				
			}else if(desc==false){
				desc = false;
				break;
			}
		}
		if(asc==true) {
			System.out.println("ascending");
		}else if(desc==true) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
				
