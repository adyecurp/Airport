import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.


        FlightService database = new FlightService();

        Scanner reader = new Scanner(System.in);

        UserInterface ui = new UserInterface(reader,database);
        ui.start();

    }
}
