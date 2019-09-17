package design;

import java.util.*;

public class FortuneEmployee {


      /*FortuneEmployee class has a main methods where you will be able to create Object from
      EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
      to use with proper business work flow.Think as a Software Architect, Product Designer and
      as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
      more to design an application that will meet for fortune 500 Employee Information Services
      Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data*/


    public static void main(String[] args) {

        EmployeeInfo.employeeBio();

        System.out.println("***");
        new EmployeeInfo(40, 500, "company");
        System.out.println("***");
        EmployeeInfo.calculateEmployeeBonus(5);

        EmployeeInfo empInfo = new EmployeeInfo();
        empInfo.assignDepartment();
        empInfo.oldPension(140000.00);
        empInfo.calculateSalary(5);
        empInfo = new EmployeeInfo("", 0);

        int id = empInfo.employeeId();
        String name = empInfo.employeeName();
        System.out.println(name + "has id number of :" + id);

        Employee.dentalCare(80000);

        EmployeeData ed = new EmployeeInfo();

        ed.numberOfDepartment(3, 5);

        ed.averageSalary(500, 100000000);

        double em = EmployeeInfo.calculateEmployeePension(800000);
        System.out.println(em);

        System.out.println();
        GeneralOfficer.gOfficer.getInstance().responsibilities();


        Scanner sc = new Scanner(System.in);
        List<String> gmSnumber = new ArrayList<>();
        gmSnumber.add("Mike -> 234-567-9899");
        gmSnumber.add("Bob -> 234-567-8754");
        gmSnumber.add("Jhon -> 643-256-8345");

        List<String> customerCare = new ArrayList<String>();
        customerCare.add("Account Departments");
        customerCare.add("Loan Department");
        customerCare.add("Credit card Info");

        List<String> generalInfo = new LinkedList<>();
        generalInfo.add("Students loan");
        generalInfo.add("Business Loan");
        generalInfo.add("Mortgage Loan");

        HashMap<Integer, List<String>> mp = new HashMap<>();
        mp.put(1, gmSnumber);
        mp.put(2, customerCare);
        mp.put(3, generalInfo);

        System.out.println(" Press 0 for the all list of service and departments");
        System.out.println(" Press 1 for all general manager phone numbers");
        System.out.println(" Press 2 for customer care service");
        System.out.println(" Press 3 for more general information");

        int num = sc.nextInt();

        if ((num >= 0) && (num < 4)) {

            if (num == 0) {
                for (Map.Entry<Integer, List<String>> m : mp.entrySet()) {
                    System.out.println(m.getKey() + "  " + m.getValue());
                }
            }

            if (num == 1) {
                System.out.println(mp.get(1));
            }
            if (num == 2) {
                System.out.println(mp.get(2));
            }
            if (num == 3) {
                System.out.println(mp.get(3));
            }


        } else {
            System.out.println("Invalid Entry");
        }
    }

}
