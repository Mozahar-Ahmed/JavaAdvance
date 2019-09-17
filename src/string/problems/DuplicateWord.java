package string.problems;

import java.util.HashSet;

public class DuplicateWord {

    public static void main(String[] args) {

        /*Write a java program to find the duplicate words and their number of occurrences in the string.
        Also Find the average length of the words.*/

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

            String[] refValue=st.split(" ");
            HashSet<String> hashSet= new HashSet<>();
            for(String word:refValue){
                if(hashSet.add(word)==false){
                    System.out.println("Duplicate word is:"+word);
                }
            }
        }

    }


