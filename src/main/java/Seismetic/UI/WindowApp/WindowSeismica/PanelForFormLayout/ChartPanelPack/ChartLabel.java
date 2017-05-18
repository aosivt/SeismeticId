package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ChartPanelPack;

import com.vaadin.ui.Label;

import java.util.Arrays;

/**
 * Created by alex on 17.04.17.
 */
public class ChartLabel extends Label {

   public ChartLabel(){
        setSizeUndefined(); // labels are 100% wide by default

        setId("chart");
//        setCaption("chart");
    }
    public ChartLabel(String _idChartLable){
        setSizeUndefined(); // labels are 100% wide by default

        setId(_idChartLable);
//        setCaption("chart");
    }

}
