public class Employee {
    EmployeeName employeeName;
    int age;
    double salary;
    String location;

    Employee(EmployeeName employeeName, int age, double salary, String location){
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(){
        if(this.age>= 29) {
            this.salary = this.salary + 100.0;
        }

    }
}
