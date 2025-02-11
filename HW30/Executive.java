package HW30;
//Ryan Jukes
//2-10-25
//AT Java HW 30

public class Executive extends Manager {
    private double stonks = 0;

    public Executive (String name, double salary, double bonus, double stonks) {
        super(name, salary, bonus);
        this.stonks = stonks;
    }

    public void displayInfo() {
        System.out.println("Name = "+super.getName()+", Salary = "+super.getSalary()+", Bonus = "+super.getBonus()+", Stocks = "+stonks);
    }
}
