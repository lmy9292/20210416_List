package day16_pkg;

import java.util.*;
public class BankMain {

	public static void main(String[] args) {
		Bank b1=new Bank();

		Scanner scan= new Scanner(System.in);
		List<Bank>BankList=new ArrayList<Bank>();
		boolean run=true;
		int select=0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.고객등록 | 2.고객등록(생성자 | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료");
			System.out.println("-------------------------");
			System.out.print("번호>");
			select= scan.nextInt();
			
			if(select==1) {
			
			}
			else if(select==2) {
				
			}
			else if(select==3) {
				
			}
			else if(select==4) {
				
			}
			else if(select==5) {
				run=false;
			}
			
		}
		
		
		
		
	
		
		
		
		
	}
	
	
}
