package day16_pkg;

import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		
		Student s=new Student();
		//setter를 이용하여 필드값 지정
		//private으로 지정했기 때문에 접근 불가
		//s.name=("피카츄");
		s.setName("피카츄");
		//s.phone=("010-0000-0000");
		s.setPhone("010-0000-0000");
		//s.address=("포켓몬세상");
		s.setAddress("포켓몬세상");
		
		//  getter를 이용하여 필드값 가져오기
		String ss= s.getName();
		System.out.println(ss);
		
		System.out.println(s.getAddress());

		Student s1=new Student("꼬부기","010-1111-1111","물속");
		
		//Student 객체를 ArrayList에 저장
		//Student 객체를 담을 수 있는 ArrayList 필요
		List<Student>stuList=new ArrayList<Student>();
		
		stuList.add(s);
		stuList.add(s1);
		
		//stuList의 0번 인덱스에 저장한 stu1의 name값 출력해보기
		//System.out.println(stuList.get(0).name);
		System.out.println(stuList.get(0).getName());
		//System.out.println(stuList.get(1).name);
		System.out.println(stuList.get(1).getName());
		//String var1=stuList.get(0).name;
		String var1=stuList.get(0).getName();
		//System.out.println(var1);
		System.out.println(var1);
		//stuList.get(1).name="꼬부기로이름변경";
		stuList.get(1).setName("꼬부기로이름변경");
		//System.out.println(stuList.get(1).name);
		System.out.println(stuList.get(1).getName());
		
	}

}
