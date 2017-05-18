package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout;

import Seismetic.UI.WindowApp.WindowSeismica.FormLayoutSeismica;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ChartPanelPack.ChartLabel;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

/**
 * Created by alex on 27.04.17.
 */
public class ChartPanel extends Panel {
    private FormLayoutSeismica formLayoutSeismica;
    private HorizontalLayout contentLayout;
    private ChartLabel          chartLabel;
    public ChartPanel(FormLayoutSeismica _formLayoutSeismica){
        setFormLayoutSeismica(_formLayoutSeismica);
        setOptionsChartPanel();

    }

    public FormLayoutSeismica getFormLayoutSeismica() {
        return formLayoutSeismica;
    }

    private void setFormLayoutSeismica(FormLayoutSeismica formLayoutSeismica) {
        this.formLayoutSeismica = formLayoutSeismica;
    }

    public HorizontalLayout getContentLayout() {
        return contentLayout;
    }

    public void setContentLayout() {
        this.contentLayout = new HorizontalLayout();
    }

    public ChartLabel getChartLabel() {
        return chartLabel;
    }

    public void setChartLabel() {
        this.chartLabel = new ChartLabel(getFormLayoutSeismica().toString().split("@")[1]);
    }

    public void setOptionsChartPanel(){

        setCaption("Результирующий график");
        setChartLabel();
        setContentLayout();
        getContentLayout().addComponent(getChartLabel());
        setContent(getContentLayout());
    }
}
