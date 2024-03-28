package BangunRuang;
import BangunDatar.PersegiPanjang;

public class Balok implements Geometri{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungvolume(){
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan(){
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        return 2 * ( persegiPanjang.hitungluas() + panjang * tinggi * lebar);
    }
}
