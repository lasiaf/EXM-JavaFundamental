package BasicCalculation;

public class Calculation {
    public void calculation() {
        float gajiPokok, gajiBersih, potonganGaji;

        gajiPokok = 250000;
        potonganGaji = (float) 0.12;
        gajiBersih = gajiPokok - (gajiPokok * potonganGaji);

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("Potongan Gaji: " + potonganGaji);

    }
    public float hitungGajiBersih(float gajiPokok) {
        float potonganGaji = 0.12f;
        return gajiPokok - (gajiPokok * potonganGaji);
    }
}
