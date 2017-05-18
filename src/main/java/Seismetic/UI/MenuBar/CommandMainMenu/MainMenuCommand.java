package Seismetic.UI.MenuBar.CommandMainMenu;

import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Notification;

/**
 * Created by alex on 18.04.17.
 */
public class MainMenuCommand implements MenuBar.Command{


    @Override
    public void menuSelected(MenuBar.MenuItem menuItem) {
        Notification.show(menuItem.getText(),
                Notification.Type.TRAY_NOTIFICATION);
    }
}
