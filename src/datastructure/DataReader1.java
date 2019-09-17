package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader1 {
    public static void main(String[] args) {

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

        //String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        FileReader fr = null;
        BufferedReader br = null;
        String fileName = "C:\\Users\\13135\\Downloads\\midtermJava\\MidtermSeptember2019-master\\src\\data\\self-driving-car";
        String data;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while((data=br.readLine())!= null)
                System.out.println(data);
        }catch(Exception e){
            System.out.println("File is out of reach");
        }
        finally{
            try{
                fr.close();
                br.close();
            }

            catch(Exception ex){
                System.out.println("File is closed now");
            }
        }
    }
}