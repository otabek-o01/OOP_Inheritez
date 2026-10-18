public class Employee {
    protected int salary;

    Employee(int salary) {
        this.salary = salary;
    }
    double Salary() {
        return salary * 0.05;
    }
}