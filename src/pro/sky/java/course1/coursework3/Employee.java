package pro.sky.java.course1.coursework3;

public class Employee {
    private int id;
    private String fullNameWorker;
    private int salary;
    private int department;
    private static int idCounter = 1;

    public Employee(String fullNameWorker, int salary, int department) {
        this.id = idCounter++;
        this.fullNameWorker = fullNameWorker;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFullNameWorker() {
        return fullNameWorker;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee {" +
                " ID = " + id +
                ", Ф.И.О. = '" + fullNameWorker + '\'' +
                ", зарплата = " + salary +
                ", департамент = " + department +
                '}';

    }
}
