package Seismetic.UI.WindowApp.WindowSeismica;

import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlPanel;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.PushRequstToService;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ChartPanelPack.ChartLabel;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.ComboBoxStationInfo;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.GridPanel;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.GridPanelPack.RandomSelectedEventTable;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack.RadiusForSeismicsEvent;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ChartPanel;
import com.google.gson.Gson;
import com.vaadin.ui.*;

import java.util.Arrays;

/**
 * Created by alex on 18.04.17.
 */
public class FormLayoutSeismica extends GridLayout {

    private ControlPanel                     controlPanel;
    private GridPanel                           gridPanel;
    private ChartPanel                         chartPanel;

    private WindowsSeismica                   winSeismica;

    private boolean               updategridPanel = false;

    private static boolean            renderChart = false;

    public FormLayoutSeismica(WindowsSeismica _winSeismica){

    setWinSeismica(_winSeismica);
    setOptionsLayout();

    }


    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    private void setControlPanel() {
        this.controlPanel = new ControlPanel(this);

    }

    public GridPanel getGridPanel() {
        return gridPanel;
    }

    public void setGridPanel() {
        this.gridPanel = new GridPanel();
    }

    public ChartPanel getChartPanel() {
        return chartPanel;
    }

    public void setChartPanel() {
        this.chartPanel = new ChartPanel(this);
    }

    public boolean isUpdategridPanel() {
        return updategridPanel;
    }

    public void setUpdategridPanel(boolean updategridPanel) {
        this.updategridPanel = updategridPanel;
    }



    public void renderinChart(){
if (!renderChart) {
    renderChart = true;
    int countI = getControlPanel().getPushRequstToService().
            getRandomEventtemp().getRandomSelectedObject().
            getSelectedEventObjects().size();
    int sizeTempArray = getControlPanel().getPushRequstToService().
            getRandomEventtemp().getRandomSelectedObject().
            getSelectedEventObjects().get(0).getStandardizedCombination()
            .size();
    Double[][] stockArr = new Double[countI][sizeTempArray];
    Double[] stockArrTemp;

    for (int i = 0; i < countI; i++) {
        if (getControlPanel().getPushRequstToService().
                getRandomEventtemp().getRandomSelectedObject().
                getSelectedEventObjects().get(i).getCorelation() >=
                Double.parseDouble(getControlPanel().getCorrelationForSeismicsEvent().getValue())) {
            stockArrTemp = new Double[sizeTempArray];
            stockArrTemp = getControlPanel().getPushRequstToService().
                    getRandomEventtemp().getRandomSelectedObject().
                    getSelectedEventObjects().get(i).getStandardizedCombination()
                    .toArray(stockArrTemp);
            stockArr[i] = stockArrTemp;
        }
    }
    Gson gson = new Gson();

    com.vaadin.ui.JavaScript.getCurrent().execute("renderChart("
            + "'" +
            gson.toJson(stockArr)
            + "','" +
            getChartPanel().getChartLabel().getId()
            + "','" +
            "resolution"
            + "'" +
            ");");
}
    }

    public WindowsSeismica getWinSeismica() {
        return winSeismica;
    }

    private void setWinSeismica(WindowsSeismica winSeismica) {
        this.winSeismica = winSeismica;
    }

    public static boolean isRenderChart() {
        return renderChart;
    }

    public static void setRenderChart(boolean renderChart) {
        FormLayoutSeismica.renderChart = renderChart;
    }

    private void setOptionsLayout(){

        addStyleName("outlined");

        setSizeFull();
        setRows(2);
        setColumns(2);
        setGridPanel();
        setControlPanel();
        setChartPanel();
        addComponent(getControlPanel(), 0,0);
        addComponent(getGridPanel(),    0,1);
        addComponent(getChartPanel(),   1,0,1,1);

        for (int col=0; col<getColumns(); col++) {
            for (int row=0; row<getRows(); row++) {
                Component c = getComponent(col, row);
                setComponentAlignment(c, Alignment.TOP_CENTER);

            }
        }

    }
}
