package Task6;

/*
     9. Advisors subclass should contain additional field that stores the name of the department
    (that advisor is employed by) (2 points).

    10. Use polymorphism to create two methods in Advisors class to print information about the
    advisors. One method should print only first name and last name. Other method should
    print all available information. (4 points).

 */

public class Advisors extends Employees {
    public String department;

    public Advisors(int number, String firstName, String lastName, int age, String department) {
        super(number, firstName, lastName, age); 
        this.department = department;
    }

    public void printName() {
        System.out.println("Advisor info:");
        System.out.println("First Name: " + getFirstName());
        System.out.print("Last Name: " + getFirstName());
    }

    public void printAllInfo() {
        System.out.println("Advisor info:");
        System.out.println("Employee Number: " + getEmpNum());
        System.out.println("First Name: " + getFirstName());
        System.out.print("Last Name: " + getFirstName());
        System.out.print("Age: " + getAge());
        System.out.println("Department: " + department);
    }
}
