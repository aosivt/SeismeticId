package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack;

import Seismetic.GetFromRestStationsInfo;
import Seismetic.ServiceEntitys.ReturnStationsInfo;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Notification;

/**
 * Created by oshchepkovayu on 10.04.17.
 */
public class ComboBoxStationInfo extends ComboBox<ReturnStationsInfo> {

    public ComboBoxStationInfo()
    {
        setOptionsStationInfo();
    }


    private void setOptionsStationInfo(){

        setCaption("Наименование станции");
        setId("stationIdRandomEvent");
        setTabIndex(1);
        setItemCaptionGenerator(
                p -> p.getStationId()
        );
        setWidth(100.0f,Unit.PERCENTAGE);
        setItems(GetFromRestStationsInfo.getReturnStationsInfo().getListReturnStationsInfo());

    }
}
