package OOP.Home_Work.HW_3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();
    static boolean chose = false;

    static Employee generateEmployee(){

        if (!chose){
            String[] names = new String[] {"Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
            String[] surnames = new String[] {"Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
            int salary = random.nextInt(20000, 80000);
            int age = random.nextInt(18, 60);

            chose = true;

            return new Worker(names[random.nextInt(names.length)], 
            surnames[random.nextInt(surnames.length)], salary, age);
        } else{
            String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь"};
            String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин"};
            int salaryPerHour = random.nextInt(800, 1500);
            int hoursWork = random.nextInt(30, 120);
            int salary = salaryPerHour * hoursWork;
            int age = random.nextInt(18, 60);

            chose = false;

            return new Freelancer(names[random.nextInt(names.length)], 
            surnames[random.nextInt(surnames.length)], salary, age);
        }
    }

    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
