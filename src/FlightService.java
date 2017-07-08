import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Peter Adye Curran on 08/07/2017.
 */
public class FlightService {

    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;
    private HashMap<Airplane,ArrayList<Flight>> flightservice;

    public FlightService(){
        this.flightservice = new HashMap<Airplane,ArrayList<Flight>>();
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addPlane(String id,Integer cap){
        ArrayList<Flight> init = new ArrayList<Flight>();
        Airplane plane = new Airplane(id, cap);
        airplanes.add(plane);
        flightservice.put(plane,init);
    }

    public void addFlight(String id,String dep,String des){
        Airplane plane = new Airplane("",0);
        for(Airplane a:airplanes){
            if(a.getPlane().equals(id)){
                plane=a;
            }
        }
        Flight flight = new Flight(dep,des);
        flightservice.get(plane).add(flight);

        }


    public void printPlanes(){
        for(Airplane a:airplanes){
            System.out.println(a);
        }
    }

    public void printFlights(){
        for(Airplane air:flightservice.keySet()){
            ArrayList<Flight> flight = flightservice.get(air);
            for(int i=0;i<flight.size();i++){
                System.out.println(air+" "+flight.get(i));
            }
        }
    }

    public void printInfo(String ans) {

        for(Airplane p:airplanes){
            if(ans.equals(p.getPlane())){
                System.out.println(p);
                break;
            }
        }
    }


    }



