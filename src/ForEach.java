public class ForEach {
	public static void main(String[] args) {

		// kadang kita biasa mengakses data array menggunakan perulangan
		// mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu
		// mengakses array menggunakan counter yang kita buat
		// namun kita bisa menggunakan for each untuk mengakses seluruh data di array secara otomatis

		String[] angkas = {
				"satu", "dua", "tiga", "empat", "lima", "enam"
		};

		for (int i = 0; i < angkas.length; i++) {
			System.out.println(angkas[i]);
		}
		System.out.println("berhenti perulangan");

		// menggunakan kata kunci foreach
		for (var angka : angkas) {
			System.out.println(angka);
		}


	}
}
