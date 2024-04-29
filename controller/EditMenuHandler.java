package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditMenuHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Copy":
                FileManipulation.copyFile();
                break;
            case "Cut":
                FileManipulation.cutFile();
                break;
            case "Paste":
                FileManipulation.pasteFile();
                break;
            default:
                System.out.println("Invalid action command: " + actionCommand);
                break;
        }
    }
}
