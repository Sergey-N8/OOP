package OOP.Home_Work.HW_2;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        if (food >= 0){
            this.food = food;
        }
        else{
            this.food = 0;
        }
    }

    public void addFood(int add) {
        this.food = food + add;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}




