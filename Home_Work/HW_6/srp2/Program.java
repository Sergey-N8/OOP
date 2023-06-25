package OOP.Home_Work.HW_6.srp2;

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
        BotelOSodsa Botel1 = new BotelOSodsa("Pepsi", 20, 88.50, 1.00, "Кола с сахаром");
        Order order = new Order(client1, Botel1);
        //order.inputFromConsole();
        //order.saveToJson();
    }
}
