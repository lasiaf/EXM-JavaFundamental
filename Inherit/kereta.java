public class kereta extends kendaraan {

    int     jmlGerbong;

    public void tampilJmlGerbong(){
        System.out.println(this.nama +", Jumlah Gerbong : "+this.jmlGerbong);
    }

    public void about(){
        System.out.println("Ini class kereta");
    }
}