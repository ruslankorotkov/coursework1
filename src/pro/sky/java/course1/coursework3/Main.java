package pro.sky.java.course1.coursework3;

public class Main {
    private static final Employee[] staff = {
            new Employee(" Олег Григорьевич Мирошкин ", 196700, 1),
            new Employee(" Эдуард Николаевич Кожедуб ", 197800, 1),
            new Employee(" Волкова Мирослава Петровна ", 19370, 2),
            new Employee(" Денисов Богдан Макарович ", 199400, 2),
            new Employee(" Куликова Софья Тимофеевна ", 197000, 3),
            new Employee(" Сахаров Дамир Максимович ", 195600, 3),
            new Employee(" Зайцев Андрей Романович ", 200056, 4),
            new Employee(" Наумова Виктория Ивановна ", 200451, 4),
            new Employee(" Новиков Ярослав Иванович ", 207803, 5),
            new Employee(" Малахов Михаил Ильич ", 199920, 5)
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



    public static void main(String[] args) {

    }
}
