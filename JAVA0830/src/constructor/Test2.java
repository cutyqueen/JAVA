package constructor;

public class Test2 {

	public static void main(String[] args) {
		
		// 기본 생성자 호출
		Account2 acc = new Account2();
		acc.showAccountInfo();
		
		System.out.println("----------------------------");
		
		// 계좌번호를 전달받는 생성자 호출
		Account2 acc2 = new Account2("999-9999-999");
		acc2.showAccountInfo();
		
		System.out.println("----------------------------");
		
		// 계좌번호, 예금주명을 전달받는 생성자 호출
		Account2 acc3 = new Account2("999-9999-999", "이순신");
		acc3.showAccountInfo();
		
		System.out.println("---------------------------");
		Account2 acc4 = new Account2("999-9999-999", "이순신", 10000);
		acc4.showAccountInfo();

	}

}

/*
 * Account2 클래스
 * - accountNo, ownerName, balance
 * - 파라미터 생성자(accountNo, ownerName, balance) 생성
 *   => 단축키 활용 가능!
 * - showAccountInfo() 메서드 
 */

class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	// 기본 생성자("111-1111-111", "홍길동", 0)
	public Account2() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	
	// 계좌번호를 파라미터로 전달받고, 홍길동, 현재잔고는 0으로 초기화하는 생성자
	public Account2(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	
	// 계좌번호, 예금주명을 파라미터로 전달받고, 현재잔고는 0으로 초기화하는 생성자
	public Account2(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}
	
	// 계좌번호, 예금주명, 현재잔고를 파라미터로 전달받는 파라미터 생성자 
	// 생성자 자동 생성 단축키 : Alt + Shift + S -> O
	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// showAccountInfo() 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
}





