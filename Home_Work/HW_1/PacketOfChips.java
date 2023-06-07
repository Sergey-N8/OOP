package OOP.Home_Work.HW_1;

public class PacketOfChips extends Product{

    private double weight;
    private String taste;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public PacketOfChips(String brand, String name, double price, double weight, 
    String taste) {
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("[Пакет с чипсами]%s - %s - %f - [вес: %f] - %s",
         brand, name, price, weight, taste);
    }
}
