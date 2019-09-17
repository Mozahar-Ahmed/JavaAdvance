package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {

        /* Map is created and inserted some data.Retrieve the Collection view of values present in map*/
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        for (Integer i : map.keySet()) {
            System.out.println("No: " + i + " " + "City: " + map.get(i));
        }
        Iterator<HashMap.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> iteratedMap = iterator.next();
            System.out.println(iteratedMap.getKey() + " " + iteratedMap.getValue());
        }
    }
}