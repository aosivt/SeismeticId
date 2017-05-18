package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.GridPanelPack;

import Seismetic.EntityService.PackStationInfo.RandomEvent.GetFromRestRandomEvent;
import Seismetic.EntityService.PackStationInfo.RandomSelectedObject;
import Seismetic.EntityService.PackStationInfo.ReseachPack.ReseachStandardization;
import Seismetic.EntityService.PackStationInfo.SelectedEvent.SelectedEventObject;
import Seismetic.UI.WindowApp.WindowSeismica.FormLayoutSeismica;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlPanel;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.GridPanel;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.ui.Grid;

/**
 * Created by alex on 19.04.17.
 */
public class RandomSelectedEventTable extends Grid<SelectedEventObject>{
    private RandomSelectedObject returnResult;

    public RandomSelectedEventTable(GetFromRestRandomEvent _randomSelectedEvents,
                                    GridPanel _gridPanel){

        setReturnResult(
                _randomSelectedEvents.getRandomSelectedObject()
        );
        setOptions();
        _gridPanel.setOptionsGridPanel(this);
    }

    public RandomSelectedObject getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(RandomSelectedObject returnResult) {
        this.returnResult = returnResult;
    }

    private void setOptions(){
        removeAllColumns();

        addColumn(SelectedEventObject::getMagnitude).setCaption("Магнитуда");
        addColumn(SelectedEventObject::getType).setCaption("Тип события");
        addColumn(SelectedEventObject::getEventLocation).setCaption("Место события");
        addColumn(SelectedEventObject::getDate).setCaption("Дата события");
        addColumn(SelectedEventObject::getCorelation).setCaption("Корреляция");


//        addColumn(SelectedEventObject::getClassName).setCaption("Класс");
//        setWidthUndefined();
        setSizeFull();
        setItems(getReturnResult().getSelectedEventObjects());



    }
}
