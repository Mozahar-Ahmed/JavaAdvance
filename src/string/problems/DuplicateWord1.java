package string.problems;

import java.util.HashMap;

public class DuplicateWord1 {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String [] array = st.split(" ");
        HashMap<String, Integer> duplicateWords = new HashMap<>();
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    count++;
                    array[j] = "0";
                }
            }
            if (count > 1 && array[i] != "0") {
                duplicateWords.put(array[i], count);
            }
        }
        System.out.println(duplicateWords);
        System.out.println("The average length of words is "+getAverage(st));
    }

    public static double getAverage(String string) {
        String [] array = string.split(" ");
        double sum = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            int numChar = array[i].length();
            sum+=numChar;
            count++;
        }
        double average = sum / count;
        return average;
    }
}