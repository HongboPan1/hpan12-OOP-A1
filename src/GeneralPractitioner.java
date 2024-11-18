/**
 * GeneralPractitioner class that extends HealthProfessional
 * Represents a general practitioner with additional clinic information
 * Username: hpan12
 */
public class GeneralPractitioner extends HealthProfessional {
    private String clinic;

    // Represents a general practitioner with additional clinic information
    public GeneralPractitioner() {
        super();
        this.clinic = "default";
    }

    public GeneralPractitioner(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: General");
        System.out.println("Clinic: " + clinic);
    }

    public String getOperationHours() {
        return "Open from 13:00 to 21:00";
    }
}
