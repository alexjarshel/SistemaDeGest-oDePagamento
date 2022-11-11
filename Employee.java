package estudoDeCaso;

public abstract class Employee {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String first, String last) {

        this.firstName = first;
        this.lastName = last;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    public abstract double earning();

}
