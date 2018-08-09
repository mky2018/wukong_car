import java.util.Date;

public class User {

    private int user_id;
    private int user_phone;         //'用户的手机作为用户的唯一标识
    private String user_pt;         //用户的昵称
    private String user_name;       //真实姓名
    private int user_sex;           //性别 radio
    private String user_country;    //国籍
    private String user_card;       //身份证号
    private String user_data;       //出生日期
    private String user_city;      //三级联动
    private String user_openid;    //'微信与后台生成' '程序交互
    private int user_type;         //通过自带的值
    private Date user_createtime;//'datetime' '系统生成 利用sql now()
    private int user_status;       //用于紧急修改状态
    private int user_openid_status;//关注取消后该为0' '后台操作
    private String user_grade;     //用户套餐等级

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_phone=" + user_phone +
                ", user_pt='" + user_pt + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_sex=" + user_sex +
                ", user_country='" + user_country + '\'' +
                ", user_card='" + user_card + '\'' +
                ", user_data='" + user_data + '\'' +
                ", user_city='" + user_city + '\'' +
                ", user_openid='" + user_openid + '\'' +
                ", user_type=" + user_type +
                ", user_createtime=" + user_createtime +
                ", user_status=" + user_status +
                ", user_openid_status=" + user_openid_status +
                ", user_grade='" + user_grade + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(int user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_pt() {
        return user_pt;
    }

    public void setUser_pt(String user_pt) {
        this.user_pt = user_pt;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_country() {
        return user_country;
    }

    public void setUser_country(String user_country) {
        this.user_country = user_country;
    }

    public String getUser_card() {
        return user_card;
    }

    public void setUser_card(String user_card) {
        this.user_card = user_card;
    }

    public String getUser_data() {
        return user_data;
    }

    public void setUser_data(String user_data) {
        this.user_data = user_data;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public String getUser_openid() {
        return user_openid;
    }

    public void setUser_openid(String user_openid) {
        this.user_openid = user_openid;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public Date getUser_createtime() {
        return user_createtime;
    }

    public void setUser_createtime(Date user_createtime) {
        this.user_createtime = user_createtime;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public int getUser_openid_status() {
        return user_openid_status;
    }

    public void setUser_openid_status(int user_openid_status) {
        this.user_openid_status = user_openid_status;
    }

    public String getUser_grade() {
        return user_grade;
    }

    public void setUser_grade(String user_grade) {
        this.user_grade = user_grade;
    }

    public User() {
    }

    public User(int user_id, int user_phone, String user_pt, String user_name, int user_sex, String user_country, String user_card, String user_data, String user_city, String user_openid, int user_type, Date user_createtime, int user_status, int user_openid_status, String user_grade) {
        this.user_id = user_id;
        this.user_phone = user_phone;
        this.user_pt = user_pt;
        this.user_name = user_name;
        this.user_sex = user_sex;
        this.user_country = user_country;
        this.user_card = user_card;
        this.user_data = user_data;
        this.user_city = user_city;
        this.user_openid = user_openid;
        this.user_type = user_type;
        this.user_createtime = user_createtime;
        this.user_status = user_status;
        this.user_openid_status = user_openid_status;
        this.user_grade = user_grade;
    }
}
