package day16_pkg;
import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean run=true;
		List<BankDTO> clientList =new ArrayList<BankDTO>();
		//타입 = List<BankDTO> clientList
		BankDTO client=null;
		
		//Service 클래스 객체
		BankService bs =new BankService();
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.고객등록 | 2.고객등록(생성자) | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택>");
			int select= scan.nextInt();
			
			switch (select) {
			case 1 :
				 client =new BankDTO();
				 int clientNumber=clientList.size()+1;
				System.out.print("이름 :");
				String name=scan.next();
				System.out.print("계좌 :");
				String accountNumber =scan.next();
				System.out.print("입금액 :");
				int balance = scan.nextInt();
				//입력받은 값을 BankDTO 객체 필드값으로 저장
				client.setClientNumber(clientNumber);
				client.setName(name);
				client.setAccountNumber(accountNumber);
				client.setBalance(balance);
				clientList.add(client);
				break;

		
		
				
			case 2 :
				System.out.print("이름 :");
				name=scan.next();
				System.out.print("계좌 :");
				accountNumber =scan.next();
				System.out.print("입금액 :");
				balance= scan.nextInt();
				client=new BankDTO(0, name, accountNumber, balance);
				clientList.add(client);
				break;
			
			case 3 :
				//계좌번호(String)String이 같은지 비교할 때는 ==쓰지 않고 equals() 메소드 사용
//				System.out.print("계좌 :");
//				accountNumber =scan.next();
//				System.out.print("입금액 :");
//				int deposit= scan.nextInt();
//				for(int i=0; i<clientList.size(); i++) {
//					if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
//						//입금처리:기존 잔고에 입금액을 더해서 잔고를 바꾸는것
//						balance=clientList.get(i).getBalance()+deposit;
//						clientList.get(i).setBalance(balance);
//					}else {
//						System.out.println("없는 계좌 입니다");
//					}
//				}
				
				//BankService 클래스에 있는 입금용 메소드를 사용
				clientList=bs.deposit(clientList);
				break;
				
				//리턴이 있는 메소드 호출 방식
				//=리턴 결과를 받아주는 clientList가 필요
				//리턴이 없는 메소드 호출 방식
				//=
				
				
				
			
			case 4 :
//				System.out.print("계좌 :");
//				accountNumber =scan.next();
//				System.out.print("입금액 :");
//				int withdraw= scan.nextInt();
//				for(int i=0; i<clientList.size(); i++) {
//					if(accountNumber.equals(clientList.get(i).getAccountNumber())) {
//						if(withdraw<=clientList.get(i).getBalance()) {
//						balance=clientList.get(i).getBalance()-withdraw;
//						clientList.get(i).setBalance(balance);	
//						}else {
//							System.out.println("잔고가 부족합니다");
//						}
//					}else {
//						System.out.println("없는 계좌 입니다");
//					}
//				}
				clientList=bs.withdraw(clientList);
				break;
			case 5 :
				for(int i=0; i<clientList.size(); i++) {
					System.out.println(clientList.get(i));
				}
				break;
			case 6 :
					break;
			default:
				System.out.println("메뉴에 없는 번호 입니다");
				break;
			}
				
					
		
		
		
		
	
		
		
		
		
	}
	
	}


	}

