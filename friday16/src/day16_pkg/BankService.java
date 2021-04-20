package day16_pkg;

import java.util.List;
import java.util.Scanner;

//Serivce 클래스:처리를 담당하는 클래스(업무를 처리하는 비즈니스 클래스)
public class BankService {
	//입금처리를 위한 메소드 선언
	/*
	 * 메소드이름 : deposit
	 * 매개변수 : clientList 
	 * 리턴 : clientList (MaIN Class가 가장 데이터를 가져야하기때문에)
	 */
	Scanner scan=new Scanner (System.in);
	List<BankDTO> deposit(List<BankDTO> clientList){
		System.out.print("계좌 :");
		String accountNumber =scan.next();
		System.out.print("입금액 :");
		int deposit= scan.nextInt();
		for(int i=0; i<clientList.size(); i++) {
			if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
			 int balance=clientList.get(i).getBalance()+deposit;
				clientList.get(i).setBalance(balance);
			}else {
				System.out.println("없는 계좌 입니다");
			}
		}
		return clientList;
	}
	/*
	 * 메소드이름:withdraw
	 * 매개변수:clientList
	 * 리턴:clientList
	 */
	List<BankDTO> withdraw(List<BankDTO> clientList){
	System.out.print("계좌 :");
	String accountNumber =scan.next();
	System.out.print("입금액 :");
	int withdraw= scan.nextInt();
	for(int i=0; i<clientList.size(); i++) {
		if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
			if(withdraw<=clientList.get(i).getBalance()) {
			int balance=clientList.get(i).getBalance()-withdraw;
			clientList.get(i).setBalance(balance);	
			}else {
				System.out.println("잔고가 부족합니다");
			}
		}else {
			System.out.println("없는 계좌 입니다");
		}
	}return clientList;

	}
	
	


	


	
	
}
