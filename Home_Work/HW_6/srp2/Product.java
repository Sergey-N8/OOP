package OOP.Home_Work.HW_6.srp2;

public abstract class Product {

    private String nameProduct;
    private double price;

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public Product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

}
