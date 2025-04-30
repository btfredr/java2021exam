package Task6;

public class Professors extends Employees {
    private String course;
    private boolean courseIsActive;

    
    public Professors(int number, String firstName, String lastName, int age, String course, boolean courseIsActive) {
        super(number, firstName, lastName, age); // Kall til Employees(String name)
        this.course = course;
        this.courseIsActive = courseIsActive;

    }
    
}
