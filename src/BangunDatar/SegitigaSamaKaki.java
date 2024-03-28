package BangunDatar;

public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, alas, Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2)));
    }

    @Override
    public double hitungluas(){
        return 0.5 * sisi1 * Math.sqrt(Math.pow(sisi1 / 2, 2)) + Math.pow(sisi3, 2);
    }
}
