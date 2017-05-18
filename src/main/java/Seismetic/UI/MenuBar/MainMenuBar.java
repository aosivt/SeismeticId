package Seismetic.UI.MenuBar;

import Seismetic.UI.MenuBar.MenuItems.GiperSpec;
import Seismetic.UI.MenuBar.MenuItems.Seismetics;
import Seismetic.UI.MenuBar.MenuItems.VegInd;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.MenuBar;

/**
 * Created by alex on 18.04.17.
 */
public class MainMenuBar extends MenuBar{

    public MainMenuBar(){
        this.setWidth(100.0f, Sizeable.Unit.PERCENTAGE);

        Seismetics  seismetics   = new Seismetics    (this);
        GiperSpec   giperSpec    = new GiperSpec     (this);
        VegInd      vegInd       = new VegInd        (this);
    }

}
