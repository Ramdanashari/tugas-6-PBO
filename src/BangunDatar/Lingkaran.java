package BangunDatar;

public class Lingkaran implements Shape{
    private double r;

    public Lingkaran(double r){
        this.r = r;
    }

    @Override
    public double hitungluas (){
        return Math.PI * r * r;
    }

    @Override
    public double hitungkeliling(){
        return 2 * Math.PI * r;
    }
}
