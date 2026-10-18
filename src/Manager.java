public class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
    }

    @Override
    double Salary() {
        return salary * 0.10;
    }
}
