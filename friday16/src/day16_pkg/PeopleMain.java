package day16_pkg;

import java.util.ArrayList;
import java.util.List;

public class PeopleMain {

	public static void main(String[] args) {
		
		People p=new People();
		p.setName("호랑이");
		p.setrNumber("11111-11111");
		p.setAddress("숲");
		p.setAge(100);
		
		People p1=new People();
		p1.setName("여우");
		p1.setrNumber("22222-22222");
		p1.setAddress("골짜기");
		p1.setAge(90);
		
		People p2=new People();
		p2.setName("사슴");
		p2.setrNumber("33333-333333");
		p2.setAddress("들판");
		p2.setAge(80);
		
		List<People>peoList=new ArrayList<People>();
		peoList.add(p);
		peoList.add(p1);
		peoList.add(p2);
		
		System.out.println(peoList.get(0).getName());
		
		for(int i=0; i<peoList.size(); i++) {
			System.out.println(peoList.get(i).getName());
			System.out.println(peoList.get(i).getrNumber());
			System.out.println(peoList.get(i).getAddress());
			System.out.println(peoList.get(i).getAge());
		}
		for(int i=0; i<peoList.size(); i++) {
			System.out.println(peoList.get(i));
		}
		System.out.println(peoList.get(0));
		System.out.println(p1.toString());
		
		
		
		//PeopleService 클래스 객체 선언
		PeopleService ps= new PeopleService();
		//listPrint 메소드 호출
		System.out.println("listPrint 호출 전");
		ps.listPrint(peoList);
		System.out.println("listPrint 호출 끝");
		for(int i=0; i<peoList.size(); i++) {
			System.out.println(peoList.get(i));
		}
		ps.peoPrint(p1);
	}

}
