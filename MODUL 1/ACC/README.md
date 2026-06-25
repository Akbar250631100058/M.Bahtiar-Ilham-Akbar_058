import java.util.Scanner;

public class Trapesium {

    // Atribut
    double sisiAtas;
    double sisiBawah;
    double tinggiTrapesium;
    double tinggiPrisma;

    // Method menghitung volume
    public double hitungVolume() {
        double luasTrapesium =
                ((sisiAtas + sisiBawah) * tinggiTrapesium) / 2;

        return luasTrapesium * tinggiPrisma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Objek
        Trapesium t = new Trapesium();

        System.out.print("Masukkan sisi atas : ");
        t.sisiAtas = input.nextDouble();

        System.out.print("Masukkan sisi bawah : ");
        t.sisiBawah = input.nextDouble();

        System.out.print("Masukkan tinggi trapesium : ");
        t.tinggiTrapesium = input.nextDouble();

        System.out.print("Masukkan tinggi prisma : ");
        t.tinggiPrisma = input.nextDouble();

        System.out.println("\nVolume Prisma Trapesium = "
                + t.hitungVolume());

        input.close();
    }
}
