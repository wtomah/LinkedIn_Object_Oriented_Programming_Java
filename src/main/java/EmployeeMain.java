public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(EmployeeName.JOHN, 25, 10000.00, "Dallas");
        Employee employee2 = new Employee(EmployeeName.PHIL, 30, 11000.00, "Houston");

        employee2.raiseSalary();

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);


    }
}
