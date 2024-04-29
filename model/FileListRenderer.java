package model;

import java.awt.Component;
import java.io.File;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.filechooser.FileSystemView;

public class FileListRenderer extends DefaultListCellRenderer {
    private FileSystemView fileSystemView;

    public FileListRenderer() {
        fileSystemView = FileSystemView.getFileSystemView();
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (value instanceof File) {
            File file = (File) value;
            setText(fileSystemView.getSystemDisplayName(file));
            setIcon(fileSystemView.getSystemIcon(file));
        }
        return this;
    }
}
