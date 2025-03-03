public class Array {
	public static void main(String[] args) {

		// array juga bisa menampung string dan number

		String[] arrayString;
		arrayString = new String[3];

		arrayString[0] = "Indra";
		arrayString[1] = "Dwi";
		arrayString[2] = "Prabowo";

		System.out.println(arrayString[0]);
		System.out.println(arrayString[1]);
		System.out.println(arrayString[2]);

		int[] arrayInt = new int[] {
			10, 90, 80
		};

		long[] arrayLong = {
			20L, 40L, 70L, 30L, 70L
		};

		arrayLong[0] = 100L;

		System.out.println(arrayLong[0]);
		System.out.println(arrayLong.length);

		String[][] members = {
				{"satu", "dua", "tiga", "empat"},
				{"lima", "enam", "tujuh"},
				{"delapan", "sembilan"}
		};

		System.out.println(members[0][0]);
		System.out.println(members[1][0]);
		System.out.println(members[2][0]);

	}
}