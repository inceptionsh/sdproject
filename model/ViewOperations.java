package model;

import javax.swing.JList;

public class ViewOperations {

    public static void listView() {
        ExplorerPanel.fileList.setLayoutOrientation(JList.VERTICAL);
        ExplorerPanel.fileList.setVisibleRowCount(-1);
    }

    public static void gridView() {
        ExplorerPanel.fileList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        ExplorerPanel.fileList.setVisibleRowCount(-1);
        ExplorerPanel.fileList.repaint();
    }
}
