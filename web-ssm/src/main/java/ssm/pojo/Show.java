package ssm.pojo;

/**
 * Created by Administrator on 2017/11/21 0021.
 */
public class Show {
    private String sname;
    private int count;

    public Show() {
    }

    public Show(String sname, int count) {
        this.sname = sname;
        this.count = count;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Show{" +
                "sname='" + sname + '\'' +
                ", count=" + count +
                '}';
    }
}
