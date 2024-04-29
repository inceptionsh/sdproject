package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ViewOperations;


public class ViewMenuHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "List":
                ViewOperations.listView();
                break;
            case "Grid":
                ViewOperations.gridView();
                break;
            default:
                System.out.println("Invalid action command: " + actionCommand);
                break;
        }
    }
}
