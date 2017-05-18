package Seismetic.UI.WindowApp.WindowSeismica.PanelForFormLayout.ControlePanelPack;

import Seismetic.ServiceEntitys.Request.RequetForRandomSelectedObject;
import com.vaadin.data.Binder;
import com.vaadin.data.converter.StringToIntegerConverter;
import com.vaadin.ui.TextField;

/**
 * Created by alex on 18.04.17.
 */
public class RadiusForSeismicsEvent extends TextField {
    public RadiusForSeismicsEvent(){
        setOptionsRadiusForSeismicsEvent();

    }
    private void updateCaption() {


        new Binder<RequetForRandomSelectedObject>().forField(this)

                .withConverter(new StringToIntegerConverter
                        ("Введите целочисленное значение для определения радиуса"))


                .bind(RequetForRandomSelectedObject::getRadius,
                      RequetForRandomSelectedObject::setRadius);
    }

    private void setOptionsRadiusForSeismicsEvent(){
        setCaption("Радиус");
        setPlaceholder("Внесите радиус поиска событий");
        setId("radiusRandomEvent");
        setTabIndex(2);
        setMaxLength(2);
        setWidth(100.0f,Unit.PERCENTAGE);
        addValueChangeListener(event -> updateCaption());
    }
}
