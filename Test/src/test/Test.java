package test;

public class Test {

	public static void main(String[] args) {
		int pee = 50000;
		int age = 19;

		if(age < 5 || age >= 65) {
			System.out.println("나이가 " + age + "세 이므로 입장료는 " + (pee*0.5) + "원입니다.");
		} else if (age >= 5 && age <= 19){
			System.out.println("나이가 " + age + "세 이므로 입장료는 " + (pee*0.3) + "원입니다.");
		} else {
			System.out.println("나이가 " + age + "세 이므로 입장료는 " + pee + "원입니다.");
		}	
	}

}
