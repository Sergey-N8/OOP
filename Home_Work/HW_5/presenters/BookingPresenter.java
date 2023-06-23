package OOP.Home_Work.HW_5.presenters;

import OOP.Home_Work.HW_5.models.Table;
//import OOP.Sems.s5.models.TableModel;
//import OOP.Sems.s5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;
    public BookingPresenter(Model tableModel, View bookingView){
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId){
        bookingView.printReservationTableResult(reservationId);
    }

    public void printReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.reservationTable(orderDate, tableNo, name);
            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }

    }

    @Override
    public void onDelReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.DelReservationTable(oldReservation, orderDate, tableNo, name);
            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }

    }
}
