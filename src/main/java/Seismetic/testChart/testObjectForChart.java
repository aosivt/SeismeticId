package Seismetic.testChart;

import com.google.gson.Gson;

import java.util.Date;

/**
 * Created by alex on 25.04.17.
 */
public class testObjectForChart {
    private Double[] dates = new Double[]{1.1,1.2};
    private Double[][] doubles = new Double[1][2];
    public testObjectForChart(){
        doubles[0]=dates;
    }
    public  testObjectForChart(String ObjectToJson){
     Gson gson = new Gson();
     Object o = gson.fromJson(ObjectToJson,this.getClass());

    }
    public String getObjectToJson()
    {
        return new Gson().toJson(this);
    }


}
