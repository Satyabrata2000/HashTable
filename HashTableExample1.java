package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample1 {

    public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(100, "String1");
        hm.put(101, "String2");
        hm.put(102, "String3");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
