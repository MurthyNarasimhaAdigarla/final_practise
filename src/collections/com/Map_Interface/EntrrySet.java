package collections.com.Map_Interface;

import java.util.*;

public class EntrrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Murthy", 401);
        hm.put("Rachu", 402);
        hm.put("Dhruva", 403);
        hm.put("Simba", 404);
        //Printing in json format
        System.out.println("Printing in json format :: " + hm);

        //Getting All keys and Values in separate
        Set keys = hm.keySet();
        Collection values = hm.values();
        System.out.println("AllKeys ::" + keys);
        System.out.println("All Values::" + values);

        //Printing all the values one by one
        Set allEntries = hm.entrySet();
        //Printing in Set format
        System.out.print("All Entries are::" + allEntries);

        Iterator itr_allentries = allEntries.iterator();
        while (itr_allentries.hasNext()) {
            Map.Entry itr_allentries_in_map = (Map.Entry) itr_allentries.next();
            System.out.println("All Entries in Iterator are::" + itr_allentries_in_map.getKey() + "..." + itr_allentries_in_map.getValue());
            if (itr_allentries_in_map.getKey().equals("Rachu")) itr_allentries_in_map.setValue(405);
            if (itr_allentries_in_map.getValue().equals(405)) itr_allentries_in_map.setValue(444);

        }
        System.out.println("Printing in json format :: " + hm);


    }
}
