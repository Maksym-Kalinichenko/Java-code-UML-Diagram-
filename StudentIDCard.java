package lab_1;

/**
 *
 * @author maksymkalinichenko
 */
public class StudentIDCard {

    private int yearStarted;
    private String programName;
    private String IDNumber;

    public StudentIDCard() {
    }

    public StudentIDCard(int yearStarted, String programName, String IDNumber) {
        this.yearStarted = yearStarted;
        this.programName = programName;
        this.IDNumber = IDNumber;
    }

    public void SetYearStarted(int YearStarted) {
        this.yearStarted = yearStarted;
    }

    public int GetYearStarted() {
        return yearStarted;
    }

    public void SetProgramName(String programName) {
        this.programName = programName;
    }

    public String GetProgramName() {
        return programName;
    }

    public void SetIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String GetIDNumber() {
        return IDNumber;
    }

    public String toString() {
        return String.format("Year Started: %d\nProgram Name: %s\nID Number: %s\n", yearStarted, programName, IDNumber);
    }
}
