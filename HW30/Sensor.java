package HW30;
//Ryan Jukes
//2-10-25
//AT Java HW 30

public abstract class Sensor {
    private String name;
    private int modelNumber;

    public String getName() {
        return name;
    }

    public void setName(String nName) {
        name = nName;
    }

    public int getModeNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public abstract void recordMeasurement();
}
