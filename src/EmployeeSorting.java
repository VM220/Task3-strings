import java.util.*;
class Employee {
    String name;
    int age;
    double salary;
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}
public class EmployeeSorting {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 60000));
        employees.add(new Employee("Bob", 25, 75000));
        employees.add(new Employee("Charlie", 28, 50000));
        employees.add(new Employee("David", 35, 90000));
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });

        System.out.println("Employees sorted by Salary (descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name); // ascending
            }
        });
        System.out.println("\nEmployees sorted by Name (ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
