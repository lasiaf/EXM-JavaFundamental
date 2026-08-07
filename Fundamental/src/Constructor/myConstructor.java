package Constructor;

public class myConstructor {
    String merk;
    int tahun;

    //CONSTRUCTOR BISA LEBIH DARI SATU Constructor Overloading
    public myConstructor() {
        merk = "Tidak diketahui";
        tahun = 1999;
    }

    public myConstructor(String merk) {
        this.merk = merk;
    }

    public myConstructor(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public void tampil(){
        System.out.println(merk+" ("+tahun+")");
    }
}
