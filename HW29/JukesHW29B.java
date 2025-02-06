package HW29;
//Ryan Jukes
//2-5-25
//AT Java HW 29 Part A

public class JukesHW29B {
    public static void main(String[] args) {
        Employee Andy = new Employee("Andy", 50000);
        Manager Ryan = new Manager("Ryan", 65000, 7500);

        System.out.printf("%-10s:    salary = $%,12.2f;   annual income = $%,12.2f%n", Andy.getName(), Andy.getSalary(), Andy.getAnnualIncome());
        System.out.printf("%-10s:    salary = $%,12.2f;   annual income = $%,12.2f%n", Ryan.getName(), Ryan.getSalary(), Ryan.getAnnualIncome());
    }
}
