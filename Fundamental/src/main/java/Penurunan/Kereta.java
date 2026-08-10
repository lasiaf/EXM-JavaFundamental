package Penurunan;

public class Kereta extends Kendaraan {
    int     jmlGerbong;

    public void tampilJmlGerbong(){
        System.out.println(this.nama +", Jumlah Gerbong : "+this.jmlGerbong);
    }
    @Override
    public void about(){
        System.out.println("Ini class kereta");
    }
    public void aboutSuper(){
        System.out.print("Method Super : ");
        super.about();
    }

    @Override
    public String lihatBahanBakar(){
        bahanBakar  =   "Batu Bara";

        return bahanBakar;
    }
}
