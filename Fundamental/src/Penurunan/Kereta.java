package Penurunan;

public class Kereta extends Kendaraan {
    int     jmlGerbong;

    public void tampilJmlGerbong(){
        System.out.println(this.nama +", Jumlah Gerbong : "+this.jmlGerbong);
    }

    public void about(){
        System.out.println("Ini class kereta");
    }
}
