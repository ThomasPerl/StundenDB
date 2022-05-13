package Controller;

import Model.UserDB;
import Model.UserModel;
import View.AllProjectView;
import View.LoginView;
import View.OverviewView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectController  implements ActionListener {
    private JButton projektHinzufügenButton;
    private JButton tätigkeitSchreibenButton;
    private JButton alleProjekteAnzeigenButton;
    private OverviewView view;

    public ProjectController(OverviewView view, JButton projektHinzufügenButton, JButton tätigkeitSchreibenButton, JButton alleProjekteAnzeigenButton){
        this.view = view;
        this.projektHinzufügenButton = projektHinzufügenButton;
        this.tätigkeitSchreibenButton = tätigkeitSchreibenButton;
        this.alleProjekteAnzeigenButton = alleProjekteAnzeigenButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == projektHinzufügenButton) {
            //TODO

        }
        if(e.getSource() == tätigkeitSchreibenButton) {
            //TODO

        }
        if(e.getSource() == alleProjekteAnzeigenButton) {
            //TODO
            new AllProjectView();
            view.dispose();

        }



    }
}
