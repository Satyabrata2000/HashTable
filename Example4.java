package HashTable;

//Properties is a sub-class of Hashtable. It is used to maintain a list of values in which the key is a string
// and the value is also a string

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example4 {

    public static void main(String[] args) {

        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        //show all states and capitals in hashtable

        states = capitals.keySet(); //get set-view of keys
        Iterator itr = states.iterator();

        while(itr.hasNext()){
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
        }

        //look for state not in the list -- specify default
        str = capitals.getProperty("Florida", "not found");
        System.out.println("The capital of Florida is " + str + ".");
    }
}
