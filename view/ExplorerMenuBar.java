package view;

import controller.DriveChangeHandler;
import controller.EditMenuHandler;
import controller.FileMenuHandler;
import controller.ModeMenuHandler;
import controller.SortingMenuHandler;
import controller.ViewMenuHandler;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import model.ExplorerPanel;


public class ExplorerMenuBar extends JMenuBar {

    private ExplorerPanel explorerPanel;

    public ExplorerMenuBar(ExplorerPanel explorerPanel) {
        this.explorerPanel = explorerPanel;

        JMenu fileMenu = new JMenu("File");
        JMenu sortMenu = new JMenu("Sort");
        JMenu view = new JMenu("View");
        JMenu edit = new JMenu("Edit");
        
        JMenu mode = new JMenu("Mode");
        JMenu drive = new JMenu("Drive");
        //JMenu sortMenu = new JMenu("Sort");

        JMenuItem createFileItem = new JMenuItem("Create File");
        createFileItem.addActionListener(new FileMenuHandler());
        JMenuItem createFolderItem = new JMenuItem("Create Folder");
        createFolderItem.addActionListener(new FileMenuHandler());
        JMenuItem deleteItem = new JMenuItem("Delete");
        deleteItem.addActionListener(new FileMenuHandler());
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new FileMenuHandler());

// Assuming you have an instance of ExplorerPanel named explorerPanel

         JMenuItem ascendingItem = new JMenuItem("Ascending");
         ascendingItem.addActionListener(new SortingMenuHandler(explorerPanel));

         JMenuItem descendingItem = new JMenuItem("Descending");
         descendingItem.addActionListener(new SortingMenuHandler(explorerPanel));

        
        JMenuItem viewlistItem = new JMenuItem("List");
        viewlistItem.addActionListener(new ViewMenuHandler());
        JMenuItem viewgridItem = new JMenuItem("Grid");
        viewgridItem .addActionListener(new ViewMenuHandler());
        
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem .addActionListener(new EditMenuHandler());
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem .addActionListener(new EditMenuHandler());
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem .addActionListener(new EditMenuHandler());
        
        
        JMenuItem modedayItem = new JMenuItem("Day");
        modedayItem .addActionListener(new ModeMenuHandler());
        JMenuItem modenightItem = new JMenuItem("Night");
        modenightItem .addActionListener(new ModeMenuHandler());
        
        JMenuItem cdriveItem = new JMenuItem("C Drive");
        cdriveItem .addActionListener(new DriveChangeHandler());
        JMenuItem ddriveItem = new JMenuItem("D Drive");
        ddriveItem .addActionListener(new DriveChangeHandler());
        
        

                
        


        fileMenu.add(createFileItem);
        fileMenu.add(createFolderItem);
        fileMenu.add(deleteItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        sortMenu.add(ascendingItem);
        sortMenu.add(descendingItem);
        
        view.add(viewlistItem);
        view.add(viewgridItem);
        
        edit.add(copyItem);
        edit.add(cutItem);
        edit.add(pasteItem);
        
        mode.add(modedayItem);
        mode.add(modenightItem);
        
        drive.add(cdriveItem);
        drive.add(ddriveItem);
        

        add(fileMenu);
        add(sortMenu);
        add(view);
        add(edit);
        add(mode);
        add(drive);
    }
}
