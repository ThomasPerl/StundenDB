package View;

import Model.ProjektDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AllProjectView extends JFrame{
    private JPanel panel1;
    private JTable table1;
    private JList list1;
    private DefaultTableModel model;
    public static final String[] columns = {
            "Id", "Name", "Stunden"
    };

    public AllProjectView(){
        super("Alle Projekte");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);




    }

    private void createUIComponents() {
        model = new DefaultTableModel(columns, 0);
        table1 = new JTable(model);
        int size = ProjektDB.getInstance().getSize();

        for(int i = 0; i < size; i++){
            model.addRow(ProjektDB.getInstance().getAllProjects(i));
        }
    }
}
