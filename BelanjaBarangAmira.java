import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class BelanjaBarangAmira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Barang1: ");
        String barang1 = input.next();
        System.out.println("Harga Barang 1");
        double hargabarang1 = input.nextDouble();

        System.out.println("Barang2: ");
        String barang2 = input.next();
        System.out.println("Haraga Barang 2");
        double hargabarang2 = input.nextDouble();
        
        System.out.println("--------------------------------------------");
        System.out.println("Barang yang dibeli: "+ barang1 + " " + "dan" + " " + barang2);
        System.out.println("Harga: "+ hargabarang1 + " " + "dan" + " " + hargabarang2);
        System.out.println("--------------------------------------------");
    }
}


