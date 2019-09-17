package parser;

import org.testng.annotations.Test;

public class UnitTestingStudentProfile {

    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        XmlReader xmlReader = new XmlReader();

        System.out.println(xmlReader.convertIntToChar("95"));
    }
}
