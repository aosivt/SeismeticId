package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack;

import Seismetic.EntityService.PackStationInfo.RandomEvent.GetFromRestRandomEvent;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlPanel;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.GridPanelPack.RandomSelectedEventTable;
import Seismetic.UI.WindowApp.WindowSeismica.FormLayoutSeismica;
import com.vaadin.ui.*;

import java.util.Timer;
import java.util.concurrent.CompletableFuture;

/**
 * Created by alex on 18.04.17.
 */
public class PushRequstToService extends Button {

    private GetFromRestRandomEvent randomEventtemp;

    private ProgressBar progressBarRest;

    private ControlPanel controlPanel;

//    private final Timer t = new Timer();

    public PushRequstToService(ControlPanel _controlPanel){

        setControlPanel(_controlPanel);
        setOptions();

    }
    private boolean getFormData(){

        setRandomEventtemp(new GetFromRestRandomEvent(
                getControlPanel().getStationInfo().getValue().getStationId(),
                getControlPanel().getRadiusForSeismicsEvent().getValue()
        ));


        return true;
    }

    private void renderedTableSelectedEvent(){

        RandomSelectedEventTable randomSelectedEventTable =
                new RandomSelectedEventTable
                        (getRandomEventtemp(),
                                getControlPanel().getFormLayoutSeismica().getGridPanel());
    }



    public GetFromRestRandomEvent getRandomEventtemp() {
        return randomEventtemp;
    }

    private void setRandomEventtemp(GetFromRestRandomEvent randomEventtemp) {
        this.randomEventtemp = randomEventtemp;
    }

    private ProgressBar getProgressBarRest() {
        return progressBarRest;
    }

    private void setProgressBarRest() {
        this.progressBarRest = new ProgressBar();
    }

    private void launchProgressUpdater(UI ui, int maxProgress) {
        new Thread(() -> {

                for (int progress = 1; progress <= maxProgress; progress++) {
//            while (!getControlPanel().getFormLayoutSeismica().isUpdategridPanel()){
                    try {
                        Thread.sleep(1000);
                    } catch (final InterruptedException e) {
                        throw new RuntimeException("Unexpected interruption", e);
                    }

                    if (getControlPanel().getFormLayoutSeismica().isUpdategridPanel())
                    {

                        updateProgressBar(ui);

                        getControlPanel().getFormLayoutSeismica().setUpdategridPanel(false);
                        progress = 1;
                        try {
                            Thread.sleep(18000);
                        } catch (final InterruptedException e) {
                            throw new RuntimeException("Unexpected interruption", e);
                        }


                        click();


                    }
                }

//            else {updateProgressBar(ui);}
        }).start();
    }

    private void updateProgressBar(UI ui) {
        ui.access(() -> {

            if (getControlPanel().getFormLayoutSeismica().isUpdategridPanel()) {

                getProgressBarRest().setVisible(false);
                getControlPanel().getFormLayoutSeismica().renderinChart();
                getControlPanel().getFormLayoutSeismica().getGridPanel().setCaption("Обработанный результат");
//                ui.setPollInterval(-1);
            }
            else {

                String temp = "..." + getControlPanel().getFormLayoutSeismica().getGridPanel().getCaption();
                if (temp.length()>200)
                {
                    temp = "...";
                }
                getControlPanel().getFormLayoutSeismica().getGridPanel().setCaption(temp);
            }
            getControlPanel().focus();
        });
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    private void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    private void setOptions(){
        UI.getCurrent().setPollInterval(2000);
        setCaption("Отправить запрос");

        setWidth(100.0f,Unit.PERCENTAGE);
        setProgressBarRest();

        addClickListener(clickEvent ->
                {
                    getControlPanel().getFormLayoutSeismica().getGridPanel().setCaption("...");
                    getControlPanel().getFormLayoutSeismica().setRenderChart(false);
                    getControlPanel().getFormLayoutSeismica().setUpdategridPanel(false);
                    getProgressBarRest().setIndeterminate(true);
                    getProgressBarRest().setVisible(true);
                    getProgressBarRest().setWidth(500.0F,Unit.PIXELS);
                    getProgressBarRest().setHeight(500.0F,Unit.PIXELS);

//                    getControlPanel().getFormLayoutSeismica().
//                            getGridPanel().setOptionsGridPanel(getProgressBarRest());


                    CompletableFuture
                            .supplyAsync(this::getFormData)
                            .thenRun(this::renderedTableSelectedEvent);


                    launchProgressUpdater(UI.getCurrent(), 100);
//                    t.schedule(new TimerTask() {
//                        @Override
//                        public void run() {
//                            formLayoutSeismica.getGridPanel().setCaption("Обработка запроса");
//                            System.out.println(new Date());
//                            formLayoutSeismica.getGridPanel();
//                        }
//                    },0,10000);

                }
//                                .thenApply(this::renderedTableSelectedEvent)
        );
    }
}

