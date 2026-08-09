package Penurunan;

public class Kendaraan {
    //sebagai superclass

    public int     jmlroda;
    public int     jmlkursi;
    public String  nama;
    public String  bahanBakar;

    public void tampilJmlRoda(){
        System.out.println(this.nama +", Jumlah Roda : "+this.jmlroda);
    }

    public void tampilJmlKursi(){
        System.out.println(this.nama +", Jumlah Kursi : "+this.jmlkursi);
    }

    public void about(){
        System.out.println("Ini class kendaraan");
    }

    public String lihatBahanBakar(){
        bahanBakar  =   "Bensin";

        return bahanBakar;
    }
}
