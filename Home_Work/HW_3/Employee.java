package OOP.Home_Work.HW_3;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected int age; // возраст

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    public Employee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }


    ///// создать ставку + время проработанное

    /**
     * Расчет среднемесячной заработной платы
     * @return
    */
    public abstract double calculateSalary();
    /* 

    @Override // по имени + зп
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
    */

    /*

    @Override // по зп
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
*/


    @Override // по возраст + зп 
    public int compareTo(Employee o) {
        int res = age - o.age;
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
}
