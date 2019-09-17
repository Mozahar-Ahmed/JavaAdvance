   package string.problems;

        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {

         /*Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological"*/

        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        int largestWord = 0;
        String largeValue = "";
        for (Map.Entry<Integer, String> wlength : wordNLength.entrySet()) {

            if (largestWord < wlength.getKey()) {
                largestWord = wlength.getKey();
                largeValue = wlength.getValue();
            }
        }
        System.out.println( "Largest word is : " + largeValue + " \n length: " + largestWord );
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        //implement
        String[] word = wordGiven.split( " " );
        for (int i = 0; i < word.length; i++) {
            map.put( word[i].length(), word[i] );
        }

        return map;
    }
}