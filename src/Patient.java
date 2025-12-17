public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void displayInfo() {
        System.out.println(this);
    }
    public int compareTo(Patient other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return "Patient [ID=" + patientId +
                ", Name=" + name +
                ", Age=" + age +
                ", Diagnosis=" + diagnosis + "]";
    }

}
