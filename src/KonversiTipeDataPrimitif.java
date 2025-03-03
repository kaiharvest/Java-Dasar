public class KonversiTipeDataPrimitif {
	public static void main(String[] args) {

		int age = 22;
		Integer ageObject = age;

		int ageAgain = ageObject;

		short shortAge = ageObject.shortValue();
		byte byteAge = ageObject.byteValue();

	}
}
