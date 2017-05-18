package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout;

import Seismetic.UI.WindowApp.WindowSeismica.FormLayoutSeismica;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.ComboBoxStationInfo;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.CorrelationForSeismicsEvent;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.PushRequstToService;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.RadiusForSeismicsEvent;
import com.vaadin.ui.*;


/**
 * Created by alex on 27.04.17.
 */
public class ControlPanel extends Panel {
    private FormLayoutSeismica formLayoutSeismica;

    private ComboBoxStationInfo                         stationInfo;
    private RadiusForSeismicsEvent           radiusForSeismicsEvent;
    private PushRequstToService                 pushRequstToService;
    private CorrelationForSeismicsEvent correlationForSeismicsEvent;

    public ControlPanel(FormLayoutSeismica _formLayoutSeismica){

        setFormLayoutSeismica(_formLayoutSeismica);
        setOptionsControlPanel();

    }

    public FormLayoutSeismica getFormLayoutSeismica() {
        return formLayoutSeismica;
    }

    public ComboBoxStationInfo getStationInfo() {
        return stationInfo;
    }

    public RadiusForSeismicsEvent getRadiusForSeismicsEvent() {
        return radiusForSeismicsEvent;
    }

    public PushRequstToService getPushRequstToService() {
        return pushRequstToService;
    }

    private void setFormLayoutSeismica(FormLayoutSeismica formLayoutSeismica) {
        this.formLayoutSeismica = formLayoutSeismica;

    }

    private void setStationInfo() {
        this.stationInfo = new ComboBoxStationInfo();
    }

    private void setRadiusForSeismicsEvent() {
        this.radiusForSeismicsEvent = new RadiusForSeismicsEvent();
    }

    private void setPushRequstToService() {
        this.pushRequstToService =
                new PushRequstToService(this);
    }



    public CorrelationForSeismicsEvent getCorrelationForSeismicsEvent() {
        return correlationForSeismicsEvent;
    }

    public void setCorrelationForSeismicsEvent() {
        this.correlationForSeismicsEvent = new CorrelationForSeismicsEvent();
    }

    public void setOptionsControlPanel(){

        setCaption("Данные для Rest запросы");
        setWidth(100.0f,Unit.PERCENTAGE);
        setPushRequstToService();
        setRadiusForSeismicsEvent();
        setStationInfo();
        setCorrelationForSeismicsEvent();

        GridLayout contentLayout = new GridLayout();
        contentLayout.setRows(2);
        contentLayout.setColumns(3);
        contentLayout.setWidth(100.0f,Unit.PERCENTAGE);


        contentLayout.addComponent
                (getStationInfo(),0,0);
        contentLayout.addComponent
                (getRadiusForSeismicsEvent(),1,0);
        contentLayout.addComponent
                (getCorrelationForSeismicsEvent(),2,0);
        contentLayout.addComponent
                (getPushRequstToService(),0,1,2,1);

//        contentLayout.setRowExpandRatio(0, 1.0f);
//        contentLayout.setRowExpandRatio(1, 5.0f);
//        contentLayout.setColumnExpandRatio(0, 1.0f);
//        contentLayout.setColumnExpandRatio(1, 4.0f);

        for (int col=0; col<contentLayout.getColumns(); col++) {
            for (int row=0; row<contentLayout.getRows(); row++) {
                Component c = contentLayout.getComponent(col, row);
                contentLayout.setComponentAlignment(c, Alignment.TOP_CENTER);

                // Make the labels high to illustrate the empty
                // horizontal space.
//                if (col != 0 || row != 0)
//                    c.setHeight("100%");
            }
        }

        setContent(contentLayout);
    }

}
