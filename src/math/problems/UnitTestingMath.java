package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        Factorial factorial = new Factorial();
        System.out.println(Factorial.getFact(6));//returns 720
        Fibonacci fibonacci = new Fibonacci();
        FindMissingNumber findMissingNUmber = new FindMissingNumber();
        LowestNumber lowestNumber = new LowestNumber();
        Pattern pattern = new Pattern();
        PrimeNumber primeNumber = new PrimeNumber();
    }
}
