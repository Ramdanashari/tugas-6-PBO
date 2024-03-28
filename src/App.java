import BangunDatar.*;
import BangunRuang.*;

public class App {
    public static void main(String[] args) {
        System.out.println("===_________________________ Bangun Datar__________________________- ===");

        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("\n Luas Persegi Panjang: " + persegiPanjang.hitungluas());
        System.out.println(" Keliling Persegi Panjang: " + persegiPanjang.hitungkeliling());

        Persegi persegi = new Persegi(4);
        System.out.println("\n Luas Persegi: " + persegi.hitungluas());
        System.out.println(" Keliling Persegi: " + persegi.hitungkeliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("\n Luas Lingkaran: " + lingkaran.hitungluas());
        System.out.println(" Keliling Lingkaran: " + lingkaran.hitungkeliling());

        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(6, 4);
        System.out.println("\n Luas Segitiga Sama Kaki: " + segitigaSamaKaki.hitungluas());
        System.out.println(" Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.hitungkeliling());

        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(5);
        System.out.println("\n Luas Segitiga Sama Sisi: " + segitigaSamaSisi.hitungluas());
        System.out.println(" Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.hitungkeliling());

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(3, 4);
        System.out.println("\n Luas Segitiga Siku-Siku: " + segitigaSikuSiku.hitungluas());
        System.out.println(" Keliling Segitiga Siku-Siku: " + segitigaSikuSiku.hitungkeliling());

        System.out.println("\n_____________________Bangun Ruang_______________________");

        Kubus kubus = new Kubus(5);
        System.out.println("\n Volume Kubus: " + kubus.hitungvolume());
        System.out.println(" Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        Balok balok = new Balok(3, 4, 5);
        System.out.println("\n Volume Balok: " + balok.hitungvolume());
        System.out.println(" Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        Bola bola = new Bola(6);
        System.out.println("\n Volume Bola: " + bola.hitungvolume());
        System.out.println(" Luas Permukaan Bola: " + bola.hitungLuasPermukaan());

        Tabung tabung = new Tabung(4, 7);
        System.out.println("\n Volume Tabung: " + tabung.hitungvolume());
        System.out.println(" Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
    }
}
