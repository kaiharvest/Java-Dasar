public class BreakAndContinue {
	public static void main(String[] args) {

		var nilai = 1;

		while (true) {
			System.out.println("perulangan ke: " + nilai);
			nilai++;

			if (nilai > 10) {
				break;
			}
		}
		System.out.println("perulangan berhenti");

		for (int nilai1 = 1; nilai1 <= 100; nilai1++){
			if (nilai1 % 2 == 0) {
				continue;
			}
			System.out.println("perulangan ganjil: " + nilai1);
		}

	}
}
