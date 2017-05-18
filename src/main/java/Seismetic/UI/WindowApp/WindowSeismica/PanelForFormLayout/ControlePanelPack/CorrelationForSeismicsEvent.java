package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack;

import Seismetic.ServiceEntitys.Request.RequetForRandomSelectedObject;
import com.vaadin.data.Binder;
import com.vaadin.data.converter.StringToDoubleConverter;
import com.vaadin.data.converter.StringToIntegerConverter;
import com.vaadin.ui.TextField;

/**
 * Created by oshchepkovayu on 15.05.17.
 */
public class CorrelationForSeismicsEvent extends TextField {

    public CorrelationForSeismicsEvent(){
        setOptionsCorrelationForSeismicsEvent();
    }

    private void updateCaption() {

        new Binder<>().forField(this)

                .withConverter(new StringToDoubleConverter
                        ("Введите целочисленное значение для определения радиуса"));
    }
    private void setOptionsCorrelationForSeismicsEvent(){
        setCaption("Корреляция");
        setPlaceholder("Задать корреляцию");
        setId("correlation");
        setTabIndex(3);
        setMaxLength(3);
        setWidth(100.0f,Unit.PERCENTAGE);
        addValueChangeListener(event -> updateCaption());
    }
}
