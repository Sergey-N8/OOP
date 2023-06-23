package OOP.Home_Work.HW_5.models;

import OOP.Home_Work.HW_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;
    private int oldReservation;

    /**
     * Получить все столики
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }


        //удаление из списка резерва

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     */

    @Override
    public int DelReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        this.oldReservation = oldReservation;
        return oldReservation;
    }
    
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        //this.oldReservation = oldReservation;
        for (Table table: tables) {
            for (Reservation res: table.getReservations())
                if (res.getId() == oldReservation && name.equals("0")){
                    table.getReservations().remove(res);
                    return -1;
                }
                else if (res.getId() == oldReservation){
                    table.getReservations().remove(res);
                    reservationTable(reservationDate, tableNo, name);
                    return res.getId();
                }

        }
        throw new RuntimeException("Некорректный номер столика.");
    }
    //...
     //TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable

    

}
