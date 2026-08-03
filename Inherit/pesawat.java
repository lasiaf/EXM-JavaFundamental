public class pesawat extends kendaraan {

    public int     jmlToilet;

    public void tampilJmlToilet(){
        System.out.println(this.nama +", Jumlah Roda : "+this.jmlToilet);
    }

    public void about(){
        System.out.println("Ini class pesawat");
    }
}