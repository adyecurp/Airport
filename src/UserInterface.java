/**
 * Created by Peter Adye Curran on 08/07/2017.
 */
import java.util.*;
public class UserInterface {

    private Scanner reader;
    private FlightService database;

    public UserInterface(Scanner reader,FlightService database){

        this.reader = reader;
        this.database = database;
    }

    public void start(){

        System.out.print("Airport panel\n" +
                "--------------------\n");

        System.out.println();

        while(true){

            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit");
            String command = reader.nextLine();

            if(command.equals("x")){

                System.out.println();
                System.out.println();
                break;

            }else if(command.equals("1")){

                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                Integer cap = Integer.parseInt(reader.nextLine());
                database.addPlane(id,cap);

            }else if(command.equals("2")){

                System.out.print("Give plane: ");
                String plane =reader.nextLine();
                System.out.print("Give departure airport code: ");
                String dep = reader.nextLine();
                System.out.print("Give destination airport: ");
                String des = reader.nextLine();
                database.addFlight(plane,dep,des);

            }

        }

        System.out.println("Flight service\n" +
                "------------\n");
        System.out.println();

        while(true){

            System.out.println("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit");
            String command = reader.nextLine();

            if(command.equals("x")){

                break;
            }
            else if(command.equals("1")){

                database.printPlanes();
                System.out.println();

                }
            else if(command.equals("2")){

                database.printFlights();
                System.out.println();
            }
            else if(command.equals("3")){
                System.out.print("Give plane ID: ");
                String ans = reader.nextLine();
                database.printInfo(ans);
                System.out.println();

            }

            }

        }
    }


