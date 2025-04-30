package Task6;

public class Professors extends Employees {
    private String course;
    private boolean courseIsActive;

    
    public Professors(int number, String firstName, String lastName, int age, String course, boolean courseIsActive) {
        super(number, firstName, lastName, age); // Kall til Employees(String name)
        this.course = course;
        this.courseIsActive = courseIsActive;
    }

    // Get methods

    public String getCourse() {
        return course;
    }

    public boolean isActive() {
        return courseIsActive;
    }

    @Override
    public void print() {
        System.out.println("Professor information: ");
        System.out.println("Employee number: " + getEmpNum());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + getCourse());
        System.out.println("Is the course active? " + isActive());
    }
    
}
