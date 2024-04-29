
package model;

import javax.swing.SwingUtilities;
import javax.swing.*;
import view.ExplorerFrame;


public class FileExplorerApp {

 public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ExplorerFrame();
        });
    }
}
