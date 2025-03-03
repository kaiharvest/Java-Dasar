public class TipeDataBukanPrimitif {
	public static void main(String[] args) {

		// keterangan
		// 1. tipe data primitif tidak dapat di ubah lagi value nya
		// 2. tipe data number, char, boolean adalah tipe data primitif
		// 3. string bukan tipe data primitif
		// 4. tipe data bukan primitif huruf depannya Kapital/ besar
		// 5. tipe data primitif data nya tidak boleh null

		Integer iniInterger = 100;
		Long iniLong = 10000L;
		Byte iniByte = null;

		int iniInt = 200;
		Integer iniInt2 = iniInt;

		System.out.println(iniInt);
		System.out.println(iniByte);

		iniByte = 10;
		System.out.println(iniByte);

	}
}
