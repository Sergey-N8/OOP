package OOP.Home_Work.HW_6.srp2;

public abstract class Product {

    private String nameProduct;
    private int qnt;
    private double price;

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    public Product(String nameProduct, int qnt, double price) {
        this.nameProduct = nameProduct;
        this.qnt = qnt;
        this.price = price;
    }

}
