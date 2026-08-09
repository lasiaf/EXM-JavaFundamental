import Penurunan.*;
import BasicCalculation.*;
import Encapsulations.*;
import Constructor.*;
import Abstraction.*;
import Interface.*;
import FileHandling.*;
import CollectionFramework.*;
import Lambda.*;
import Multithreading.*;
import JDBC.*;

public class Main {
    public static void main(String[] args) {

        Main    isMain  =   new     Main();

        isMain.basicCalc();
        isMain.inHeritage();
        isMain.isOverride();
        isMain.isPolymorphism();
        isMain.isEncapsulations();
        isMain.isAbstraction();
        isMain.isConstructor();
        isMain.isInterface();
        isMain.isFileHandling();
        isMain.isCollectionFramework();
        isMain.isLambda();
        isMain.isMultithreading();
        isMain.isJDBC();
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
    protected void isPolymorphism(){
        this.spaceLine("KONSEP POLYMORPHISM");

        //KONSEP POLYMORPHISM
        Kendaraan ob1 = new Kendaraan();
        Kendaraan ob2 = new Pesawat();
        Kendaraan ob3 = new Kereta();

        /*
        //INI KALAU DIJALANKAN TANPA PERULANGAN
        ob1.lihatBahanBakar();
        ob2.lihatBahanBakar();
        ob3.lihatBahanBakar();
        */

        Kendaraan[] daftarKendaraan = {
                new Pesawat(),
                new Kendaraan(),
                new Kereta()
        };

        for (Kendaraan h : daftarKendaraan) {
            System.out.println(h.lihatBahanBakar());
        }

        //END - KONSEP POLYMORPHISM

        this.spaceLine("");
    }
    protected void isAbstraction() {
        this.spaceLine("KONSEP ABSTRACTION");

        //KONSEP ABSTRACTION
        Air ab1 = new Uap();
        Air ab2 = new Padat();

        ab1.bentuk();
        ab2.bentuk();

        //END - KONSEP ABSTRACTION
        this.spaceLine("");
    }

    protected void isEncapsulations() {
        this.spaceLine("KONSEP ENCAPSULATIONS");

        //KONSEP ENCAPSULATIONS
        Encap ec1 = new Encap();
        ec1.setA(9);
        ec1.setB(2);
        System.out.println("Nilai A adalah : "+ec1.getA());
        System.out.println("Nilai B adalah : "+ec1.getB());
        System.out.println("Hasil pembagian adalah : "+ec1.getC());
        //END - KONSEP ENCAPSULATIONS

        this.spaceLine("");
    }
    protected void isConstructor() {
        this.spaceLine("KONSEP CONSTRUCTOR");

        //KONSEP CONSTRUCTOR
        myConstructor mc1   = new myConstructor();
        myConstructor mc2    = new myConstructor("Honda");
        myConstructor mc3   = new myConstructor("Toyota", 2025);

        mc2.tampil();
        //END - KONSEP CONSTRUCTOR
        this.spaceLine("");
    }

    protected void isInterface() {
        this.spaceLine("KONSEP INTERFACE");

        //KONSEP INTERFACE
        PaymentService payService =
                new PaymentService(new Bank());



        payService.bayar();

        PaymentService payService2 =
                new PaymentService(new Gopay(), new Gopay());

        payService2.bayar();
        payService2.isiPoint();
        payService2.klaimPoin();

        //END - KONSEP INTERFACE
        this.spaceLine("");
    }

    protected void isFileHandling() {
        this.spaceLine("KONSEP FILE HANDLING");

        //KONSEP FILE HANDLING
        AppSetup    app1 = new  AppSetup();
        String      myJSON = """
        {
                "app.name": "Belajar Java",
                "db.host": "192.168.1.10",
                "db.port": "5432"
        }
        """;
        app1.delete();
        app1.simpan(myJSON);
        app1.baca();

        //END - KONSEP FILE HANDLING
        this.spaceLine("");
    }

    protected void isCollectionFramework() {
        this.spaceLine("KONSEP COLLECTION FRAMEWORK");

        //KONSEP COLLECTION FRAMEWORK
        //ARRAY LIST
        this.spaceLine("Array List");
        ArrayList li1 = new ArrayList();
        li1.ArrayList();

        this.spaceLine("-");
        //HASH MAP
        this.spaceLine("Hashmap");
        HashMapList li2 = new HashMapList();
        li2.create();

        this.spaceLine("-");
        //HASH MAP
        this.spaceLine("Hashset");
        HashSetList li3 = new HashSetList();
        li3.show();

        //END - KONSEP COLLECTION FRAMEWORK
        this.spaceLine("");
    }

    protected void isLambda() {
        this.spaceLine("KONSEP LAMBDA & STREAM");
        this.spaceLine("LAMBDA");
        //KONSEP LAMBDA
        Salam   ss1 = new   Salam();
        ss1.doAct();

        System.out.println("Hasil perhitungan = "+ss1.Calc(4,9));


        this.spaceLine("-");
        //STREAM
        this.spaceLine("STREAM");
        //Mengambil bilangan yang hanya bilangan genap
        ArrayList li1 = new ArrayList();
        li1.listStream();
        li1.mapStream();
        li1.mapSumStream();
        //END - KONSEP LAMBDA & STREAM
        this.spaceLine("");
    }

    protected void isMultithreading() {
        this.spaceLine("KONSEP MULTITHREADING");
        //KONSEP MULTITHREADING

        Thread thread =
                new Thread(
                        new DownloadThread()
                );


        thread.start();

        Threads tr1 = new Threads();
        tr1.run();

        //END - KONSEP MULTITHREADING
        this.spaceLine("");
    }

    protected void isJDBC() {
        this.spaceLine("KONSEP JDBC");
        //KONSEP JDBC

        Postgre pg1 = new Postgre();
        pg1.connection();

        //END - JDBC
        this.spaceLine("");
    }

    protected void spaceLine(String title) {
        if(title == "") {
            System.out.println("===========");
            System.out.println("");
        }
        else if(title == "-") {
            System.out.println("_____________");
            System.out.println("");
        }
        else{
            System.out.println("_______"+title+"_______");
        }
    }
}