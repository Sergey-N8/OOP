package OOP.Home_Work.HW_3;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; З. П. (фиксированная): %.2f (руб.), возраст %d",
                surname, name, calculateSalary(), age);
    }
}
