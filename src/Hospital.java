public class Hospital {
    private String hospitalName;
    private String location;
    private int capacity;

    public Hospital(String hospitalName, String location, int capacity) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.capacity = capacity;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    public int compareTo(Hospital other) {
        return Integer.compare(this.capacity, other.capacity);
    }

    public String toString() {
        return "Hospital [Name=" + hospitalName +
                ", Location=" + location +
                ", Capacity=" + capacity + "]";
    }
}
