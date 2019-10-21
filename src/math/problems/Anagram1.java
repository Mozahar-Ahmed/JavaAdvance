package math.problems;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        char [] str1 = {'A', 'R', 'M', 'Y'};
        char [] str2 = {'M', 'A', 'R', 'Y'};
        char [] str3 = {'W', 'A', 'R', 'Y'};
        System.out.println(Anagram1.isAnagram(str1, str2));
        System.out.println(Anagram1.isAnagram(str1, str3));

    }
        public static boolean isAnagram ( char[] str1, char[] str2){

            if (str1.length != str2.length)
                return false;

            Arrays.sort(str1);
            Arrays.sort(str2);

            for (int i = 0; i < str1.length; i++)
                if (str1[i] != str2[i])
                    return false;

            return true;
        }
    }
