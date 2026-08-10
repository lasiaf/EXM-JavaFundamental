package CollectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public void ArrayList(){
        ArrayList<String> buah = new ArrayList<>();

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
    public List createList(){
        List<Integer> angka =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        return angka;
    }

    public void listStream(){

        List<Integer> angka;
        angka = this.createList();
        angka.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
    public void mapStream() {
        //TRANSFORMASI DATA
        System.out.println("~Transformasi Data dengan Map~");
        List<Integer> angka;
        angka = this.createList();
        angka.stream()
                .map(n -> n * 10)
                .forEach(System.out::println);
    }
    public void mapSumStream() {
        //TRANSFORMASI DATA
        System.out.println("~Transformasi Data dengan Map (Sum)~");
        List<Integer> angka;
        angka = this.createList();

        int total =
                angka.stream()
                        .reduce(0, Integer::sum);

        System.out.println(total);
    }

    public void TanpaGeneric (){
        ArrayList list = new ArrayList();
        System.out.println("~Menampilkan Datanpa Generic (Lebih rumit)~");
        list.add("Faisal");

        String nama = (String) list.get(0); // harus casting
        System.out.println(nama);

    }
}
