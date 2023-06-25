package OOP.Home_Work.HW_6.srp2;

public class Order {

    private Client Client;
    private Product Product;

    public void setClient(Client Client){
        this.Client = Client;
    }

    public void setProduct(Product Product){
        this.Product = Product;
    }

    public Product getProductFromOrder() {
        return Product;
    }

    public Client getClientFromOrder() {
        return Client;
    }

    public Order(Client Client, Product Product){
        this.Client = Client;
        this.Product = Product;
    }
}
