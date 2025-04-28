public class MethodVariableArgument {
	public static void main(String[] args) {

		int[] values = {80, 90, 75, 65};
		sayCongrats("Indra" , values);

	}

	static void sayCongrats(String name, int... values) {
		var total = 0;
		for (var value : values) {
			total += value;
		}

		var finalValue = total / values.length;

		if (finalValue >= 75) {
			System.out.println("Selamat " + name + ", anda lulus");
		} else {
			System.out.println("Selamat " + name + ", anda tidak lulus");
		}
	}

}
