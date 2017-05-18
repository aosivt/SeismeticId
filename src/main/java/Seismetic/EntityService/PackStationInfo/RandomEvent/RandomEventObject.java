package Seismetic.EntityService.PackStationInfo.RandomEvent;

import Seismetic.EntityService.PackStationInfo.EventObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.*;
import java.util.List;

/**
 * Created by oshchepkovayu on 12.04.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class RandomEventObject implements EventObject<RandomEventObject> {

    /*-----Созданные в запросе поля-----*/

    private Date                startDate;
    private Date                  endDate;
    private Date              currentYear;
    private Float                       x;
    private Float                       y;


    /*----------Поля таблици------------*/
    private Integer                     id;

    private Integer              daynumber;
    private Date                      date;

    private String                    type;
    private Timestamp                  gmt;
    private String                  lnglat;
    private Float                className;
    private Float                magnitude;
    private String             observatory;
    private String       nearestsettlement;
    private String              objectname;
    private Float          explosiveamount;
    private Timestamp            starttime;
    private Integer                 length;
    private Integer             samplerate;
    private String                    data;
    private String                comments;
    private String                     uid;
    private String                channels;
    private String             networkcode;
    private String               stationid;
    private String              locationid;


    private List<Double>        standardizedCombination;

    private double              corelation;

    public RandomEventObject(){}

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(Date currentYear) {
        this.currentYear = currentYear;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Integer getId() {
        return id;
    }

    public RandomEventObject setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getDaynumber() {
        return daynumber;
    }

    public RandomEventObject setDaynumber(Integer daynumber) {
        this.daynumber = daynumber;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public RandomEventObject setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getType() {
        return type;
    }

    public RandomEventObject setType(String type) {
        this.type = type;
        return this;
    }

    public Timestamp getGmt() {
        return gmt;
    }

    public RandomEventObject setGmt(Timestamp gmt) {
        this.gmt = gmt;
        return this;
    }

    public String getLnglat() {
        return lnglat;
    }

    public RandomEventObject setLnglat(String lnglat) {
        this.lnglat = lnglat;
        return this;
    }

    public Float getClassName() {
        return className;
    }

    public RandomEventObject setClassName(Float className) {
        this.className = className;
        return this;
    }

    public Float getMagnitude() {
        return magnitude;
    }

    public RandomEventObject setMagnitude(Float magnitude) {
        this.magnitude = magnitude;
        return this;
    }

    public String getObservatory() {
        return observatory;
    }

    public RandomEventObject setObservatory(String observatory) {
        this.observatory = observatory;
        return this;
    }

    public String getNearestsettlement() {
        return nearestsettlement;
    }

    public RandomEventObject setNearestsettlement(String nearestsettlement) {
        this.nearestsettlement = nearestsettlement;
        return this;
    }

    public String getObjectname() {
        return objectname;
    }

    public RandomEventObject setObjectname(String objectname) {
        this.objectname = objectname;
        return this;
    }

    public Float getExplosiveamount() {
        return explosiveamount;
    }

    public RandomEventObject setExplosiveamount(Float explosiveamount) {
        this.explosiveamount = explosiveamount;
        return this;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public RandomEventObject setStarttime(Timestamp starttime) {
        this.starttime = starttime;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public RandomEventObject setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getSamplerate() {
        return samplerate;
    }

    public RandomEventObject setSamplerate(Integer samplerate) {
        this.samplerate = samplerate;
        return this;
    }

    public String getData() {
        return data;
    }

    public RandomEventObject setData(String data) {
        this.data = data;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public RandomEventObject setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public RandomEventObject setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getChannels() {
        return channels;
    }

    public RandomEventObject setChannels(String channels) {
        this.channels = channels;
        return this;
    }

    public String getNetworkcode() {
        return networkcode;
    }

    public RandomEventObject setNetworkcode(String networkcode) {
        this.networkcode = networkcode;
        return this;
    }

    public String getStationid() {
        return stationid;
    }

    public RandomEventObject setStationid(String stationid) {
        this.stationid = stationid;
        return this;
    }

    public String getLocationid() {
        return locationid;
    }

    public RandomEventObject setLocationid(String locationid) {
        this.locationid = locationid;
        return this;
    }
    public List<Double> getStandardizedCombination() {
        return standardizedCombination;
    }

    public void setStandardizedCombination(List<Double> standardizedCombination) {
        this.standardizedCombination = standardizedCombination;
    }


    @Override
    public double[][] getDataAsDouble() {
        return new double[0][];
    }

    @Override
    public void setDataAsDouble(double[][] dataAsDouble) {

    }

    @Override
    public double getCorelation() {
        return corelation;
    }

    @Override
    public RandomEventObject setCorelation(double dataAsDouble) {
        this.corelation = dataAsDouble;
        return this;
    }
}
