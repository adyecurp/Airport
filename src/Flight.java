/**
 * Created by Peter Adye Curran on 08/07/2017.
 */
public class Flight {


    private String dep;
    private String des;

    public Flight(String dep,String des){

        this.des=des;
        this.dep=dep;
    }

    public String toString(){
        return "("+dep+"-"+des+")";
    }
}
