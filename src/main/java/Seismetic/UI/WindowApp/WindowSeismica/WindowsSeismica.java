package Seismetic.UI.WindowApp.WindowSeismica;

import Seismetic.UI.WindowApp.WindowAppObject;
import com.vaadin.ui.UI;

/**
 * Created by alex on 18.04.17.
 */
public class WindowsSeismica extends WindowAppObject {

    private FormLayoutSeismica layoutSeismica;


    public WindowsSeismica(){

        setCaption("Сейсмика - стандартизация");
        layoutSeismica = new FormLayoutSeismica(this);
        setContent(layoutSeismica);

    }


    public FormLayoutSeismica getLayoutSeismica() {
        return layoutSeismica;
    }

    private void setLayoutSeismica(FormLayoutSeismica layoutSeismica) {
        this.layoutSeismica = layoutSeismica;
    }


}
