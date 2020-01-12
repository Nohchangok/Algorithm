package baeckjoon;

import java.util.ArrayList;
import java.util.Scanner;

import baeckjoon_interface.Munje;
import question.Num2438;

public class Test {

	public static void main(String[] args) throws InterruptedException {

	
		/*
		 * 처음 프로젝트 실행시 메뉴 가 출력된다 (1. 문제 확인, 2. 종료 ...etc)
		 * 사용자가 1 입력시 문제 리스트 출력해준다 (1.별찍기 2.피라미드찍기, 3.고양이 .....)
		 * 사용자가 출력하고싶은 문제 번호를 입력하면 해당 알고리즘 실행 결과를 출력한다
		 * 사용자가 출력번호를 잘못입력했을때 (음수나, 0이나 , 문자를 입력) 다시 입력받는다
		 * 사용자가 문제 하나를 보고나서는 다시 문제리스트를 출력한다.
		 * 9999번을 만들어서 해당 번호를 입력하면 프로그램이 종료된다.
		 * 
		 * **/
		StorageTest storageTest = new StorageTest(); //백준문제 저장소 생성.
		ArrayList<Munje> algoListTest = storageTest.getAlgoList();

		System.out.println("안녕하세요. 반갑습니다^^. 창옥이의 백준 문제 저장소입니다.");
		
		while(true) {
			Scanner Input = new Scanner(System.in);
			int number = 0;
			Thread.sleep(2500);
			System.out.println("실행하려는 메뉴번호를 선택하세요.\n1. 문제 리스트 보기\n2. 종료");
			System.out.print("번호 입력 : ");
			System.out.println();
			
			try {
				number = Input.nextInt(); //try catch해주기
			}
			catch(Exception e) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			
			switch(number){ 
				case 1 : 
					for (int i=0; i < algoListTest.size(); i++) {
						System.out.println((i+1)+". "+algoListTest.get(i));
					}
					System.out.print("실행하려는 문제 번호 입력 : ");
					number = Input.nextInt();
					algoListTest.get(number-1).print(); //array리스트참고
					//부모클래스만들어서 문제들 상속받기
					break;
				
				case 2 : 
					System.out.println("프로그램을 종료합니다. 안녕히가세요^^");
					break;

			}
			if(number==2) {
				break;
			}
		}
	}
}


//		ArrayList<String> algoListSetterTest = new ArrayList<String>();
//		algoListSetterTest.add("thisisanonymousItem1");
//		algoListSetterTest.add("thisisanonymousItem2");
//		algoListSetterTest.add("thisisanonymousItem3");

//		try {			
//			for(String strItem : algoListTest) {
//				System.out.println("algoListItem : "+strItem);
//			}
//			
//			System.out.println("Setting ArrayList!");
//			storageTest.setAlgoList(algoListSetterTest);
//			algoListTest = storageTest.getAlgoList();
//
//			for(String strItem : algoListTest) {
//				System.out.println("algoListItem : "+strItem);
//			}
//			
//						
//		} catch (Exception e) {s
//			e.printStackTrace();
//			// TODO: handle exception
//		}



