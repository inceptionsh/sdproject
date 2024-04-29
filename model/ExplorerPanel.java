package model;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ExplorerPanel extends JPanel {

    public static JList<File> fileList;
    private static DefaultListModel<File> listModel;
    public static JLabel locationLabel;
    public static File currentDirectory;

    public ExplorerPanel() {
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        fileList.setCellRenderer(new FileListRenderer());
        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(fileList);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        add(createNorthPanel(), BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        fileList.addMouseListener(new FileListMouseListener());

        currentDirectory = new File(System.getProperty("user.home"));

        updateFileList(currentDirectory);
    }

    private JPanel createNorthPanel() {
        JPanel northPanel = new JPanel(new BorderLayout());

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> navigateBack());

        locationLabel = new JLabel();
        northPanel.add(backButton, BorderLayout.WEST);
        northPanel.add(locationLabel, BorderLayout.CENTER);

        return northPanel;
    }

    private void navigateBack() {
        if (currentDirectory != null) {
            File parentDirectory = currentDirectory.getParentFile();
            if (parentDirectory != null) {
                currentDirectory = parentDirectory;
                updateFileList(currentDirectory);
            }
        }
    }

    public static void updateFileList(File directory) {
        listModel.clear();

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                listModel.addElement(file);
            }
        }

        locationLabel.setText("Current Location: " + directory.getAbsolutePath());
        currentDirectory = directory;
    }

    public static File getCurrentDirectory() {
        return currentDirectory;
    }
    public void refreshFileList() {
        updateFileList(currentDirectory);
    }

    Object getFileList() {
       return fileList;
    }
    
   // private JLabel locationLabel;

    // Other class members and methods...

//    public JList<File> getFileList() {
//        return fileList;
//    }

    public JLabel getLocationLabel() {
        return locationLabel;
    }
   



private class FileListMouseListener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            File selectedFile = fileList.getSelectedValue();
            if (selectedFile != null) {
                if (selectedFile.isDirectory()) {
                    updateFileList(selectedFile);
                } else {
                    // Open the file
                    openFile(selectedFile);
                }
            }
        }
    }

    private void openFile(File file) {
        // Implement file opening logic here
        // For example, you can open it with the default system application:
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            ex.printStackTrace();
            // Handle file opening error
        }
    }
}


}
