package HW29;

public class Manager extends Employee {
    private double bonus;

    public Manager (String empName, double empSalary, double bonus) {
        super(empName, empSalary);
        this.bonus = bonus;
    }

    public double getAnnualIncome() {
        return (bonus + getSalary());
    }
}
