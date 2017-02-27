public class Tugas5{

     public static void main(String []args){
        int parameter = 2;
        int hasil = Penjumlahan(parameter);
        System.out.println("Angka penjumlahan " + parameter + " + 1 = " + hasil);
     }
     
     public static int Penjumlahan(int a1) {
      int angka = a1;

      return angka + 1; 
   }
}