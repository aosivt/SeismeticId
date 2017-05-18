package Seismetic.UI.WindowApp;

import Seismetic.MyUI;
import com.vaadin.ui.Window;

/**
 * Created by alex on 18.04.17.
 */
public abstract class WindowAppObject extends Window{

    public WindowAppObject(){
        this.setOptions();
    }
    private void setOptions()
    {
        setDraggable(true);
        setResizable(true);
        setClosable(true);
        setWidth(1280.0f, Unit.PIXELS);
        setHeight(640.0f, Unit.PIXELS);

    }
}
