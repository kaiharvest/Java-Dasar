public class SwitchStatement {
	public static void main(String[] args) {

		// 1. switch adalah statement percabangan yang sama dengan if, namun lebih sederhana
		// 2. kondisi di switch hanya untuk perbandingan == (sama dengan)
		// 3. switch harus ada case(value) dan brack

		String nilai = "A";

		switch (nilai) {
			case "A":
				System.out.println("Anda lulus dengan baik");
				break;
			case "B":
			case "C":
				System.out.println("Anda lulus");
				break;
			default:
				System.out.println("Mungkin anda salah jurusan");
		}

		String nilai1 = "B";

		switch (nilai1) {
			case "A" -> System.out.println("Anda lulus dengan baik");
			case "B", "C" -> System.out.println("Anda lulus");
			case "D" -> System.out.println("Anda tidak lulus");
			default -> System.out.println("Mungkin anda salah jurusan");
		}

		var nilai2 = "C";
		String ucapan = switch (nilai2) {
			case "A":
				yield "Anda lulus dengan baik";
			case "B", "C":
				yield "Anda lulus";
			case "D":
				yield "Anda tidak lulus";
			default:
				yield "Mungkin anda salah jurusan";
		};
		System.out.println(ucapan);

	}
}
