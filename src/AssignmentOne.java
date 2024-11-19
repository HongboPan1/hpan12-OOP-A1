import java.util.ArrayList;
/**
 * AssignmentOne activation class with main method.
 * Username: hpan12
 */
public class AssignmentOne {

    private static ArrayList<Appointment> apps = new ArrayList<>();

    /**
     * Creates a new appointment and add to the array list.
     */
    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || mobilePhone == null || timeSlot == null || doctor == null) {
            System.out.println("Error: phone number was not found.");
            return;
        }
        //add new appointment to the array list.
        apps.add(new Appointment(patientName, mobilePhone, timeSlot, doctor));
    }

    /**
     * Prints all appointments details.
     */
    public static void printExistingAppointments() {
        if (apps.isEmpty()) {
            System.out.println("Arraylist is empty.");
            return;
        }
        for (Appointment appointment : apps) {
            System.out.println("------------------------------");
            appointment.printDetails();
        }
    }

    /**
     * cancel the appointment by the phone number.
     */
    public static void cancelBooking(String mobilePhone) {
        boolean removed = apps.removeIf(appointment -> appointment.getMobilePhone().equals(mobilePhone));
        if (removed) {
            System.out.println("Appointment was canceled with number: " + mobilePhone);
        } else {
            System.out.println("No appointment found from: " + mobilePhone);
        }
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3");

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Adams", "General Medicine", "Health Center A");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Lee", "Family Health", "Health Center B");
        Specialist sp1 = new Specialist(3, "Dr. Green", "Cardiology", "Heart Health Specialist");
        Specialist sp2 = new Specialist(4, "Dr. White", "Gastroenterology", "Digestive Health Specialist");

        gp1.printDetails();
        gp2.printDetails();
        sp1.printDetails();
        sp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("Part 5");

        createAppointment("Eve", "1112223333", "09:00", gp1);
        createAppointment("Frank", "4445556666", "12:00", gp2);
        createAppointment("Grace", "7778889999", "15:00", sp1);
        createAppointment("Helen", "2223334444", "18:00", sp2);

        System.out.println("All Existing Appointments:");
        printExistingAppointments();

        cancelBooking("1112223333");
        cancelBooking("0000");
        System.out.println("Updated Appointments:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }

}
