package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DisplayMode;

public class ModeMenuHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Day":
                DisplayMode.dayMode();
                break;
            case "Night":
                DisplayMode.nightMode();
                break;
            default:
                System.out.println("Invalid action command for day/night mode: " + actionCommand);
                break;
        }
    }
}
