package lab_1;

/**
 *
 * @author maksymkalinichenko
 */
public class ContactInfo {

    private long phoneNumber;
    private String emergContactName;
    private long emergContactNumber;
    private String email;

    public ContactInfo() {
    }

    public ContactInfo(long phoneNumber, String emergContactName, long emergContactNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.emergContactName = emergContactName;
        this.emergContactNumber = emergContactNumber;
        this.email = email;
    }

    public void SetPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long GetPhoneNumber() {
        return phoneNumber;
    }

    public void SetEmergContactName(String emergContactName) {
        this.emergContactName = emergContactName;
    }

    public String GetEmergContactName() {
        return emergContactName;
    }

    public void SetEmergContactNumber(long emergContactNumber) {
        this.emergContactNumber = emergContactNumber;
    }

    public long GetEmergContactNumber() {
        return emergContactNumber;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public String GetEmail() {
        return email;
    }

    public String toString() {
        return String.format("Phone Number: %d\nEmergency Contact Name: %s\nEmergency Contact Number: %d\nEmail: %s\n", phoneNumber, emergContactName, emergContactNumber, email);
    }
}
