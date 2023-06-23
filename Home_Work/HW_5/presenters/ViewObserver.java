package OOP.Home_Work.HW_5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onDelReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
