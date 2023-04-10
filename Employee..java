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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
	import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollManagementSystem {
    private List<Employee> employees = new ArrayList<>();
    private static final String FILE_NAME = "employees.txt";

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void updateEmployee(int id, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setSalary(newSalary);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void saveEmployeesToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Employee employee : employees) {
                writer.println(employee.getId() + "," + employee.getName() + "," + employee.getSalary());
            }
            System.out.println("Employees saved to file: " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error writing employees to file: " + e.getMessage());
        }
    }

    public void loadEmployeesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double salary = Double.parseDouble(data[2]);
                Employee employee = new Employee(id, name, salary);
                employees.add(employee);
            }
            System.out.println("Employees loaded from file: " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error loading employees from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PayrollManagementSystem payrollManagementSystem = new PayrollManagementSystem();

        Employee employee1 = new Employee(1, "John", 50000);
        Employee employee2 = new Employee(2, "Mary", 60000);

        payrollManagementSystem.addEmployee(employee1);
        payrollManagementSystem.addEmployee(employee2);

        payrollManagementSystem.printAllEmployees();

        payrollManagementSystem.updateEmployee(1, 55000);

        payrollManagementSystem.printAllEmployees();

        payrollManagementSystem.removeEmployee(2);

        payrollManagementSystem.printAllEmployees();

        payrollManagementSystem.saveEmployeesToFile();
    }
}

}
