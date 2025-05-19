// package soal1;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double jariJari, tinggi, lebar, panjang;

        ValidasiInput validasi = new ValidasiInput();

        do {
            System.out.println("Menu Utama: ");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Silinder");
            System.out.println("4. Bola");
            System.out.print("Masukkan pilihanmu (1/2/3/4): ");
            pilihan = validasi.validasiInt(input);
            if (pilihan < 0 || pilihan > 4) {
                System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan < 0 || pilihan > 4);

        switch (pilihan) {
            case 1:
                int sisi;
                do {
                    System.out.println("Program Kubus (cm)");
                    System.out.print("Masukkan panjang rusuk kubus: ");
                    sisi = validasi.validasiInt(input);
                    if (sisi < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");

                    }
                } while (sisi < 0);
                BangunRuang kubus = new BangunRuang(sisi);

                System.out.println("\nVolume Kubus: " + kubus.hitungVolumeKubus() + " cm³");
                System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus() + " cm²");
                break;

            case 2:
                do {
                    System.out.println("Program Balok (cm)");
                    System.out.print("Masukkan panjang: ");
                    panjang = validasi.validasiDouble(input);
                    if (panjang < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");
                    }
                } while (panjang < 0);
                do {
                    System.out.print("Masukkan lebar: ");
                    lebar = validasi.validasiDouble(input);
                    if (lebar < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");
                    }
                } while (lebar < 0);
                do {
                    System.out.print("Masukkan tinggi: ");
                    tinggi = validasi.validasiDouble(input);
                    if (tinggi < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");
                    }

                } while (tinggi < 0);
                BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);

                System.out.println("\nVolume Balok: " + balok.hitungVolumeBalok() + " cm³");
                System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok() + " cm²");
                break;

            case 3:
                do {
                    System.out.println("Program Silinder (cm)");
                    System.out.print("Masukkan jari-jari: ");
                    jariJari = validasi.validasiDouble(input);
                    if (jariJari < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");
                    }
                } while (jariJari < 0);

                do {
                    System.out.print("Masukkan tinggi: ");
                    tinggi = validasi.validasiDouble(input);
                    if (tinggi < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");
                    }
                } while (tinggi < 0);

                BangunRuang silinder = new BangunRuang(jariJari, tinggi);

                System.out.println("\nVolume Silinder: " + silinder.hitungVolumeSilinder() + " cm³");
                System.out.println("Luas Permukaan Silinder: " + silinder.hitungLuasPermukaanSilinder() + " cm²");
                break;

            case 4:
                do {
                    System.out.println("Program Bola (cm)");
                    System.out.print("Masukkan jari-jari: ");
                    jariJari = validasi.validasiDouble(input);

                    if (jariJari < 0) {
                        System.out.println("Angka tidak boleh negatif!\n");
                    }
                } while (jariJari < 0);

                BangunRuang bola = new BangunRuang(jariJari);

                System.out.println("\nVolume Bola: " + bola.hitungVolumeBola() + " cm³");
                System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaanBola() + " cm²");
                break;

            default:
        }
        input.close();
    }

}