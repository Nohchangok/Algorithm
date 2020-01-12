package question;

import baeckjoon_interface.Munje;

public class Num2438 implements Munje{
	
	
	@Override
	public String toString() {
		return "Num2438";
	}

	public void print() {
		
		String str = "";
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				str+="*";			
			}
			str+="\n";
		}
		System.out.println(str);
		
	}	

}
