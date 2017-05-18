package Seismetic;

import javax.servlet.annotation.WebServlet;

import Seismetic.UI.MenuBar.MainMenuBar;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ChartPanelPack.ChartLabel;
import Seismetic.testChart.testObjectForChart;
import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")

@JavaScript({
        "vaadin://jquery-3.1.1.js",
        "vaadin://plotly-latest.min.js",
        "vaadin://renderChart.js",
        "vaadin://connect-plotly.js"
})
public class MyUI extends UI {


    @Override
    protected void init(VaadinRequest vaadinRequest) {

        testObjectForChart testObjectForChart = new testObjectForChart();
        String temp  = testObjectForChart.getObjectToJson();
        System.err.println(temp);
        testObjectForChart = null;
        testObjectForChart = new testObjectForChart(temp);


        GetFromRestStationsInfo getFromRestStationsInfo = new GetFromRestStationsInfo();


//        GetFromRestRandomEvent randomEventtemp = new GetFromRestRandomEvent("KEM");


//        GetFromRestEventTemplates getFromRestEventTemplates = new GetFromRestEventTemplates();

//        getFromRestEventTemplates.getReturnResult().getE();

//        ComboBox comboBoxStationInfo = new ComboBoxStationInfo(getFromRestStationsInfo);

//        DateField dateField = new DateField();

//        GetFromRestRandomEvent randomEvent = new GetFromRestRandomEvent("KEM");

        final VerticalLayout layout = new VerticalLayout();
        
//        final TextField name = new TextField();
//        name.setCaption("Type your name here:");

//        Label chartResult = new ChartLabel();
//        layout.addComponent(chartResult);


        layout.addComponent(new MainMenuBar());

//        layout.addComponent(comboBoxStationInfo);
//        layout.addComponent(dateField);
//        layout.addComponents(name, button);





        setContent(layout);

//        Integer[] stockArr = new Integer[getFromRestEventTemplates.getReturnResult().getReseachDiElements().get(1).getResultDiElement().size()];
//        stockArr = getFromRestEventTemplates.getReturnResult().getReseachDiElements().get(1).getResultDiElement().toArray(stockArr);


//        com.vaadin.ui.JavaScript.getCurrent().execute("test_con();");



    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
//    @WebServlet(urlPatterns = "/temp", name = "MyUIServlet", asyncSupported = true)
//    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
//    public static class MyUIServlet2 extends VaadinServlet {

//    }
}
