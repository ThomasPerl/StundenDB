package Model;

import java.util.ArrayList;
import java.util.List;

public class ProjektDB {
    private List<ProjektModel> projects;
    private int id;
    private static ProjektDB instance;

    public ProjektDB() {
        projects = new ArrayList<>();
        id = 0;
        add(new ProjektModel(1, "Klappboxaufrichter", "120"));
        add(new ProjektModel(13, "SSI Schulung", "1232214"));
    }

    public static ProjektDB getInstance(){
        if (ProjektDB.instance == null)
        {
            ProjektDB.instance = new ProjektDB();
        }
        return ProjektDB.instance;
    }

    public List<ProjektModel> getAll(){
        return projects;
    }

    public Object[] getAllProjects(int pos) {
        Object[] projObj = new Object[]{
                projects.get(pos).getId(),
                projects.get(pos).getName(),
                projects.get(pos).getStunden()
        };
        return projObj;
    }

    public Integer getSize(){
        return projects.size();
    }

    private void add(ProjektModel project){
        projects.add(project);
    }


}
