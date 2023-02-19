package toko;
import java.util.Scanner;

public class toko {
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String kode;
      int Prosesor=200000;
      int keyboard=150000;
      int monitor=400000;
      int Ram=250000;
      int jumlah, bayar, total;
      int ppndantotal;
      float diskon;
      float PPN; 

      boolean kondisi=true;
      while(kondisi) {

      System.out.println("");
      System.out.println("============Aplikasi Hitung============");
      System.out.println("||\n====Program Pembelian Barang====      ||");
      System.out.println("||\n---Masukan kode barang---");
      System.out.println("||1. PC");
      System.out.println("||2. KB");
      System.out.println("||3. MO");
      System.out.println("||4. RM");
      System.out.println("=======================================");
      System.out.print("\nKode barang : ");
      kode=input.next();
      if(kode.equalsIgnoreCase("PC")) {
         System.out.println("\nNama Barang : Prosesor Intel Core I3");
         System.out.println("Harga : Rp.200000");
         System.out.println("---------------------------------------");
         System.out.print("Jumlah beli : ");
         jumlah=input.nextInt();
         bayar=jumlah*Prosesor;
         System.out.println("Total bayar :Rp.200000"+jumlah);
         if(bayar>=200000) {
            diskon=(float)0.2*bayar;
            total=bayar-(int)diskon;
            PPN=(float)0.1*bayar;
            ppndantotal=bayar-(int)PPN;
            System.out.println("Mendapat diskon 20% :Rp."+diskon);
            System.out.println("Bayar :Rp."+total);
            System.out.println("PPN :Rp."+PPN);
            System.out.println("Bayar + PPN 10% :Rp."+ppndantotal);
            System.out.println("=======================================");
            System.out.println("Kepuasan Anda Prioritas Kami");
         }
      }
      if(kode.equalsIgnoreCase("KB")) {
         System.out.println("\nNama Barang : keyboard");
         System.out.println("Harga : Rp.150000");
         System.out.print("Jumlah beli : ");
         jumlah=input.nextInt();
         bayar=jumlah*keyboard;
         System.out.println("Total bayar :Rp."+jumlah);
         if(bayar>=200000) {
            diskon=(float)0.2*bayar;
            total=bayar-(int)diskon;
            System.out.println("Mendapat diskon 20% :Rp."+diskon);
            System.out.println("Bayar :Rp. "+total);
         }
      }
      if(kode.equalsIgnoreCase("MO")) {
         System.out.println("\nNama Barang : Monitor");
         System.out.println("Harga : Rp.400000");
         System.out.print("Jumlah beli : ");
         jumlah=input.nextInt();
         bayar=jumlah*monitor;
         System.out.println("Total bayar :Rp."+jumlah);
         if(bayar>=200000) {
            diskon=(float)0.05*bayar;
            total=bayar-(int)diskon;
            System.out.println("Mendapat diskon 5% :Rp."+diskon);
            System.out.println("Bayar :Rp. "+total);
            System.out.println("==================================");
         }
      }
      if(kode.equalsIgnoreCase("RM")) {
         System.out.println("\nNama Barang :RAM");
         System.out.println("Harga : Rp.250000");
         System.out.print("Jumlah beli : ");
         jumlah=input.nextInt();
         bayar=jumlah*Ram;
         System.out.println("Total bayar :Rp."+jumlah);
         if(bayar>=200000) {
            diskon=(float)0.1*bayar;
            total=bayar-(int)diskon;
            System.out.println("Mendapat diskon 10% :Rp."+diskon);
            System.out.println("Bayar :Rp. "+total);
         }else{
            System.out.println("\nAnda Tidak mendapatkan Diskon");
            
         }

      }
      
      System.out.print("\n\nIngin input data lagi [y/n] :");
      kode=input.next();
      if(kode.equalsIgnoreCase("N")) {
         kondisi=false;
      }
      }
   }
}
