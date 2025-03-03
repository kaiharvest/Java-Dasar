public class IfStatement {
	public static void main(String[] args) {

		int nilai = 80;
		int absen = 70;

		if (nilai >= 80 && absen >= 80) {
			System.out.println("A");
		} else if (nilai >= 70 && absen >= 70) {
			System.out.println("B");
		} else {
			System.out.println("Anda tidak Lulus");
		}

	}
}
