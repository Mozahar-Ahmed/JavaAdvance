package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

     //Creating object

      List<String> mobileOperatorsBD = new LinkedList<>();
        //Storing elements
        mobileOperatorsBD.add("Grameen Phone");
        mobileOperatorsBD.add("Bangla Link");
        mobileOperatorsBD.add("Robi");
        mobileOperatorsBD.add("Teli Talk");
        mobileOperatorsBD.add("Air Tel");

      List<String> mobileOperatorsUSA = new LinkedList<>();
        mobileOperatorsUSA.add("AT&T");
        mobileOperatorsUSA .add("T Mobile");
        mobileOperatorsUSA .add("Sprint");
        mobileOperatorsUSA .add("Metro PCS");
        mobileOperatorsUSA .add("U.S Cellular");

        Map<Integer,List<String>> map = new HashMap<>();
        map.put(1, mobileOperatorsBD);
        map.put(2, mobileOperatorsUSA );

        // Retrieving data using for each loop
        for (Map.Entry<Integer,List<String>> operator: map.entrySet()){
            System.out.println(operator.getValue());
        }
        System.out.println("*******************Separator******************************");

        //Retrieving data using while loop with Iterator
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.println(me.getValue());
        }


    }

}
