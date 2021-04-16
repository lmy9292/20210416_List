package day16_pkg;

public class People {

	private String name;
	private String rNumber;
	private String address;
	private int age;
	
	People(){
		
	}
	
	//마우스 우클릭>source>Generate constructor using fields

	public People(String name, String rNumber, String address, int age) {
		super();//부모클래스가 가지고 있는 생성자를 호출
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getrNumber() {
		return rNumber;
	}



	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	//마우스 우클릭>source>Generate toString()...
	@Override
	public String toString() {
		return "People [name=" 
	+ name 
	+ ", rNumber=" 
	+ rNumber 
	+ ", address=" 
	+ address 
	+ ", age=" 
	+ age + "]";
	}
	
	
	
}
