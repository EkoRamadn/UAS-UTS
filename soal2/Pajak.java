package soal2;

public class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getVendor() {
        return vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public double menghitungHargaPPN() {
        if (harga > 8000000) {
            return harga * 0.05;
        } else if (harga > 4500000) {
            return harga * 0.02;
        } else if (harga > 4000000) {
            return harga * 0.01;
        } else {
            return 0;
        }
    }

    public double menghitungHargaIncludePPN() {
        return menghitungHargaPPN() + harga;
    }

    public void output() {
        System.out.println("\nVendor: " + getVendor());
        System.out.println("Tipe: " + getTipe());
        System.out.printf("Harga asli: Rp%,.2f%n", getHarga());
        System.out.printf("PPN: Rp%,.2f%n", menghitungHargaPPN());
        System.out.printf("Harga setelah PPN: Rp%,.2f%n", menghitungHargaIncludePPN());
    }
}