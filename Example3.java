package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Example3 {

    public static void main(String[] args) {

        //Create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("name1", new Double(123.34));
        balance.put("name2", new Double(123.45));
        balance.put("name3", new Double(123.56));

        names = balance.keys();

        while(names.hasMoreElements()){
            str = (String) names.nextElement();
            System.out.println(str + " " + balance.get(str));
        }
    }
}
