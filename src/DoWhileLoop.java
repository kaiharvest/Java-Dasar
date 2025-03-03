public class DoWhileLoop {
	public static void main(String[] args) {

		// do while loop adalah perulangan mirip seperti while loop
		// perbedaannya di konsisi pengecekannnya, do while loop di kerjakan dulu perulangan dilakukan
		// oleh karena itu dalam do while loop minimal pasti sekali perulangan dilakukan walaupun kondisi false

		var nilai = 1;

		do {
			System.out.println("perulangan ke: " + nilai);

			nilai++;
		} while (nilai <= 10);

	}
}
