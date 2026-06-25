package tes;

import java.util.Scanner;

public class Mahasiswa {

    // Atribut
    private String nim;
    private String nama;
    private double nilaiAfektif;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiSikap;
    private double nilaiUAS;

    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilaiAfektif(double nilaiAfektif) {
        this.nilaiAfektif = nilaiAfektif;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public void setNilaiSikap(double nilaiSikap) {
        this.nilaiSikap = nilaiSikap;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    // Method menghitung nilai akhir
    public double nilaiAkhir() {
        return (nilaiAfektif * 0.15)
                + (nilaiTugas * 0.25)
                + (nilaiUTS * 0.20)
                + (nilaiSikap * 0.10)
                + (nilaiUAS * 0.30);
    }

    // Method konversi nilai huruf
    public String konvNilai() {
        double na = nilaiAkhir();

        if (na >= 80)
            return "A";
        else if (na >= 75)
            return "B+";
        else if (na >= 70)
            return "B";
        else if (na >= 65)
            return "C+";
        else if (na >= 60)
            return "C";
        else if (na >= 55)
            return "D+";
        else if (na >= 30)
            return "D";
        else
            return "E";
    }

    // Method cek kelulusan
    public boolean isLulus() {
        String huruf = konvNilai();

        return huruf.equals("A")
                || huruf.equals("B+")
                || huruf.equals("B")
                || huruf.equals("C+")
                || huruf.equals("C");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Mahasiswa m = new Mahasiswa();

        System.out.print("Masukkan NIM : ");
        m.setNim(scan.nextLine());

        System.out.print("Masukkan Nama : ");
        m.setNama(scan.nextLine());

        System.out.print("Masukkan Nilai Afektif : ");
        m.setNilaiAfektif(scan.nextDouble());

        System.out.print("Masukkan Nilai Tugas : ");
        m.setNilaiTugas(scan.nextDouble());

        System.out.print("Masukkan Nilai UTS : ");
        m.setNilaiUTS(scan.nextDouble());

        System.out.print("Masukkan Nilai Sikap : ");
        m.setNilaiSikap(scan.nextDouble());

        System.out.print("Masukkan Nilai UAS : ");
        m.setNilaiUAS(scan.nextDouble());

        System.out.println("\n===== HASIL =====");
        System.out.println("NIM          : " + m.nim);
        System.out.println("Nama         : " + m.nama);
        System.out.println("Nilai Akhir  : " + m.nilaiAkhir());
        System.out.println("Nilai Huruf  : " + m.konvNilai());
        System.out.println("Keterangan   : " +
                (m.isLulus() ? "LULUS" : "TIDAK LULUS"));

        scan.close();
    }
}
