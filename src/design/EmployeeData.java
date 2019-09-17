package design;

public abstract class EmployeeData {
    private int day = 0;
    private int week = 0;
    private int numberOfEmployee = 500;
    private long totalBudget = 10000000;

    public EmployeeData(){}
    public EmployeeData(int number,int numberOfEmployee,String name){

        System.out.println("This is a constructor where i am calling from concrete class");
    }

    public abstract void compensation();

    public int employeeHour(int day, int week) {
        this.day = day;
        this.week = week;

        int total = day * week;
        return total;
    }

    public void numberOfDepartment(int numBuilding ,int numDepartment ) {
        numDepartment = 0;
        if (numBuilding == 4) {
            numDepartment = numBuilding * 4;
        } else if (numBuilding == 3) {
            numDepartment = numBuilding * 3;
        } else if (numBuilding == 2) {
            numDepartment = numBuilding * 2;
        } else {
            System.out.println("The are only building no Extended department !!");
        }
        System.out.println(numDepartment + " Department has in the company where total building is " + numBuilding);

    }
    public void averageSalary( int numberOfEmployee, long totalBudget) {

        this.numberOfEmployee = numberOfEmployee;
        this.totalBudget = totalBudget;

        double  averageSalary = (totalBudget / numberOfEmployee);
        System.out.println("Average Salary for the company's each employee : " + averageSalary);

    }
    public void oldPension(double salary) {
        double pension = 0;


        if (salary <= 150000) {
            pension = salary * 0.40;
        } else if (salary >= 120000) {
            pension = salary * 0.50;
        } else {
            System.out.println("company provides job leaving compensation so" +
                    " that Employee cant ask for the old age pension ");
        }
        System.out.println("Total of $" + pension + " pension company provides at old pension");

        System.out.println("Company also provide old Age pension policy ");
    }

}
