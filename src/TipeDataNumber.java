public class TipeDataNumber {
	public static void main(String[] args) {

		// bilangan bulat
		byte iniByte = 100;
		short iniShort = 1000;
		int iniInt = 100000;
		long iniLong = 100000000;
		long iniLong2 = 10000000L;

		// bilangan decimal
		float iniFload = 10.12F;
		double iniDouble = 10.678;

		int decimalint = 10;
		int hexadecimal = 0x89;
		int binarydecimal = 0b10101010;

		// underscore
		long balence = 1_000_000_000;
		int sum = 60_000_000;

		// konversi tipe data number
		iniShort = iniByte;
		iniInt = iniShort;
		iniLong = iniInt;
		iniFload = iniLong;
		iniDouble = iniFload;

		// konversi sebaliknya
		float iniFload2 = (float) iniDouble;
		long iniLong3 = (long) iniFload2;
		int iniInt2 = (int) iniLong3;
		short iniShort2 = (short) iniInt2;


	}
}