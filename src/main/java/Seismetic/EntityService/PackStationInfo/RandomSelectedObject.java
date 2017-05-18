package Seismetic.EntityService.PackStationInfo;

import Seismetic.EntityService.PackStationInfo.SelectedEvent.SelectedEventObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oshchepkovayu on 13.04.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomSelectedObject {
    @JsonProperty("random_object")
    private RandomEventObject randomEventObject;
    @JsonProperty("selected_objects")
    private List<SelectedEventObject> selectedEventObjects;

    public RandomSelectedObject(){}

    public RandomEventObject getRandomEventObject() {
        return randomEventObject;
    }

    public void setRandomEventObject(RandomEventObject randomEventObject) {
        this.randomEventObject = randomEventObject;
    }

    public List<SelectedEventObject> getSelectedEventObjects() {
        return selectedEventObjects;
    }

    public void setSelectedEventObjects(List<SelectedEventObject> selectedEventObjects) {
        this.selectedEventObjects = selectedEventObjects;
    }
}
