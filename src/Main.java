public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient(101, "Bekzat", 17, "Astigmatism");
        Patient p2 = new Patient(102, "Nurislam", 24, "Diabetes");

        MedicalProfessional d1 = new MedicalProfessional(201, "Dr. Smith", "Cardiology");
        MedicalProfessional d2 = new MedicalProfessional(202, "Dr. Strange", "Surgean");

        Hospital h1 =
                new Hospital("BeHealthy", "New York", 1000);
        Hospital h2 =
                new Hospital("Medicer", "Astana", 350);
        Hospital h3 =
                new Hospital("Hospital", "Almaty", 50);


        // Output to console
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();
        d2.displayInfo();
        h1.displayInfo();
        h2.displayInfo();
    }
}
