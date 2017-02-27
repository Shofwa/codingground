public class Tugas4{

     public static void main(String []args){
        int parameter = 1;
        int hasil = Penjumlahan(parameter);
        System.out.println("Angka penjumlahan " + parameter + " + 2 = " + hasil);
     }
     
     public static int Penjumlahan(int a1) {
      int angka = a1;

      return angka + 2; 
   }
}