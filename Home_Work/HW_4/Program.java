package OOP.Home_Work.HW_4;

import java.util.ArrayList;
import java.util.List;

/*
    Домашняя работа, задача:
    ========================

    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
    по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

    c. Для хранения фруктов внутри коробки можно использовать ArrayList;

    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес 
    одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы 
    измерения не важны);

    e. Внутри класса Box сделать метод compare(), который позволяет сравнить 
    текущую коробку с той, которую подадут в compare() в качестве параметра. 
    true – если их массы равны, false в противоположном случае. Можно сравнивать 
    коробки с яблоками и апельсинами;

    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки 
    в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку 
    с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в 
    другую перекидываются объекты, которые были в первой;

    g. Не забываем про метод добавления фрукта в коробку. 
*/

public class Program {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box box1 = new Box(apple, 20);
        Box box2 = new Box(orange, 55);
        Box box3 = new Box(apple, 60);

        List<Box> boxs = new ArrayList<>();
        boxs.add(box1);
        boxs.add(box2);
        boxs.add(box3);


        for (Box box : boxs) {
            System.out.println(box.toString());
        }
        
        box1.putFruits(apple, 22);

        for (Box box : boxs) {
            System.out.println(box.toString());
        }

        box1.putFruits(orange, 1000);

        box2.peresyp(box3);

        System.out.println(box1.compare(box2));

        box1.peresyp(box2);

        System.out.println();

        for (Box box : boxs) {
            System.out.println(box.toString());
        }

        // System.out.println(box2.toString());
    }
}
