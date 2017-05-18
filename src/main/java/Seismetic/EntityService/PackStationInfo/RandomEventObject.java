package Seismetic.EntityService.PackStationInfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.*;

/**
 * Created by oshchepkovayu on 12.04.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class RandomEventObject {

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


    public RandomEventObject(){}
    public RandomEventObject(String _stationid)
    {
        String sqlQuery =
                "select   \"date\" as data_event_random," +

                        "(cast(\"date\" as timestamp) - cast('6 months' as interval)) as start_date," +
                        "(cast(\"date\" as timestamp) + cast('6 months' as interval)) as end_date, " +
                        "date_trunc('year', \"date\") as curent_year," +
                        "magnitude as magnitude_event_random," +
                        "class as class_event_random," +
                        "ST_X(cast(lnglat as geometry)) as x," +
                        "ST_Y(cast(lnglat as geometry)) as y " +
                        ",*" +
                        " from event_templates  " +
                        " where stationid = '" + _stationid + "' offset floor(random()* 1000) LIMIT 1";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection       = null;
            Statement statement         = null;

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://84.237.62.137:5432/seismatica","seismatica_usr", "kubank12RX1");

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);
            while ( rs.next() ) {
            /*-----Заполнение созданных полей-----*/
            setStartDate(           rs.getDate( "start_date"));

            setEndDate(             rs.getDate(   "end_date"));
            setCurrentYear(         rs.getDate("curent_year"));
            setX(                   rs.getFloat         ("x"));
            setY(                   rs.getFloat         ("y"));

            /*-----Заполнение полей сущности------*/

                setDate(                            rs.   getDate( "date"));
                setId(                              rs.       getInt("id"));
                setDaynumber(                       rs.getInt("daynumber"));

                setType(                            rs.  getString("type"));
                setGmt(                             rs.getTimestamp("gmt"));
                setLnglat(                          rs.getString("lnglat"));

                setClassName(                         rs.getFloat("class"));
                setMagnitude(                     rs.getFloat("magnitude"));


                setObservatory(                rs.getString("observatory"));

                setNearestsettlement(   rs.getString("nearestsettlement"));

                setStarttime(                 rs.getTimestamp("starttime"));

                setLength(                             rs.getInt("length"));
                setSamplerate(                     rs.getInt("samplerate"));

                setData(                              rs.getString("data"));
                setComments(                      rs.getString("comments"));

                setUid(                                rs.getString("uid"));

                setChannels(                      rs.getString("channels"));
                setNetworkcode(                rs.getString("networkcode"));
                setStationid(                    rs.getString("stationid"));
                setLocationid(                  rs.getString("locationid"));


            }


            statement .close();
            rs        .close();
            connection.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDaynumber() {
        return daynumber;
    }

    public void setDaynumber(Integer daynumber) {
        this.daynumber = daynumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getGmt() {
        return gmt;
    }

    public void setGmt(Timestamp gmt) {
        this.gmt = gmt;
    }

    public String getLnglat() {
        return lnglat;
    }

    public void setLnglat(String lnglat) {
        this.lnglat = lnglat;
    }

    public Float getClassName() {
        return className;
    }

    public void setClassName(Float className) {
        this.className = className;
    }

    public Float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Float magnitude) {
        this.magnitude = magnitude;
    }

    public String getObservatory() {
        return observatory;
    }

    public void setObservatory(String observatory) {
        this.observatory = observatory;
    }

    public String getNearestsettlement() {
        return nearestsettlement;
    }

    public void setNearestsettlement(String nearestsettlement) {
        this.nearestsettlement = nearestsettlement;
    }

    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public Float getExplosiveamount() {
        return explosiveamount;
    }

    public void setExplosiveamount(Float explosiveamount) {
        this.explosiveamount = explosiveamount;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getSamplerate() {
        return samplerate;
    }

    public void setSamplerate(Integer samplerate) {
        this.samplerate = samplerate;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String getNetworkcode() {
        return networkcode;
    }

    public void setNetworkcode(String networkcode) {
        this.networkcode = networkcode;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }
}
