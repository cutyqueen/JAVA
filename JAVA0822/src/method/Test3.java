package method;

public class Test3 {

	public static void main(String[] args) {
		// 5. 파라미터가 2개 이상인 메서드 호출 연습
		// => 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 호출하고
		//    리턴값을 출력(ex. 10, 20 전달 시 10 + 20 결과인 30 리턴)
		int result = sum(10, 20);
		System.out.println("계산 결과 = " + result);
//		System.out.println("계산 결과 = " + sum(10, 20));
		
		System.out.println("==================================");
		
		// => 연산자 문자 1개와 정수 2개를 전달하면
		//    두 정수에 대한 어떤 연산을 수행한 후
		//    결과값을 리턴하는 메서드 호출하고 리턴되는 값을 출력
		//    ex) '+', 10, 20 전달 시 10 + 20 결과인 30 리턴
		//    ex) '-', 10, 20 전달 시 10 - 20 결과인 -10 리턴
		int result2 = opertation('+', 10, 20);
		System.out.println("연산 결과 = " + result2);
		
		result2 = opertation('-', 10, 20);
		System.out.println("연산 결과 = " + result2);
		
		result2 = opertation('*', 10, 20);
		System.out.println("연산 결과 = " + result2);
		

	} // main() 메서드 끝
	
	// 5. 파라미터가 2개 이상인 메서드 정의 연습
	// => 연산자 문자 1개와 정수 2개를 전달받아
	//    두 정수에 대한 어떤 연산을 수행한 후 결과값을 리턴하는 메서드 정의
	public static int opertation(char opr, int num1, int num2) {
		// 연산자 문자(char 타입) 판별 (== 사용)
//		if(opr == '+') { // 덧셈
//			return num1 + num2;
//		} else if(opr == '-') {
//			return num1 - num2;
//		} else {
//			// 잘못된 연산자가 입력되었을 경우
//			// 오류 메세지 출력 후 0 리턴(가정)
//			System.out.println("연산자가 올바르지 않습니다!");
//			return 0;
//		}
		int result = 0; // 연산 결과를 저장할 변수
		
		if(opr == '+') { // 덧셈
			return num1 + num2;
		} else if(opr == '-') {
			return num1 - num2;
		} else {
			// 잘못된 연산자가 입력되었을 경우
			// 오류 메세지 출력 후 0 리턴(가정)
			System.out.println("연산자가 올바르지 않습니다!");
		}
		
		return result;
		// 주의! 변수 값을 리턴하는 경우 반드시 변수값 초기화 필수!
		
	}
	
	// ------------------------------------------------------------
	// => 정수 2개를 전달받아 두 정수의 합을 리턴하는 메서드를 정의
	//    ex 10, 20 전달 시 10 + 20 결과인 30 리턴
	public static int sum(int num1, int num2) {
		System.out.println("숫자1 = " + num1);
		System.out.println("숫자2 = " + num2);
		return num1 + num2;
	}
	
	

} // Test3 클래스 끝