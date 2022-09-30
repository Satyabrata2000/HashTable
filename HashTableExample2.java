package HashTable;

import java.util.Hashtable;

public class HashTableExample2 {

    public static void main(String[] args) {

        Hashtable<Integer, String> map = new Hashtable<Integer, String>();

        map.put(100, "String1");
        map.put(110, "String2");
        map.put(120, "String3");
        map.put(130, "String4");

        System.out.println("Before remove: " + map);

        map.remove(120);

        System.out.println("After remove: " + map);
    }
}
