public class MethodParameter {
	public static void main(String[] args) {

		sayHello("Indra", "Dwi");
		sayHello("Budi", "Nugraha");

	}

	static void sayHello(String firstName, String lastName) {
		System.out.println("Hello " + firstName + " " + lastName);
	}

}
