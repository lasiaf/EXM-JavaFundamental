package CollectionFramework;

import java.util.HashMap;

public class HashMapList {

    public void create(){

        HashMap<String, String> user = new HashMap<>();

        user.put("nama", "Faisal");
        user.put("kota", "Bandar Lampung");
        user.put("pekerjaan", "Programmer");

        System.out.println(user);
        System.out.println(user.get("nama"));

        user.put("nama", "Muhammad Faisal");
        for (String key : user.keySet()) {
            System.out.println(
                    key + " : " + user.get(key)
            );
        }

        user.remove("kota");
        System.out.println(user);

        if (user.containsKey("nama")) {
            System.out.println("Data key ditemukan");
        }


        HashMap<String, Integer> nilai = new HashMap<>();

        nilai.put("Matematika", 90);
        nilai.put("Fisika", 85);
        nilai.put("Kimia", 88);

        System.out.println(nilai.get("Kimia"));

        //-----------------
        HashMap<String, Mahasiswa> mahasiswa = new HashMap<>();
        mahasiswa.put(
                "M001",
                new Mahasiswa("Faisal", 30)
        );

        Mahasiswa m = mahasiswa.get("M001");
        System.out.println(m.nama);



        //-----------------
        HashMap<String, String> config =
                new HashMap<>();

        config.put("app.name", "Belajar Java");
        config.put("db.host", "192.168.1.10");
        config.put("db.port", "5432");

        System.out.println(
                config.get("db.host")
        );
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
