import Penurunan.*;
import BasicCalculation.*;
import Encapsulations.*;

public class Main {
    public static void main(String[] args) {

        Main    isMain  =   new     Main();

        isMain.basicCalc();
        isMain.inHeritage();
        isMain.isOverride();
        isMain.isEncapsulations();


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
    protected void isOverride(){
        this.spaceLine("KONSEP OVERRIDE");

        //KONSEP OVERRIDE
        Kendaraan ob1 = new Kendaraan();
        Pesawat ob2 = new Pesawat();
        Kereta ob3 = new Kereta();

        ob1.about();
        ob2.about();
        ob3.about();

        //END - KONSEP OVERRIDE

        this.spaceLine("");
    }
    protected void isEncapsulations() {
        this.spaceLine("KONSEP ENCAPTUALTIONS");

        //KONSEP ENCAPTUALTIONSE
        Encap ec1 = new Encap();
        ec1.setA(9);
        ec1.setB(2);
        System.out.println("Nilai A adalah : "+ec1.getA());
        System.out.println("Nilai B adalah : "+ec1.getB());
        System.out.println("Hasil pembagian adalah : "+ec1.getC());
        //END - KONSEP ENCAPTUALTIONSE

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