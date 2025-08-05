import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class BelanjaBarangAmira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Barang1: ");
        String namabarang1 = input.nextLine();

        System.out.println("Barang1: ");
        String barang1 = input.next();
        double hargabarang1 = 34.000;
        System.out.println("Barang2: ");
        String barang2 = input.next();
        double hargabarang2 = 7.500;
        
        System.out.println("--------------------------------------------");
        System.out.println("Barang yang dibeli: "+ barang1 + " "+ barang2);
        System.out.println("Harga: "+ hargabarang1 + " " + hargabarang2);
        System.out.println("--------------------------------------------");
    }
}
