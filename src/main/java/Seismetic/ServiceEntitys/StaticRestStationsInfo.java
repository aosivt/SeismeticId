package Seismetic.ServiceEntitys;

import Seismetic.EntityService.PackStationInfo.ListReturnStationInfo;
import com.sun.jersey.api.client.Client;

import com.sun.jersey.api.client.WebResource;

/**
 * Created by alex on 18.04.17.
 */
public class StaticRestStationsInfo {
    public static ListReturnStationInfo returnStationsInfo;
    public StaticRestStationsInfo() {

        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/stations");
        returnStationsInfo = webResource.type("application/x-www-form-urlencoded").post(ListReturnStationInfo.class, null);
    }

    public static ListReturnStationInfo getReturnStationsInfo() {
        return returnStationsInfo;
    }
}