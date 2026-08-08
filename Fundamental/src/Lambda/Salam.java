package Lambda;

public class Salam {
    public void doAct(){
        Sapaan sapaan = () -> {
            System.out.println("Halo Dunia");
        };

        sapaan.sapa();
    }
    public int Calc(int x, int y){
        Hitung hitung = (a,b) -> a + b;

        int hasil = hitung.tambah(x,y);

        return hasil;
    }

}
