/**
 * Represents a health professional with an ID, name, and specialization.
 * Username: hpan12
 */
public class HealthProfessional {
    private int id;
    private String specialization;
    private String name;


    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public HealthProfessional() {
        this.id = 0;
        this.name = "default";
        this.specialization = "general";
    }


    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
