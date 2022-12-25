package pro.sky.java.course1.coursework3;

public class Main {
    private static final Employee[] staff = {
            new Employee(" Олег Григорьевич Мирошкин ", 196700, 1),
            new Employee(" Эдуард Николаевич Кожедуб ", 197800, 1),
            new Employee(" Мирослава Петровна Волкова ", 19370, 2),
            new Employee(" Богдан Макарович Денисов ", 199400, 2),
            new Employee(" Софья Тимофеевна Куликова ", 197000, 3),
            new Employee(" Дамир Максимович Сахаров ", 195600, 3),
            new Employee(" Андрей Романович Зайцев", 200056, 4),
            new Employee(" Виктория Ивановна Наумова ", 200451, 4),
            new Employee(" Ярослав Иванович Новиков ", 207803, 5),
            new Employee(" Михаил Ильич Малахов ", 199920, 5)
    };

    public static void printStaff() {
        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int total = 0;
        for (Employee employee : staff) {
            total += employee.getSalary();
        }
        return total;
    }

    public static int searchAverageSalary() {
        return (calculateTotalSalary) / staff.lenght;
    }
    public static void printFullNameWorker(){
        for (Employee employee : staff) {
            System.out.println(employee.getFullNameWorker());
        }
    }


    public static void main(String[] args) {
        System.out.println(" Сумма затрат на зарплаты = " + calculateTotalSalary(staff) + " рублей ");
        printStaff(staff);
        printFullNameWorker(staff);


    }
}
