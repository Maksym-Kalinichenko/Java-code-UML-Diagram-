package lab_1;

/**
 *
 * @author maksymkalinichenko
 */
public class Person {

    private String firstName;
    private String lastName;
    private String birthDate;

    public Person() {

    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String GetFirstName() {
        return firstName;
    }

    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }

    public String GetLastName() {
        return lastName;
    }

    public void SetBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String GetBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("First name: %s\nLast name: %s\nBirthdate: %s\n", firstName, lastName, birthDate);
    }
}
