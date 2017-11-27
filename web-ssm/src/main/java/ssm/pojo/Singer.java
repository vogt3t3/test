package ssm.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;
import ssm.utils.CustomDateSerializer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
public class Singer {
    private int singerid;
    private String sname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private String region;
    private List<Song> list=new ArrayList<Song>();

    public Singer() {
    }

    public Singer(int singerid) {
        this.singerid = singerid;
    }

    public Singer(int singerid, String sname, Date birthday, String region) {
        this.singerid = singerid;
        this.sname = sname;
        this.birthday = birthday;
        this.region = region;
    }

    public int getSingerid() {
        return singerid;
    }

    public void setSingerid(int singerid) {
        this.singerid = singerid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Song> getList() {
        return list;
    }

    public void setList(List<Song> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerid=" + singerid +
                ", sname='" + sname + '\'' +
                ", birthday=" + birthday +
                ", region='" + region + '\'' +
                '}';
    }
}
