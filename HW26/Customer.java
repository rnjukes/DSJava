public class Customer {
    private String companyName;
    private double totalSales;
    private int numberSales;
    private int regionCode;
    private int serialNumber;
    public static int lastSerialUsed = 0;

    public Customer(String name, int regionCode) {
        companyName = name;
        totalSales = 0;
        numberSales = 0;
        this.regionCode = regionCode;

        lastSerialUsed++;
        serialNumber = lastSerialUsed;

    }
    public Customer(String name){
        companyName = name;
        totalSales = 0;
        numberSales = 0;
        regionCode = 1;

        lastSerialUsed++;
        serialNumber = lastSerialUsed;
    }
    public void addSale(double amount) {
       numberSales++;
       totalSales = totalSales + amount;
   }
    public double getSales() {
        return totalSales;
   }


}
