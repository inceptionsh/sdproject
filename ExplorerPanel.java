package com.mycompany.mainframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class ExplorerPanel extends JPanel {

    private JList<File> fileList;
    private DefaultListModel<File> listModel;
    private JLabel locationLabel;

    private File currentDirectory;

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

    private void updateFileList(File directory) {
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

    private class FileListRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value instanceof File) {
                File file = (File) value;
                setText(file.getName());
            }

            return this;
        }
    }

    private class FileListMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                File selectedFile = fileList.getSelectedValue();
                if (selectedFile != null && selectedFile.isDirectory()) {
                    updateFileList(selectedFile);
                }
            }
        }
    }
}