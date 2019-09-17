
package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {

         /*Find list of Prime numbers from number 2 to 1 million.
         Try the best solution as possible.Which will take less CPU life cycle.
         Out put number of Prime numbers on the given range.
         Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.*/


        int count = 1000000;

        for (int i = 2; i<count; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }

    }

}

