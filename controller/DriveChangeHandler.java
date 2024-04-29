package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DriveChanger;

public class DriveChangeHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "C Drive":
                DriveChanger.changeDrive("C");
                break;
            case "D Drive":
                DriveChanger.changeDrive("D");
                break;
            default:
                System.out.println("Invalid action command for drive change: " + actionCommand);
                break;
        }
    }
}
