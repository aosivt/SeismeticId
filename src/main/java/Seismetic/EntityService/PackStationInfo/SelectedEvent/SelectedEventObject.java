package Seismetic.EntityService.PackStationInfo.SelectedEvent;

import Seismetic.EntityService.PackStationInfo.EventObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by oshchepkovayu on 12.04.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedEventObject implements EventObject<SelectedEventObject> {

    private Integer                     id;

    private Integer              daynumber;
    private Date                      date;

    private String                    type;
    private Timestamp gmt;
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

    private List<Double> standardizedCombination;

    private double              corelation;



    public SelectedEventObject(){}

    public Integer getId() {
        return id;
    }

    public SelectedEventObject setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getDaynumber() {
        return daynumber;
    }

    public SelectedEventObject setDaynumber(Integer daynumber) {
        this.daynumber = daynumber;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public SelectedEventObject setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getType() {
        return type;
    }

    public SelectedEventObject setType(String type) {
        this.type = type;
        return this;
    }

    public Timestamp getGmt() {
        return gmt;
    }

    public SelectedEventObject setGmt(Timestamp gmt) {
        this.gmt = gmt;
        return this;
    }

    public String getLnglat() {
        return lnglat;
    }

    public SelectedEventObject setLnglat(String lnglat) {
        this.lnglat = lnglat;
        return this;
    }

    public Float getClassName() {
        return className;
    }

    public SelectedEventObject setClassName(Float className) {
        this.className = className;
        return this;
    }

    public Float getMagnitude() {
        return magnitude;
    }

    public SelectedEventObject setMagnitude(Float magnitude) {
        this.magnitude = magnitude;
        return this;
    }

    public String getObservatory() {
        return observatory;
    }

    public SelectedEventObject setObservatory(String observatory) {
        this.observatory = observatory;
        return this;
    }

    public String getNearestsettlement() {
        return nearestsettlement;
    }

    public SelectedEventObject setNearestsettlement(String nearestsettlement) {
        this.nearestsettlement = nearestsettlement;
        return this;
    }

    public String getObjectname() {
        return objectname;
    }

    public SelectedEventObject setObjectname(String objectname) {
        this.objectname = objectname;
        return this;
    }

    public Float getExplosiveamount() {
        return explosiveamount;
    }

    public SelectedEventObject setExplosiveamount(Float explosiveamount) {
        this.explosiveamount = explosiveamount;
        return this;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public SelectedEventObject setStarttime(Timestamp starttime) {
        this.starttime = starttime;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public SelectedEventObject setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getSamplerate() {
        return samplerate;
    }

    public SelectedEventObject setSamplerate(Integer samplerate) {
        this.samplerate = samplerate;
        return this;
    }

    public String getData() {
        return data;
    }

    public SelectedEventObject setData(String data) {
        this.data = data;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public SelectedEventObject setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public SelectedEventObject setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getChannels() {
        return channels;
    }

    public SelectedEventObject setChannels(String channels) {
        this.channels = channels;
        return this;
    }

    public String getNetworkcode() {
        return networkcode;
    }

    public SelectedEventObject setNetworkcode(String networkcode) {
        this.networkcode = networkcode;
        return this;
    }

    public String getStationid() {
        return stationid;
    }

    public SelectedEventObject setStationid(String stationid) {
        this.stationid = stationid;
        return this;
    }

    public String getLocationid() {
        return locationid;
    }

    public SelectedEventObject setLocationid(String locationid) {
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
    public SelectedEventObject setCorelation(double dataAsDouble) {
        this.corelation = dataAsDouble;
        return this;
    }

    public String getEventLocation()
    {
        return getNearestsettlement() +":" + getObjectname();
    }
}
