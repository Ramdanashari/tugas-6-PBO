package BangunDatar;

public class SegitigaSamaSisi extends Segitiga{
    public SegitigaSamaSisi(double sisi){
        super(sisi, sisi, sisi);
    }

    @Override
    public double hitungluas(){
        return (Math.sqrt(3) / 4) * sisi1 * sisi1;
    }
}
