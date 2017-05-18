package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout;

import Seismetic.UI.WindowApp.WindowSeismica.FormLayoutSeismica;
import Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.GridPanelPack.RandomSelectedEventTable;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.ProgressBar;

/**
 * Created by alex on 27.04.17.
 */
public class GridPanel extends Panel {

    private HorizontalLayout contentLayout;
    public GridPanel(){

        setOptionsGridPanel();

    }

    public HorizontalLayout getContentLayout() {
        return contentLayout;
    }

    private void setContentLayout() {
        this.contentLayout = new HorizontalLayout();
    }

    private void setOptionsGridPanel(){

        setCaption("Результат");
        setContentLayout();
        getContentLayout().setSizeFull();
        setContent(getContentLayout());
    }
    public void setOptionsGridPanel(RandomSelectedEventTable selectedEventTable){
        setOptionsGridPanel();
        getContentLayout().removeAllComponents();
        getContentLayout().addComponent(selectedEventTable);

        setContent(getContentLayout());
        ((FormLayoutSeismica) getParent()).setUpdategridPanel(true);

    }
    public void setOptionsGridPanel(ProgressBar _progresBarr){
        getContentLayout().removeAllComponents();
        getContentLayout().addComponent(_progresBarr);

        setContent(getContentLayout());
        setVisible(true);
    }
}
