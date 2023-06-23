package OOP.Home_Work.HW_5;

import OOP.Home_Work.HW_5.models.TableModel;
import OOP.Home_Work.HW_5.presenters.BookingPresenter;
import OOP.Home_Work.HW_5.presenters.Model;
import OOP.Home_Work.HW_5.presenters.View;
import OOP.Home_Work.HW_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        //bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 102, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 102, "0");

        bookingView.reservationTable(new Date(), 102, "Станислав");
    }

}
