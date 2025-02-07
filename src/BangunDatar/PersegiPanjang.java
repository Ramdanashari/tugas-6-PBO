package BangunDatar;

public class PersegiPanjang implements Shape {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungluas(){
        return panjang * lebar;
    }
    @Override
    public double hitungkeliling(){
        return 2 * (panjang + lebar );
    }
}
