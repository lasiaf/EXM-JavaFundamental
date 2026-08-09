package Penurunan;

public class Pesawat extends Kendaraan {
    public int     jmlToilet;


    public void tampilJmlToilet(){
        System.out.println(this.nama +", Jumlah Roda : "+this.jmlToilet);
    }

    @Override
    public void about() {
        System.out.println("Ini class pesawat");
    }

    @Override
    public String lihatBahanBakar(){
        bahanBakar  =   "Avtur";

        return bahanBakar;
    }
}
