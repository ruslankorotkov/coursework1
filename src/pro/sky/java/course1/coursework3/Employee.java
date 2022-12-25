package pro.sky.java.course1.coursework3;

public class Employee {
    public String fullNameWorker;
    public int salary;
    public int department;
    public Employee(String fullNameWorker, int salary, int department) {
        this.fullNameWorker = fullNameWorker;
        this.salary = salary;
        this.department = department;
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
        public String toString(){
        return " Employee {"+
                " , fullNameWorker "+ fullNameWorker+
                " , salary"+ salary+
                " , department "+ department+
                " }";
        }

}
