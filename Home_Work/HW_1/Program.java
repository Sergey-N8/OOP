package OOP.Home_Work.HW_1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product product1;

        //product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        //product1.brand = "ООО Лучшая вода";
        //product1.name = "Бутылка с водой";
        //product1.price = -50;
        //product1.name = "A";


        Product PacketOfChips1 = new PacketOfChips("ООО Лейс", 
        "Лейс со вкусом картофеля [1]", 80, 0.150, "Картофель");

        Product PacketOfChips2 = new PacketOfChips("ООО Принглс", 
        "Принглс со вкусом паприки [2]", 150, 0.200,  "Паприка");

        Product PacketOfChips3 = new PacketOfChips("ООО Русский картофель", 
        "Со вкусом укропа [3]", 40, 0.070, "Укроп");

        //Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        //Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);

        //BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);

        //Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);

        //System.out.println(bottleOfWater1.displayInfo());
        //Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);
        //System.out.println(bottleOfMilk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(PacketOfChips1);
        products.add(PacketOfChips2);
        products.add(PacketOfChips3);
        //products.add(bottleOfWater4);
        //products.add(bottleOfWater3);
 
        VendingMachine vendingMachine = new VendingMachine(products);
        PacketOfChips PacketOfChipsResult = vendingMachine.getPacketOfChips(0.150);
        if (PacketOfChipsResult != null){
            System.out.println("Вы купили: ");
            System.out.println(PacketOfChipsResult.displayInfo());
        }
        else {
            System.out.println("Такой позиции нет в автомате.");
        }
        
    }


}
