// package soal1;

public class BangunRuang {
    int sisi;
    double panjang, lebar, tinggi, jariJari;

    public BangunRuang(int sisi) {
        this.sisi = sisi;
    }

    public BangunRuang(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolumeKubus() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaanKubus() {
        return 6.0 * Math.pow(sisi, 2);
    }

    public double hitungVolumeBalok() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaanBalok() {
        return 2.0 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public double hitungVolumeSilinder() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;

    }

    public double hitungLuasPermukaanSilinder() {
        return 2.0 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public double hitungLuasPermukaanBola() {
        return 4.0 * Math.PI * Math.pow(jariJari, 2);
    }

}