package OOP.Home_Work.HW_6.srp2;
import java.util.Scanner;

public class Prompt{

    private Scanner scanner = new Scanner(System.in);
    
    private String Prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
