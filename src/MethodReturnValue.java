public class MethodReturnValue {
	public static void main(String[] args) {

		// secara defauld method itu tidak menghasilkan value apapun
		// kita harus mendeklarasikan sebuah method dengan kata kunci return

		int result = sum(10, 20);

		System.out.println(result);

		System.out.println(sum(200, 300));

		System.out.println(hitung(40, "*" ,40));
		System.out.println(hitung(40, "salah" ,40));

	}

	static int sum(int value1, int value2) {
		int total = value1 + value2;
		return total;
	}

	static int hitung(int value1, String operasi, int value2) {
		switch (operasi) {
			case "+":
				return value1 + value2;
			case "-":
				return value1 - value2;
			case "*":
				return value1 * value2;
			default:
				return 0;
		}
	}

}
