public class RecursiveMethod {
	public static void main(String[] args) {

		System.out.println(factorialLoop(5));
		System.out.println(1 * 2 * 3 * 4 * 5);

		System.out.println(factorialRecursive(5));

	}

	static int factorialLoop(int value) {
		var nilai = 1;

		for (var counter = 1; counter <= value; counter++) {
			nilai *= counter;
		}

		return nilai;
	}

	// factorial recursive
	static int factorialRecursive(int value){
		if (value == 1){
			return 1;
		} else {
			return value * factorialRecursive(value - 1);
		}
	}

}
