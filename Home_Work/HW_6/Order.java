package OOP.Home_Work.HW_6.srp2;

import java.io.FileWriter;
import java.io.IOException;
//import OOP.Home_Work.HW_6.srp2.BotelOSodsa;

public class Order {

    Client Client;
    Product Product;
    private int qnt;
    


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
    
    public int getQnt() {
        return qnt;
    }

    public Order(Client Client, Product Product, int qnt){
        this.Client = Client;
        this.Product = Product;
        this.qnt = qnt;
    }

    public void saveToJson() {
        String fileName = "11111111";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + getClientFromOrder().getNamePerson() + "\",\n");
            writer.write("\"product\":\"" + getProductFromOrder().getNameProduct() + "\",\n");
            writer.write("\"qnt\":"+ getQnt() +",\n");
            writer.write("\"price\":"+ getProductFromOrder().getPrice() +"\n");
            writer.write("\"weight\":"+ "\n");
            writer.write("\"taste\":"+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
