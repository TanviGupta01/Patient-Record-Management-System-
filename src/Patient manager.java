import java.util.ArrayList;

public class PatientManager {

    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
        System.out.println("✅ Patient added successfully!");
    }

    public void searchPatient(String name) {
        for(Patient p : patients) {
            if(p.getName().equalsIgnoreCase(name)) {
                System.out.println("\nRecord Found:");
                System.out.println(p);
                return;
            }
        }
        System.out.println("❌ No record found");
    }

    public void viewAll() {
        if(patients.isEmpty()) {
            System.out.println("No records available!");
            return;
        }

        System.out.println("\n--- Patient Records ---");
        for(Patient p : patients) {
            System.out.println(p);
        }
    }
}
