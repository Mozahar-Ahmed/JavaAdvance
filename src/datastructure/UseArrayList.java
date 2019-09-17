package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         */

        //Creating object
        ArrayList<String> districts = new ArrayList<String>();

        //Using ArrayList
        //add elements
        districts.add("Mymensingh");
        districts.add("Gopalgonj");
        districts.add("Comilla");
        districts.add("Noakhali");
        districts.add("Chittagong");
        districts.add("Chandpur");
        districts.add("Cox's Bazar");
        districts.add("Kishoregonj");
        System.out.println(districts); //print ArrayList with all the values

        //retrieve peek/head/first element using get() method
        System.out.println(districts.get(0));

        //remove an element using remove() method
        districts.remove(1);
        System.out.println(districts);

        //modify an element using set method()
        districts.set(2, "Kushtia");
        System.out.println(districts);

        //retrieve the total count of elements in the list using size() method
        System.out.println("The updated number of districts in the list now is "+ districts.size());

        //retrieve all the elements in the list at a time using for each loop/enhanced for loop
        for(String s: districts){
            System.out.println(s);
        }

        System.out.println("*******************This is a marking line only**************************");

        //retrieve all the elements in the list at a time using while loop with iterator
         Iterator<String> it = districts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
    }

    }

}
