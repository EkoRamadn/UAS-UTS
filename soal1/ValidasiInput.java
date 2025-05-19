
// package soal1;
import java.util.Scanner;

public class ValidasiInput {
    public double validasiDouble(Scanner input) {
        while (!input.hasNextDouble()) {
            System.out.println("Masukkan angka yang valid!");
            input.next();
        }
        return input.nextDouble();
    }

    public int validasiInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.println("Masukkan angka yang valid!");
            input.next();
        }
        return input.nextInt();

    }
}