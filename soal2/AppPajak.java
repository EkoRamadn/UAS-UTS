package soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPajak {
    public static void main(String[] args) {
        ArrayList<Pajak> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        ValidasiInput validasi = new ValidasiInput();

        String vendor, tipe;
        double harga;

        System.out.print("Masukkan jumlah smartphone yang ingin dihitung: ");
        int jumlahSmartphone = validasi.validasiInt(scanner);
        scanner.nextLine();

        for (int i = 0; i < jumlahSmartphone; i++) {
            System.out.print("\nMasukkan vendor Smartphone ke-" + (i + 1) + ": ");
            vendor = scanner.nextLine();
            System.out.print("Masukkan tipe Smartphone ke-" + (i + 1) + ": ");
            tipe = scanner.nextLine();

            do {
                System.out.print("Masukkan harga Smartphone ke-" + (i + 1) + ": ");
                harga = validasi.validasiDouble(scanner);

                if (harga <= 0) {
                    System.out.println("Harga harus bilangan positif!\n");
                }

            } while (harga <= 0);
            scanner.nextLine();

            list.add(new Pajak(vendor, tipe, harga));
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
        }

        scanner.close();
    }
}