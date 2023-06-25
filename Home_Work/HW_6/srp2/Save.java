package OOP.Home_Work.HW_6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void saveToJson(Order Order) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + Order.getClientFromOrder().getNamePerson() + "\",\n");
            writer.write("\"product\":\"" + Order.getProductFromOrder().getNameProduct() + "\",\n");
            writer.write("\"qnt\":"+ Order.getProductFromOrder().getQnt() +",\n");
            writer.write("\"price\":"+ Order.getProductFromOrder().getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
