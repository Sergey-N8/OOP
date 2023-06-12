package OOP.Home_Work.HW_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    //public void setSatiety() {
        //this.satiety = true;
    //}

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(int food) { 
        if (food >= appetite){
            this.satiety = true;
        }
    }

    public void info() {
        System.out.println(satiety);
    }
}