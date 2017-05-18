package Seismetic;

import Seismetic.EntityService.PackStationInfo.ListReturnStationInfo;
import Seismetic.EntityService.PackStationInfo.PackEventTemplates.ReturnResult;
import Seismetic.EntityService.PackStationInfo.RandomSelectedObject;
import Seismetic.EntityService.PackStationInfo.ReseachPack.ReseachStandardization;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by alex on 10.04.17.
 */
public class GetFromRestEventTemplates {


    private RandomSelectedObject returnResult;

    public GetFromRestEventTemplates(){
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/randomevent");
        MultivaluedMap formData = new MultivaluedMapImpl();
        formData. add("stationid", "KEM");

        
        returnResult = webResource.type("application/x-www-form-urlencoded")
                .post(RandomSelectedObject.class, formData);
    }
    public RandomSelectedObject getReturnResult() {

        return returnResult;
    }

    public void setReturnResult(RandomSelectedObject returnResult) {
        this.returnResult = returnResult;
    }
}
