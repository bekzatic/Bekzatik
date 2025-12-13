public class MedicalProfessional {
    private int staffId;
    private String name;
    private String specialization;

    public MedicalProfessional(int staffId, String name, String specialization) {
        this.staffId = staffId;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MedicalProfessional [ID=" + staffId +
                ", Name=" + name +
                ", Specialization=" + specialization + "]";
    }
}
