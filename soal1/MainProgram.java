package soal1;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, subPilihan;
        do {
            System.out.println("Menu Utama: ");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Silinder");
            System.out.println("4. Bola");
            System.out.print("Masukkan pilihanmu (1/2/3/4): ");
            pilihan = input.nextInt();
            if (pilihan < 0 || pilihan > 4) {
                System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan < 0 || pilihan > 4);

        switch (pilihan) {
            case 1:
                System.out.println("Program Kubus (cm)");
                System.out.print("Masukkan panjang rusuk kubus: ");
                int sisi = input.nextInt();

                BangunRuang kubus = new BangunRuang(sisi);

                System.out.println("\nVolume Kubus: " + kubus.hitungVolumeKubus() + " cm³");
                System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus() + " cm²");
                break;

            case 2:
                System.out.println("Program Balok (cm)");
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);

                System.out.println("\nVolume Balok: " + balok.hitungVolumeBalok() + " cm³");
                System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok() + " cm²");
                break;

            case 3:
                System.out.println("Program Silinder (cm)");
                System.out.print("Masukkan jari-jari: ");
                double jariJariSilinder = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSilinder = input.nextDouble();

                BangunRuang silinder = new BangunRuang(jariJariSilinder, tinggiSilinder);

                System.out.println("\nVolume Silinder: " + silinder.hitungVolumeSilinder() + " cm³");
                System.out.println("Luas Permukaan Silinder: " + silinder.hitungLuasPermukaanSilinder() + " cm²");
                break;

            case 4:
                System.out.println("Program Bola (cm)");
                System.out.print("Masukkan jari-jari: ");
                double jariJariBola = input.nextDouble();

                BangunRuang bola = new BangunRuang(jariJariBola);

                System.out.println("\nVolume Bola: " + bola.hitungVolumeBola() + " cm³");
                System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaanBola() + " cm²");
                break;
            default:

        }

        input.close();
    }
}