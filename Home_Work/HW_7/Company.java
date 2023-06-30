package OOP.Home_Work.HW_7;

import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;
    private  double maxSalary;
    private Publisher jobAgency;
    private String typeVacancy;


    public Company(String companyName, double maxSalary, Publisher jobAgency, String typeVacancy) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.typeVacancy = typeVacancy;
        
    }

    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(companyName, salary, typeVacancy);
    }


}
