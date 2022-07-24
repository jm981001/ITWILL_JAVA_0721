package constructor;

/*
 * 은행계좌 (Account) 클래스 정의
 * - 멤버변수
 * 		1) 계좌번호(accountNo, 문자열)
 * 		2) 예금주명(ownerName, 문자열)
 * 		3) 현재잔고(balance, 정수)
 * 
 * - 생성자 모든 멤버변수(필드, 속성)를 전달받은 값으로 초기화 해주는 생성자 
 * */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this.accountNo = "3333333";
		this.ownerName = "권예진";
	}
	
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		System.out.println("this : " + this); 
		// 손정민의 this : constructor.Account@15db9742
		// 우영우의 this : constructor.Account@6d06d69c
		
		this.accountNo = newAccountNo;
		this.ownerName = newOwnerName;
		this.balance = newBalance;

	}
}

///////////////////////////////////////////////////////////

public class Test1 {
	public static void main(String[] args) {
		
		Account acc = new Account("1111", "손정민", 10000);
		System.out.println(acc);
		System.out.println("계좌번호: " + acc.accountNo);
		System.out.println("예금주명: " + acc.ownerName);
		System.out.println("현재잔고: " + acc.balance);
		System.out.println("=============================");
		
		Account acc2 = new Account("222222", "우영우", 10000);
		System.out.println(acc2);
		System.out.println("=============================");

		Account acc3 = new Account("333333", "권예진", 10000);
		System.out.println("계좌번호: " + acc3.accountNo);
		System.out.println("예금주명: " + acc3.ownerName);
		System.out.println("현재잔고: " + acc3.balance);
		
	}

}
