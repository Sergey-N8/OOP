package OOP.Home_Work.HW_3;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee{

    protected int salaryPerHour; // Ставка заработной платы за час
    protected int hoursWork; // Часов отработанно

    

    public Freelancer(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }
/*
    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public double getHoursWork() {
        return hoursWork;
    }
*/
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; З. П." +
        "(не фиксированная): %.2f (руб.), возраст %d",
        surname, name, calculateSalary(), age);
    }
    
}
