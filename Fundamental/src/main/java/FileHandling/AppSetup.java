package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AppSetup {

    public void simpan(String _json){
        Properties props = new Properties();

        props.setProperty("app.name", "Belajar Java");
        props.setProperty("db.host", "192.168.1.10");
        props.setProperty("db.port", "5432");

        try {
            FileOutputStream fos =
                    new FileOutputStream("config.properties");

            props.store(fos, "Konfigurasi Aplikasi");

            fos.close();

            System.out.println("Konfigurasi disimpan");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void baca(){
        Properties props = new Properties();

        try {
            FileInputStream fis =
                    new FileInputStream("config.properties");

            props.load(fis);

            String appName = props.getProperty("app.name");
            String host = props.getProperty("db.host");
            String port = props.getProperty("db.port");

            System.out.println("Aplikasi : " + appName);
            System.out.println("Host     : " + host);
            System.out.println("Port     : " + port);

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        File file = new File("config.properties");

        if (file.delete()) {
            System.out.println("File berhasil dihapus");
        } else {
            System.out.println("File tidak ditemukan atau gagal dihapus");
        }
    }

}
