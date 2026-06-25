package tes;

import java.util.Scanner;

/**
 *
 * @author Laili
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String alamat;
    private int nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public static void main(String[] args) {

        Mahasiswa m = new Mahasiswa();
        m.setNim("1234567890");
        m.setNama("Adi");

        System.out.println("NIM  : " + m.getNim());
        System.out.println("Nama : " + m.getNama());

        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        mahasiswa1.setNama(scan.nextLine());

        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        mahasiswa2.setNama(scan.nextLine());

        System.out.print("Masukkan Nama Mahasiswa 3 : ");
        mahasiswa3.setNama(scan.nextLine());

        System.out.println("\nBELAJAR CLASS DAN OBJEK");
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa2.getNama());
        System.out.println(mahasiswa3.getNama());

        scan.close();
    }
}
