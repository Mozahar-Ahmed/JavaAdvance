package design;

public interface Employee {

	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
    Please read the following method and understand the business requirements of these following methods
    and then implement these in a concrete class.*/

    //employeeId() will return employee id.
    public int employeeId();

    //employeeName() will return employee name
    public String employeeName();

    //assignDepartment() will assign employee to departments
    public void assignDepartment();

    //calculate employee salary
    public int calculateSalary();

    //employee benefit
    public void benefitLayout();

    static void dentalCare(int salary) {
        double dentalBenefit = 0;

        do {
            dentalBenefit = dentalBenefit + (salary * 0.10);
        } while ((salary > 800000) && (salary < 1500000));

        do {
            dentalBenefit = dentalBenefit + (salary * 0.20);
        } while ((salary > 600000) && (salary < 800000));
        System.out.println("Total of $" + dentalBenefit + " are people get on top of their yearly salary for dental !!!");

    }
}