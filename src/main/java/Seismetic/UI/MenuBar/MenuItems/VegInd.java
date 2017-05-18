package Seismetic.UI.MenuBar.MenuItems;

import com.vaadin.ui.MenuBar;

/**
 * Created by alex on 18.04.17.
 */
/*Вегетационный индекс*/
public class VegInd {
    private MenuBar.MenuItem vegetatetionIndexItems;

    public VegInd(MenuBar _mainMenu){

        vegetatetionIndexItems =
                _mainMenu.addItem("Вег.Индексы",null,null);
        vegetatetionIndexItems
                .addItem("NDVI",null,null);
        vegetatetionIndexItems
                .addItem("TVI",null,null);
        vegetatetionIndexItems
                .addItem("RVI",null,null);


    }
}
