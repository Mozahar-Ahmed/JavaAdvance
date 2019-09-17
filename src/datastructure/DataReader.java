package datastructure;

        import javax.xml.crypto.Data;
        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.util.*;

public class DataReader {


    public static void main(String[] args) throws FileNotFoundException{
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        FileReader fr = null;
        BufferedReader br = null;
        String string = "";
        String data = "";

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        try {
            fr = new FileReader(textFile);
            br = new BufferedReader(fr);

            while ((string = br.readLine()) != null) {
                data = data + string;
                System.out.println(string.trim());
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (fr != null) {
                fr = null;
            }
            if (br != null) {
                br = null;
            }

        }

        String[] arrayOfSelfDriving = data.split(" ");
//        System.out.println(arrayOfSelfDriving.length);

        /**
         * using set interface with it implemented class HashSet
         * where it contain unique values saying false to that
         * iterating the duplicate word using for each loop
         */
        Set<String> unique = new HashSet<>();
        for(String arrayODriving : arrayOfSelfDriving){
            if(unique.add(arrayODriving) ==false){
                System.out.println(arrayODriving+"  ---> has duplicate word in teh text");
            }
        }
            /* This is another way to iterate duplicate*/
        for (int i = 0; i < arrayOfSelfDriving.length; i++) {
            for (int j = i + 1; j < arrayOfSelfDriving.length; j++) {
                if (arrayOfSelfDriving[i].equals(arrayOfSelfDriving[j])) {
                    System.out.println(arrayOfSelfDriving[i] + " ----> has Duplicate word in the self driving-car-text");
                }
            }
        }

        Stack<String> storeStack = new Stack<String>();

        List<String> list = new LinkedList<String>();

        for (String element : arrayOfSelfDriving) {
            list.add( element );
            storeStack.push( element );
        }
        System.out.println( "\nLinkedList FIFO:" );
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print( itr.next() + " " );
        }

        System.out.println( "\n\nStack FILO:" );

        while (!storeStack.isEmpty()) {
            System.out.print( storeStack.pop() + " " );
        }

        System.out.println( storeStack.push( "\n\nMozahar" ) );
        System.out.println( storeStack.search( "right" ) );

        System.out.println( storeStack.peek() );

        System.out.println( storeStack.empty() );

    }

}
