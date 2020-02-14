package lab3;

public class PersonTest {

	public static void main(String[] args) {
		Person a;
		a = new Person("The Rock", 20);
		System.out.println(a.getAge());
		System.out.println(a.getName());
		System.out.println(a.getNameLength());
	}

}
