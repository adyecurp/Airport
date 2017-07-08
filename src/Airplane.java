/**
 * Created by Peter Adye Curran on 08/07/2017.
 */
public class Airplane {

    private String id;
    private Integer cap;

    public Airplane(String id,Integer cap){
        this.id = id;
        this.cap = cap;
    }

    public String toString(){
        return id+" ("+cap+" ppl)";
    }

    public String getPlane(){
        return this.id;
    }
}
