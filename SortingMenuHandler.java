package view;

import controller.FileSortingOperations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import model.ExplorerPanel;

public class SortingMenuHandler implements ActionListener {
    private ExplorerPanel explorerPanel;

    // Constructor to receive the ExplorerPanel instance
    public SortingMenuHandler(ExplorerPanel explorerPanel) {
        this.explorerPanel = explorerPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) e.getSource();
        String actionCommand = source.getText();
        
        switch (actionCommand) {
            case "Ascending":
                FileSortingOperations.sortFilesAscending(explorerPanel);
                break;
            case "Descending":
                FileSortingOperations.sortFilesDescending(explorerPanel);
                break;
            // Add more cases for additional sorting options if needed
        }
    }
}
