package lab_1;

/**
 *
 * @author maksymkalinichenko
 */
public class Test {

    static Student STUDENT1 = new Student(new ContactInfo(4167778888L, "Mia", 7625559898L, "mia@gmail.com"),
            new StudentIDCard(2020, "Computer Engineering Technology", "N0XXXXXX"));

    static Student STUDENT2 = new Student(new ContactInfo(6472225858L, "Meg", 2824445858L, "meg@hotmail.com"),
            new StudentIDCard(2019, "Electrical Engineering Technology", "NYYYYYYY"));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        STUDENT1.SetFirstName("John");
        STUDENT1.SetLastName("Smith");
        STUDENT1.SetBirthDate("July 11 2005");

        STUDENT2.SetFirstName("Kay-Marie");
        STUDENT2.SetLastName("Doe");
        STUDENT2.SetBirthDate("October 3, 1997");

        System.out.println("STUDENT1: \n" + STUDENT1);
        System.out.println("Contact Info: \n" + STUDENT1.GetInformation());
        System.out.println("Student ID Card: \n" + STUDENT1.GetCard());

        System.out.println("STUDENT2: \n" + STUDENT2);
        System.out.println("Contact Info: \n" + STUDENT2.GetInformation());
        System.out.println("Student ID Card: \n" + STUDENT2.GetCard());
    }

}
