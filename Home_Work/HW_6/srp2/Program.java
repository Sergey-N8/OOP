package OOP.Home_Work.HW_6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  
     * рамках принципа SRP.
     * @param args
    */
    public static void main(String[] args) {
        
/*
        public void inputFromConsole(){
        clientName = prompt("Имя клиента: ");
        product = prompt("Продукт: ");
        qnt = Integer.parseInt(prompt("Кол-во: "));
        price = Integer.parseInt(prompt("Цена: "));
    }
*/

        Client client1 = new Client("Виктор");
        Product Botel1 = new BotelOSodsa("Pepsi", 88.50, 1.00, "Кола с сахаром");
        Order order = new Order(client1, Botel1, 15);
        //order.inputFromConsole();
        saveToJson(order);
    }


    public void saveToJson(Order order) {
        String fileName = "11111111";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientFromOrder().getNamePerson() + "\",\n");
            writer.write("\"product\":\"" + order.getProductFromOrder().getNameProduct() + "\",\n");
            writer.write("\"qnt\":"+ order.getProductFromOrder().getQnt() +",\n");
            writer.write("\"price\":"+ order.getProductFromOrder().getPrice() +"\n");
            writer.write("\"weight\":"+ order.getProductFromOrder().getWeight() +"\n");
            writer.write("\"taste\":"+ order.getProductFromOrder().getTaste() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
