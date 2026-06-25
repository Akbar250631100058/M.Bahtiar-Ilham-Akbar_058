package app;

import java.util.Scanner;
import produk.Produk;
import transaksi.Pemesanan;

public class Main {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("=== PEMESANAN PRODUK ===");

System.out.print("Masukkan Nama Produk : ");
String nama = input.nextLine();

System.out.print("Masukkan Harga Produk : ");
int harga = input.nextInt();

System.out.print("Masukkan Jumlah Pesanan : ");

int jumlah = input.nextInt();

Produk produk = new Produk(nama, harga);

Pemesanan pesan = new Pemesanan(jumlah);

produk.tampilProduk();

pesan.tampilPesanan(produk);
}
}
