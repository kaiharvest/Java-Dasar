public class ForEach {
	public static void main(String[] args) {

		// kadang kita biasa mengakses data array menggunakan perulangan
		// mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu
		// mengakses array menggunakan counter yang kita buat
		// namun kita bisa menggunakan for each untuk mengakses seluruh data di array secara otomatis

		String[] array = {
				"satu", "dua", "tiga", "empat", "lima", "enam"
		};

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}


	}
}
