package math.problems;

public class Fibonacci {
     /*Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13*/

    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 1; i <= 40; ++i)
        {
            System.out.print(firstNum + " ");
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;

        }
    }
}
