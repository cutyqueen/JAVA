package generic;

public class Person {
	String name;
	int age;
	
	// Alt + Shift + S -> O : 파라미터 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Alt + Shift + S -> S : toString() 오버라이딩
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
		
	
}
