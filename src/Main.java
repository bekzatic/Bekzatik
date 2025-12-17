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

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();
        d2.displayInfo();
        h1.displayInfo();
        h2.displayInfo();
        h3.displayInfo();


        if (p1.compareTo(p2) > 0) {
            System.out.println(p1.getName() + " is older than " + p2.getName());
        } else {
            System.out.println(p2.getName() + " is older than " + p1.getName());
        }

        if(h1.compareTo(h2)==1){
            if(h1.compareTo(h3)==1){
                System.out.println(h1.getHospitalName()+" is the largest");
            }else{
                System.out.println(h3.getHospitalName()+" is the largest");
            }
        }else{
            if(h2.compareTo(h3)==1){
                System.out.println(h2.getHospitalName()+" is the largest");
            }else{
                System.out.println(h3.getHospitalName()+" is the largest");
            }
        }

    }
}
