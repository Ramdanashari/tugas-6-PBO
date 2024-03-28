package BangunRuang;

public class Bola implements Geometri{
    private double r;

    public Bola (double r ){
        this.r = r;
    }

    @Override
    public double hitungvolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public double hitungLuasPermukaan(){
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
