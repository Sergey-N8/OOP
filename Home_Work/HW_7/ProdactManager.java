package OOP.Home_Work.HW_7;

import java.util.Random;

public class ProdactManager implements Observer {

    private static Random random = new Random();
    private String name;

    private String typeVacancy;

    private double minSalary;

    public ProdactManager(String name) {
        this.name = name;
        minSalary = random.nextDouble(25000, 50000);
        typeVacancy = "prodactManager";
    }

    @Override
    public void receiveOffer(String companyName, double salary, String typeVacancy) {
        if (minSalary <= salary && this.typeVacancy.equals(typeVacancy)){
            System.out.printf("Продакт менеджер %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, companyName, salary);
            //minSalary = salary;
        }
        else {
            System.out.printf("Продакт менеджер %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }
}
