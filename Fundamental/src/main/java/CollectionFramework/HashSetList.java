package CollectionFramework;

import java.util.HashSet;

public class HashSetList {
    public HashSet create(){
        HashSet<String> buah = new HashSet<>();

        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Apel");

        return buah;
    }
    public void show() {

        HashSet<String> buah = new HashSet<>();

        buah = this.create();
        System.out.println(buah);

        System.out.println(
                buah.contains("Apel")
        );

        buah.remove("Mangga");
        System.out.println(buah);

        System.out.println(
                buah.size()
        );

        for (String item : buah) {
            System.out.println(item);
        }
    }

}
