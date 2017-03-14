public class Bank {
	private String  nama,JenisKelamin,jenis;
			int  umur;
	
	public static void main (String[] args) {
		 CustumerService Cstr = new CustumerService();
		 System.out.println(Cstr.nama);
		Cstr.jenisKelamin("L,P");
        Cstr.jenisKelamin("L,P","laki-laki atau perempuan");
	}
}
