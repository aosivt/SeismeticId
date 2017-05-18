package Seismetic.ServiceEntitys.Request;

/**
 * Created by alex on 18.04.17.
 */
public class RequetForRandomSelectedObject {
    private String stationdId;
    private Integer radius;

    public String getStationdId() {
        return stationdId;
    }

    public void setStationdId(String stationdId) {
        this.stationdId = stationdId;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
