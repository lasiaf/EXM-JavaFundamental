import Penurunan.*;
import BasicCalculation.*;

public class Main {
    public static void main(String[] args) {

        Main    isMain  =   new     Main();

        isMain.basicCalc();
        isMain.inHeritage();




    }
    protected void basicCalc() {
        this.spaceLine("KONSEP KALKULASI SEDERHANA");
        //KONSEP KALKULASI SEDERHANA
        Calculation bc1 = new Calculation();
        bc1.calculation();
        //END - KONSEP KALKULASI SEDERHANA

        this.spaceLine("");
    }

    protected void inHeritage(){
        this.spaceLine("KONSEP PENURUNAN INHERITAGE");

        //KONSEP PENURUNAN INHERITAGE
        Kendaraan ob1 = new Kendaraan();
        Pesawat ob2 = new Pesawat();
        Kereta ob3 = new Kereta();

        ob1.jmlroda     =   100;
        ob1.jmlkursi    =   2;
        ob1.nama        =   "Mobil";
        ob2.nama        =   "Pesawat";
        ob3.nama        =   "Kereta";
        ob2.jmlToilet   =   3;

        ob1.tampilJmlRoda();
        ob1.tampilJmlKursi();
        ob2.tampilJmlToilet();
        ob3.tampilJmlGerbong();
        //END - KONSEP PENURUNAN INHERITAGE

        this.spaceLine("");
    }
    protected void spaceLine(String title) {
        if(title == "") {
            System.out.println("===========");
            System.out.println("");
        }
        else{
            System.out.println("_______"+title+"_______");
        }
    }
}