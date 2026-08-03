public class utama {
    public static void main(String[] args) {
        
        kendaraan ob1 = new kendaraan();
        pesawat ob2 = new pesawat();
        kereta ob3 = new kereta();

        ob1.jmlroda     =   100;
        ob1.jmlkursi    =   2;
        ob1.nama        =   "Mobil";
        ob2.jmlToilet   =   3;

        ob1.tampilJmlRoda();
        ob1.tampilJmlKursi();
        ob2.tampilJmlToilet();

        System.out.println("Hello World!");
        System.out.println("=======OVERIDE========");

        ob1.about();
        ob2.about();
        ob3.about();
    }
    
}