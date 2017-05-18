package Seismetic.UI.MenuBar.CommandMainMenu;

import Seismetic.MyUI;

import Seismetic.UI.WindowApp.WindowSeismica.WindowsSeismica;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Window;

/**
 * Created by alex on 18.04.17.
 */
public class MenuBarCommandSeismica implements MenuBar.Command {

    @Override
    public void menuSelected(MenuBar.MenuItem menuItem) {
        WindowsSeismica windowSeismica =  new WindowsSeismica();
        windowSeismica.setDraggable(true);
        MyUI.getCurrent().getUI().getUI().addWindow(windowSeismica);
    }

}
