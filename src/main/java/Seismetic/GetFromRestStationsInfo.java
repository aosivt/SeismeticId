package Seismetic;

import Seismetic.EntityService.PackStationInfo.ListReturnStationInfo;
import com.sun.jersey.api.client.Client;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by alex on 09.04.17.
 */
public class GetFromRestStationsInfo {
    private static ListReturnStationInfo returnStationsInfo;
    public GetFromRestStationsInfo() {

        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/stations");
        MultivaluedMap formData = new MultivaluedMapImpl();
        formData. add("stationid", "");

        setReturnStationsInfo(webResource.type("application/x-www-form-urlencoded").post(ListReturnStationInfo.class, null));
    }

    public static ListReturnStationInfo getReturnStationsInfo() {
        return returnStationsInfo;
    }

    public static void setReturnStationsInfo(ListReturnStationInfo returnStationsInfo) {
        GetFromRestStationsInfo.returnStationsInfo = returnStationsInfo;
    }
}
