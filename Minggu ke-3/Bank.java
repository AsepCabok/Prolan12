public class Bank {
	private String  nama,JenisKelamin,jenis;
			int  umur;
	
	private void Menabung () {
		System.out.println ("Menyetor Di Bank BNI");
	}
	
	public static void main (String[] args) {
		 CustumerService Anissa = new CustumerService();

		Anissa.nama = "Anissa lestari";
        Anissa.MelayaniKonsumen();
	}
}
