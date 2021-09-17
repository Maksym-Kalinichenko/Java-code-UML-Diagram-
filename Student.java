package lab_1;

/**
 *
 * @author maksymkalinichenko
 */
public class Student extends Person {

    private ContactInfo Information;
    private StudentIDCard Card;

    public Student() {
    }

    public Student(ContactInfo Information, StudentIDCard Card) {
        SetInformation(Information);
        SetCard(Card);
    }

    public ContactInfo GetInformation() {
        return Information;
    }

    public void SetInformation(ContactInfo Information) {
        this.Information = Information;
    }

    public StudentIDCard GetCard() {
        return Card;
    }

    public void SetCard(StudentIDCard Card) {
        this.Card = Card;
    }
}
