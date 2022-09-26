package JavaCollections;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String fn, String ln) {
        super();
        firstName = fn;
        lastName = ln;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
