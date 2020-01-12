package baeckjoon;

import java.util.ArrayList;

import baeckjoon_interface.Munje;
import question.Num2438;
import question.Num2577;
import question.Num2920;
import question.Num10818;

public class StorageTest {
	
	ArrayList<Munje> AlgoList; //String 자료형의 ArrayList 선언.
	
	public StorageTest() { //생성자생성.
		AlgoList = new ArrayList<Munje>();	 //AlogList변수에 ArrayList 객체를 대입.
		AlgoList.add(new Num2438());
		AlgoList.add(new Num10818());
		AlgoList.add(new Num2920());
		AlgoList.add(new Num2577());
		
	}
	
	public ArrayList<Munje> getAlgoList() { //Munje자료형의 ArrayList 객체생성.
		return AlgoList; 
	}

	
	
//	public void addAlgoListItem(String item) {
//		if(AlgoList != null) {
//			AlgoList.add(item);
//		}
//	}
	
//	public void setAlgoList(ArrayList<String> algoList) {
//		AlgoList = algoList;
//	}
	

		 //백준문제를 담을 저장소 생성.

//		stroage.add(new Num2438());
		
//		stroage.toString();
		


}
