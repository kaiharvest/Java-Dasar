public class OperasiMatematika {
	public static void main(String[] args) {

		// unary operator
		// 1. ++ : a = a + 1
		// 2. -- : a = a - 1
		// 3. - : negatif
		// 4. ! : boolean kebalikan

		int a = 100;
		int b = 2;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		int c = 100;

		c += 10;
		System.out.println(c);

		c -= 10;
		System.out.println(c);

		c *= 10;
		System.out.println(c);

		int d = 100;

		d++;
		System.out.println(d);

		d--;
		System.out.println(d);

	}
}
