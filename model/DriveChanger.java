package model;

import java.io.File;

public class DriveChanger {

    public static void changeDrive(String drive) {
        File directory = null;
        switch (drive.toLowerCase()) {
            case "d":
                directory = new File("D:\\");
                break;
            case "c":
                directory = new File("C:\\");
                break;
            // Add cases for other drives if needed
            default:
                break;
        }
        if (directory != null) {
            ExplorerPanel.updateFileList(directory);
        }
    }
}
