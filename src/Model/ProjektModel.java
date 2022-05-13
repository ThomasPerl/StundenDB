package Model;

import java.util.ArrayList;
import java.util.List;

public class ProjektModel {
    //TODO
    //ID, Name, Stunden
    private Integer id;
    private String Name, Stunden;

    public ProjektModel(Integer id, String Name,String Stunden){
        this.id = id;
        this.Name = Name;
        this.Stunden = Stunden;
    }

    public String getAllInfo(){
        String all = this.getId() + " " + this.getName() + " " + this.getStunden();
        return all;
    }

    public String getName() {
        return Name;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getStunden() {
        return Stunden;
    }
}
