public class Tugas10{
	public static void main(String[] args){
		Biodata b = new Biodata();

		b.setNama("Shofwatur Rohmah");
		b.setUmur(24);
		b.setAlamat("Demak");

		String namaPrint = b.getNama();
		int umurPrint = b.getUmur();
		String alamatPrint = b.getAlamat();

		System.out.println("Nama : " + namaPrint + "\nAlamat : " + alamatPrint + "\nUmur : " + umurPrint);
	}
}