package pro.sky.java.course1.coursework3;

public class Main {
    private static final Employee[] STAFF = {
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
        for (Employee element : STAFF) {
            System.out.println(element);
        }
    }

    public static double calculateTotalSalary() {
        double total = 0;
        for (Employee element : STAFF) {
            total += element.getSalary();
        }
        return total;
    }

    public static void printFullNameWorker() {
        for (Employee element : STAFF) {
            System.out.println(element.getFullNameWorker());
        }
    }

    public static double searchAverageSalary() {
        return calculateTotalSalary() / STAFF.length;
    }

    public static Employee searchMaxSalary() {
        Employee result = STAFF[0];
        double maxSalary = -1;
        for (Employee element : STAFF) {
            if (element.getSalary() > maxSalary) ;
            {
                maxSalary = element.getSalary();
                result = element;
            }
        }
        return result;
    }

    public static Employee searchMinSalary() {
        Employee result = STAFF[0];
        double minSalary = 1_000_000;
        for (Employee element : STAFF) {
            if (element.getSalary() < minSalary) ;
            {
                minSalary = element.getSalary();
                result = element;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(" Сумма затрат на зарплаты = " + calculateTotalSalary() + " рублей ");
        printStaff();
        printFullNameWorker();
        System.out.println(" Средняя зарплата = " + searchAverageSalary() + " рублей ");
        System.out.println(" Максимальная зарплата = "+ searchMinSalary());
        System.out.println(" Минимальная зарплата = "+ searchMinSalary());

    }
}
