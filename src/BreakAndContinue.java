public class BreakAndContinue {
	public static void main(String[] args) {

		// break juga digunakan untuk menghentikan seluruh perulangan
		// continue juga digunakan untuk menghentikan perulangan saat ini, lalu melanjutkannya keperulangan selanjutnya

		var nilai = 1;

		// kata kunci break
		while (true) {
			System.out.println("perulangan ke: " + nilai);
			nilai++;

			if (nilai > 10) {
				break;
			}
		}
		System.out.println("perulangan berhenti");

		// kata kunci continue

		for (int nilai1 = 1; nilai1 <= 100; nilai1++){
			if (nilai1 % 2 == 0) {
				continue;
			}
			System.out.println("perulangan ganjil: " + nilai1);
		}

	}
}
