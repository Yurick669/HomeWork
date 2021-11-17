package pro.sky.courseWork;

public class Employee {

    private final String employeeName;
    private int department;
    private int salary;
    private final int id;
    private static int counter;

    public Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.id = counter ++;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return
                "ФИО: " + employeeName + '\'' +
                ", Департамент: " + department +
                ", Зарплата: " + salary +
                ", id: " + id;
    }
}
