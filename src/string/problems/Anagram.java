package string.problems;

import java.util.Arrays;

public class Anagram {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

    static void isAnagram(String str1, String str2) {
            String s1 = str1.replaceAll("\\s", "");
            String s2 = str2.replaceAll("\\s", "");
            boolean status = true;
            if (s1.length() != s2.length()) {
                status = false;
            } else {
                char[] ArrayS1 = s1.toUpperCase().toCharArray();
                char[] ArrayS2 = s2.toUpperCase().toCharArray();
                Arrays.sort(ArrayS1);
                Arrays.sort(ArrayS2);
                status = Arrays.equals(ArrayS1, ArrayS2);
            }
            if (status) {
                System.out.println(s1 + " and " + s2 + " are anagrams");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams");
            }
        }

        public static void main(String[] args) {
            isAnagram("CAT", "ACT");
            isAnagram("ARMY", "MARY");
            isAnagram("Mother In Law", "Hitler Woman");
            isAnagram("Cactus", "Calculus");
        }
    }

