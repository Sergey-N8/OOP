package OOP.Home_Work.HW_6.srp2;

public class BotelOSodsa extends Product {

    private double weight;
    private String taste;

    public double getWeight() {
        return weight;
    }

    public String getTaste() {
        return taste;
    }

    public BotelOSodsa(String nameProduct, double price, double weight, String taste) {
        super(nameProduct, price);
        this.weight = weight;
        this.taste = taste;
    }
/*
    public void inputFromConsole(){
        nameProduct = prompt("Нименование продукта: ");
        qnt = Integer.parseInt(prompt("Кол-во: "));
        price = Integer.parseInt(prompt("Цена: "));

    }

    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [объем: %f]", brand, name, price, volume);
    }

    */
}
