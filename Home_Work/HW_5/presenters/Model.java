package OOP.Home_Work.HW_5.presenters;

import OOP.Home_Work.HW_5.models.Table;
//import OOP.Sems.s5.models.TableModel;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int DelReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
