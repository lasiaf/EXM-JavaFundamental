package contoh;

public class Contoh {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Contoh contoh = new Contoh();
        contoh.calculation();
    }

    public void calculation() {
        float gajiPokok, gajiBersih, potonganGaji;

        gajiPokok = 250000;
        potonganGaji = (float) 0.12;
        gajiBersih = gajiPokok - (gajiPokok * potonganGaji);

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("Potongan Gaji: " + potonganGaji);

    }
}