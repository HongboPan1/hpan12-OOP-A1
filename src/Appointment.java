
public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    /**
     * default constructor
     */
    public Appointment() {
        this.patientName = "null";
        this.timeSlot = "12:00";
        this.doctor = null;
        this.mobilePhone = "0000000000000";
    }

    /**
     * constructor for adding new appointment.
     */
    public Appointment(String pName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.timeSlot = timeSlot;
        this.patientName = pName;
        this.doctor = doctor;
        this.mobilePhone = mobilePhone;

    }

    /**
     * get the mobile number of the patient.
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Prints all details of the appointments.
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor == null)
            System.out.println("No doctor was assigned to current patient.");
        else
            doctor.printDetails();

    }
}
