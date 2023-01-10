package school;

import java.util.Scanner;

class AccountNum {
	String accountNum;// 계좌번호
	int nowMoney;// 현재 잔액
	
	public AccountNum(String accountNum, int nowMoney) {
		this.accountNum = accountNum;
		this.nowMoney = nowMoney;
	}
	// 입금 메서드
	void deposit(int money) {
		this.nowMoney += money;
	}
	// 출금 메서드
	void withdraw(int money) {
		this.nowMoney -= money;
	}
	// 출력 메서드
	void print() {
		System.out.println("계좌번호 "+accountNum+"의 현재 잔액 : "+nowMoney);
	}
}

public class Account {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		AccountNum[] ac = new AccountNum[3];
		
		// 입출금
		for ( int i = 0; i < ac.length; i++) {
			System.out.println("======================================");
			System.out.print("계좌번호 입력 : ");
			ac[i] = new AccountNum(scan.next(), 0);
			ac[i].print();
			System.out.print("\n입금할 금액 : ");
			ac[i].deposit(scan.nextInt());
			ac[i].print();
			System.out.print("\n출금할 금액 : ");
			int money = scan.nextInt();
			// 잔액 부족
			if (money > ac[i].nowMoney)
				System.out.println("출금하려는 계좌의 잔액이 부족하여 출금이 불가능합니다");
			else
				ac[i].withdraw(money);			
			ac[i].print();
		}
		
		// 출력
		System.out.println("======================================");
		System.out.println("계좌번호\t\t잔액");
		System.out.println("======================================");
		for ( int i = 0; i < ac.length; i++) {
			System.out.printf("%s\t      %5d\n", ac[i].accountNum, ac[i].nowMoney);
		}
		System.out.println("======================================");
	}

}
