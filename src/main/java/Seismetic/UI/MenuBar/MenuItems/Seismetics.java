package Seismetic.UI.MenuBar.MenuItems;

import Seismetic.UI.MenuBar.CommandMainMenu.MainMenuCommand;
import Seismetic.UI.MenuBar.CommandMainMenu.MenuBarCommandSeismica;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.MenuBar;

import java.io.Serializable;

/**
 * Created by alex on 18.04.17.
 */
/*Сейсмика*/
public class Seismetics {
    private MenuBar.MenuItem seismeticItems;

    public Seismetics(MenuBar _mainMenu){

        seismeticItems = _mainMenu.addItem("Сейсмика",null,null);
        seismeticItems.addItem("Стандартизация",null,new MenuBarCommandSeismica());

    }

}
