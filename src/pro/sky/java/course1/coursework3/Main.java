package pro.sky.java.course1.coursework3;

public class Main {
    private static final Employee[] staff = {
            new Employee(" Олег Григорьевич Мирошкин ", 96700, 1),
            new Employee(" Эдуард Николаевич Кожедуб ", 97800, 1),
            new Employee(" Мирослава Петровна Волкова ", 89370, 2),
            new Employee(" Богдан Макарович Денисов ", 99400, 2),
            new Employee(" Софья Тимофеевна Куликова ", 97000, 3),
            new Employee(" Дамир Максимович Сахаров ", 95600, 3),
            new Employee(" Андрей Романович Зайцев", 50056, 4),
            new Employee(" Виктория Ивановна Наумова ", 70451, 4),
            new Employee(" Ярослав Иванович Новиков ", 77803, 5),
            new Employee(" Михаил Ильич Малахов ", 99920, 5)
    };

    public static void printStaff() {
        for (Employee element : staff) {
            System.out.println(element);
        }
    }

    public static int calculateTotalSalary() {
        int total = 0;
        for (Employee element : staff) {
            total += element.getSalary();
        }
        return total;
    }

    public static void printFullNameWorker() {
        for (Employee element : staff) {
            System.out.println(element.getFullNameWorker());
        }
    }

    public static int searchAverageSalary() {
        int total = 0;
        for (Employee element : staff) {
            total += element.getSalary();
        }
        return total / staff.length;
    }


    public static void main(String[] args) {
        System.out.println(" Сумма затрат на зарплаты = " + calculateTotalSalary() + " рублей ");
        printStaff();
        printFullNameWorker();
        System.out.println(" Средняя зарплата = " + searchAverageSalary() + " рублей ");
    }
}
