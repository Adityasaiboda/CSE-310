public class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

public class Payroll {
    public double calculateNetPay(Employee employee, double bonus, double deduction) {
        double grossPay = employee.getSalary() + bonus;
        double netPay = grossPay - deduction;
        return netPay;
    }

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", 5000);
        Payroll payroll = new Payroll();
        double bonus = 1000;
        double deduction = 500;
        double netPay = payroll.calculateNetPay(emp1, bonus, deduction);
        System.out.println("Employee name: " + emp1.getName());
        System.out.println("Net pay: " + netPay);
    }
}
}

}


