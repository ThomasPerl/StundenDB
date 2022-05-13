package View;

import Controller.ProjectController;

import javax.swing.*;

import static com.sun.glass.ui.Cursor.setVisible;

public class OverviewView extends JFrame{
    private JPanel overview;
    private JButton projektHinzufügenButton;
    private JButton tätigkeitSchreibenButton;
    private JButton alleProjekteAnzeigenButton;

    public OverviewView() {
        super("Projektübersicht");
        setContentPane(overview);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        ProjectController controller =  new ProjectController(this, projektHinzufügenButton, tätigkeitSchreibenButton, alleProjekteAnzeigenButton);

        projektHinzufügenButton.addActionListener(controller);
        tätigkeitSchreibenButton.addActionListener(controller);
        alleProjekteAnzeigenButton.addActionListener(controller);
    }
}
