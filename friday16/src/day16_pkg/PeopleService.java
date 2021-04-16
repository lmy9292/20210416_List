package day16_pkg;


import java.util.List;

public class PeopleService {
	
	//ArrayList를 받아와서 출력 하는 메소드 선언
	void listPrint(List<People> list1) {
		//매개변수 안에는 ArrayList를 받아온다
		System.out.println("listPrint 호출");
		System.out.println(list1.get(0));
		
		list1.get(1).setName("ps에서 변경");
		System.out.println(list1.get(1));
	}
	
	void peoPrint(People pp) {
		System.out.println("PeoplePrint 호출");
		System.out.println(pp);
	}
}
	
