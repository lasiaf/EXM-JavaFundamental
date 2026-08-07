package CollectionFramework;

public class ArrayList {

    public void ArrayList(){
        java.util.ArrayList<String> buah = new java.util.ArrayList<>();

        buah.add("Jeruk");
        buah.add("Apel");
        buah.add("Pisang");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Pisang");

        System.out.println(buah);
        System.out.println(buah.get(1));

        buah.set(2, "Durian");
        System.out.println(buah);

        buah.remove(0);
        for (String item : buah) {
            System.out.println(item);
        }

        System.out.println("Banyak buah : "+buah.size());

        java.util.ArrayList<Mahasiswa> daftar = new java.util.ArrayList<>();

        daftar.add(new Mahasiswa("Faisal", 30));
        daftar.add(new Mahasiswa("Budi", 25));

        for (Mahasiswa m : daftar) {
            System.out.println(m.nama + " - " + m.umur);
        }
    }
    class Mahasiswa {

        String nama;
        int umur;

        Mahasiswa(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }
    }
}
