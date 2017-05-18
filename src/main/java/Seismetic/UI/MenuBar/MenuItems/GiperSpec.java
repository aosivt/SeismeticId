package Seismetic.UI.MenuBar.MenuItems;

import com.vaadin.ui.MenuBar;

/**
 * Created by alex on 18.04.17.
 */
public class GiperSpec {
    private MenuBar.MenuItem giperSpecItems;

    public GiperSpec(MenuBar _mainMenu){

        giperSpecItems = _mainMenu.addItem("Гипер спектр",null,null);
        giperSpecItems.addItem("Гипер куб",null,null);

    }
}
