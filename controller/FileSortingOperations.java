package controller;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import model.ExplorerPanel;

public class FileSortingOperations {

    public static void sortFilesAscending(ExplorerPanel explorerPanel) {
        File[] files = explorerPanel.getCurrentDirectory().listFiles();
        int filesCount = (files != null) ? files.length : 0;
        switch (filesCount) {
            case 0:
            case 1:
                // No need to sort if there are 0 or 1 file
                break;
            default:
                Arrays.sort(files, Comparator.comparing(File::getName));
                explorerPanel.refreshFileList();
                break;
        }
    }

    public static void sortFilesDescending(ExplorerPanel explorerPanel) {
        File[] files = explorerPanel.getCurrentDirectory().listFiles();
        int filesCount = (files != null) ? files.length : 0;
        switch (filesCount) {
            case 0:
            case 1:
                // No need to sort if there are 0 or 1 file
                break;
            default:
                Arrays.sort(files, Comparator.comparing(File::getName).reversed());
                explorerPanel.refreshFileList();
                break;
        }
    }
}
