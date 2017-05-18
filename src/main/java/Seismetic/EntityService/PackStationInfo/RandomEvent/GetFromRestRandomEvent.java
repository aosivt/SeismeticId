package Seismetic.EntityService.PackStationInfo.RandomEvent;

import Seismetic.EntityService.PackStationInfo.ListReturnStationInfo;
import Seismetic.EntityService.PackStationInfo.RandomSelectedObject;
import Seismetic.EntityService.PackStationInfo.ReseachPack.ReseachStandardization;
import Seismetic.EntityService.PackStationInfo.SelectedEvent.SelectedEventObject;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by oshchepkovayu on 12.04.17.
 */
public class
GetFromRestRandomEvent {

    private ReseachStandardization reseachStandardization;

    private RandomSelectedObject randomSelectedObject;

    public GetFromRestRandomEvent(String _stationId,String radius) {

        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/randomevent");
        MultivaluedMap formData = new MultivaluedMapImpl();
        formData. add("stationid", _stationId);
        formData. add("radius", radius);


//        setReseachStandardization(webResource.type("application/x-www-form-urlencoded").post(ReseachStandardization.class, formData));
        setRandomSelectedObject(webResource.type("application/x-www-form-urlencoded").post(RandomSelectedObject.class, formData));



    }

    public ReseachStandardization getReseachStandardization() {
        return reseachStandardization;
    }

    private void setReseachStandardization(ReseachStandardization reseachStandardization) {
        this.reseachStandardization = reseachStandardization;
    }

    public RandomSelectedObject getRandomSelectedObject() {
        return randomSelectedObject;
    }

    public void setRandomSelectedObject(RandomSelectedObject randomSelectedObject) {
        this.randomSelectedObject = randomSelectedObject;
    }
}
