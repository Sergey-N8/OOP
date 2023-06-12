package OOP.Home_Work.HW_2;
import java.util.List;

public class CatsList {

    private List<Cat> cats;
    

    public CatsList(List<Cat> cats) {
        this.cats = cats;
    }

    public int getCatsEat(int food){
        for (Cat cat : cats){
            if (!cat.getSatiety() && food - cat.getAppetite() >= 0){
                food = food - cat.getAppetite();
                cat.eat(food);
            }
        }
        return food;
    }

    public Cat getInfoSatiety(){
        for (Cat cat : cats){
            if (cat.getSatiety()){
                System.out.println(cat.getName() + " сыт");
            }
            else{
                System.out.println(cat.getName() + " голоден");
            }
        }
        return null; 
    }
}
