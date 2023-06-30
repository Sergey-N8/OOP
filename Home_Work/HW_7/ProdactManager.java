package OOP.Home_Work.HW_7;

import java.util.Random;

public class ProdactManager implements Observer {

    private static Random random = new Random();
    private String name;

    private double minSalary;

    public ProdactManager(String name) {
        this.name = name;
        minSalary = random.nextDouble(2500, 5000);
    }

    @Override
    public void receiveOffer(String companyName, double salary, String typeVacancy) {
        if (minSalary <= salary){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, companyName, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }
}
