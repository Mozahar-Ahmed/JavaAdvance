package math.problems;

import java.util.Scanner;

public class Factorial {

    /*Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
    Write a java program to find Factorial of a given number using Recursion as well as Iteration.*/

    public static int getFact(int num) {
        if (num == 0)
            return 1;
        else {
            return (num * getFact(num- 1));
        }
    }
    public static void main(String[] args) {

        System.out.println(getFact(6));

    }

}

