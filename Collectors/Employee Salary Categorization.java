import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;
    
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class EmployeeSalaryAnalysis {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 75000),
            new Employee("Bob", "HR", 60000),
            new Employee("Charlie", "IT", 85000),
            new Employee("Diana", "Finance", 90000),
            new Employee("Eve", "HR", 55000),
            new Employee("Frank", "Finance", 95000)
        );
        
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        
        System.out.println("Average salary by department:");
        avgSalaryByDept.forEach((dept, avgSalary) -> 
            System.out.printf("%s: $%.2f%n", dept, avgSalary));
    }
}