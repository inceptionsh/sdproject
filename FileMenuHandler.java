
package view;

import controller.FileCreation;
import controller.FileDeletion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class FileMenuHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) e.getSource();
        String actionCommand = source.getText();
        
        switch (actionCommand) {
            case "Create File":
               FileCreation.getUserInputAndCreateFile();
                break;
            case "Create Folder":
                FileCreation.createFolder();
                break;
            case "Delete":
                FileDeletion.deleteFile();
                break;
            case "Exit":
                System.exit(0);
                break;
            // Add more cases for additional file actions if needed
        }
    }
}
