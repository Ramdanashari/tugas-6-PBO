package BangunRuang;

import BangunDatar.Lingkaran;

public class Tabung implements Geometri {
    private double r;
    private double tinggi;

    public Tabung (double r, double tinggi){
        this.r = r;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungvolume() {
        return Math.PI * Math.pow(r, 2) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        Lingkaran lingkaran = new Lingkaran (r); 
        return 2 * lingkaran.hitungluas() + lingkaran.hitungkeliling() * tinggi;
    }
}
