package string.problems;

import java.util.Map;

public class UnitTestingStringProblem1 {

        public static void main(String[] args) {
            //Apply Unit Test into all the methods in this package.
            char [] str1 = {'A', 'R', 'M', 'Y'};
            char [] str2 = {'M', 'A', 'R', 'Y'};
            char [] str3 = {'W', 'A', 'R', 'Y'};
            //System.out.println(Anagram.isAnagram(str1,str2));
            //System.out.println(Anagram.isAnagram(str1,str3));

            String s = "Human brain is a biological learning machine";
            Map<Integer, String> wordNLength = DetermineLargestWord.findTheLargestWord(s);
            System.out.println(wordNLength);

            System.out.println("The average length of words in the above string is "+DuplicateWord1.getAverage(s));

           // Permutation.printPermutation("abb", "");
        }
    }

