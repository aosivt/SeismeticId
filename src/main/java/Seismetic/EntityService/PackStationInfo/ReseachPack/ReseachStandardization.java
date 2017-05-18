package Seismetic.EntityService.PackStationInfo.ReseachPack;

import Seismetic.EntityService.PackStationInfo.RandomSelectedObject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by alex on 17.04.17.
 */
public class ReseachStandardization {

    private RandomSelectedObject    randomSelectedObjects;

    private List<List<Double>>          returnResultList;

    {
        System.out.println("---------reseachDiElements---------");
    }

    public ReseachStandardization(){}



    public RandomSelectedObject getRandomSelectedObjects() {
        return randomSelectedObjects;
    }

    public void setRandomSelectedObjects(RandomSelectedObject randomSelectedObjects) {
        this.randomSelectedObjects = randomSelectedObjects;
    }

    public List<List<Double>> getReturnResultList() {
        return returnResultList;
    }
}
