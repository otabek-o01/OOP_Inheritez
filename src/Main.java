public class Main {
    public static void main(String[] args){
        Employee e = new Employee(100000000);
        Manager m = new Manager(2000000);
        SeniorManager sm = new SeniorManager(8000000);

        System.out.println("Employee balance :" + e.Salary());
        System.out.println("Manager balance :" + m.Salary());
        System.out.println("SeniorManager balance :" + sm.SeniorManager());
    }
}
