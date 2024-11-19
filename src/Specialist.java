/**
 * Represents a specialist health professional with specific expertise.
 * Username: hpan12
 */
public class Specialist extends HealthProfessional {
    private String expertise;

    public Specialist() {
        super();
        this.expertise = "General Specialist";
    }

    // Represents a specialist with additional expertise information;
    public Specialist(int id, String name, String specialization, String expertise) {
        super(id, name, specialization);
        this.expertise = expertise;
    }

    // Prints the details of the Specialist including id, name, specialization, and expertise.
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Expertise: " + expertise);
    }

    public String getOperationHour() {
        return "Open from 9:00 to 17:00";
    }
}
