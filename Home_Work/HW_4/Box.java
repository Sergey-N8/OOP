package OOP.Home_Work.HW_4;

public class Box {

    private int amountFruits; // колличество  фруктов в коробке
    private double weightBox; // вес коробки с фруктами
    Fruit fruit; //Фрукт(яблоко или апельсин) класса фрукт

    /**
     * Показать вес
     * @param fruit - вес одного фрукта
     */
    // Вес коробки
    public double getWeightBox(){
        this.weightBox = amountFruits * fruit.getWeight();
        return weightBox;
    }

    // узнать какой фрукт в коробке
    public String getBoxFruit(){
        if (fruit.getWeight() == 1){
            return "apple";
        }
        else if (fruit.getWeight() == 1.5) {
            return "orange";
        }
        else{
            return "неизвестный фрукт";
        }
    }

    // узнать класс фрукта в коробке
    public Fruit getFruit(){
        return fruit;
    }

    // конструктор
    public Box(Fruit fruit, int amountFruits) {
        this.fruit = fruit;
        this.amountFruits = amountFruits;
    }

    // Добавление фруктов
    public void putFruits(Fruit fruit, int amountAdd) {
        if (this.fruit.getWeight() == fruit.getWeight()){
            this.amountFruits += amountAdd;
            System.out.printf("\n" + "Добавлено %d фруктов в коробку, теперь в " + 
            "коробке %d " + getBoxFruit() + "\n" + "\n", amountAdd, amountFruits);

        }else{
            System.out.printf("\n" + "Неверный фрукт, в этой коробке может храниться только " + 
            getBoxFruit() + "\n" + "\n");    
        } 
    }

    // Сравнение веса двух коробок
    public boolean compare(Box box2){
        if (getWeightBox() == box2.getWeightBox()){
            return true;
        }
        return false;
    }
    
    // Пересыпание фруктов из одной коробки в другую
    public void peresyp(Box box2){
        if (this.fruit.getWeight() == box2.getFruit().getWeight()){
            box2.putFruits(box2.getFruit(), this.amountFruits);
            this.amountFruits = 0;
            System.out.printf("\n" + "Фрукты пересыпаны " + "\n" + "\n");

        }else{
            System.out.printf("\n" + "Неверный фрукт, в эту коробку можно пересыпать только " + 
            box2.getBoxFruit() + "\n" + "\n");    
        } 
    }

    // Вывод коробки на печать
    public String toString() {
        return String.format("Тип фрута " + getBoxFruit() + ". Колличество фруктов в коробке %d," + 
        " вес коробки: " + getWeightBox(), amountFruits);
    }
}


