package Task6;
/*
    The task is to create a Java program that supports the classification of employees kept in an archive
    of a university.
    1. Create a class named Employees that contains data fields for the employee number, first
    name, last name, and age. Include Get and Set methods for these fields (4 points).

    2. Class Employees should have two method constructors that assign values to the specific
    fields. One constructor with three arguments (number, firstName, lastName) and one with
    four arguments (number, firstName, lastName, age) (3 points).

    3. Class Employees should offer print method that writes a message about the first name, last
    name and age of the employee (3 points).

    4. Create two subclasses that will extend class Employees and which will be named: Professors
    and Advisors (4 points).

    5. Professors subclass should contain additional fields (1 point):

    a. One that holds a code of the course professor teaches.
    b. One field that indicates whether the course is active or not.

    6. Professors should have additional constructor that updates those two additional fields (3
    points) in addition to the constructor from the superclass.

    7. Add methods getCourse and isActive that read and return values of the fields course and
    active, respectively (3 points).

    8. Override the print method from the superclass to create method in Professors class to print
    information from all available fields (3 points).

    9. Advisors subclass should contain additional field that stores the name of the department
    (that advisor is employed by) (2 points).

    10. Use polymorphism to create two methods in Advisors class to print information about the
    advisors. One method should print only first name and last name. Other method should
    print all available information. (4 points).

    11. Create simple Test class with main method, that will create instances of one Professor and
    one Advisor and print details from both (5 points).

    Pay attention on the use of access modifiers and readability of the code. During the assessment of
    this task, special attention will be focused on the ability to implement basic principles of objectoriented programming: inheritance, encapsulation, and polymorphism.
 */
public class Employee {
    // private data fields
    private int empNum;
    private String firstName;
    private String lastName;
    private int age;
}
