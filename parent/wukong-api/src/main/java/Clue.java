import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;

public class Clue {
    private Integer clue_id;  // 线索id
    private String clue_user_name; // 用户真实姓名
    private String clue_country; // 国籍
    private String clue_card; // 身份证
    private Integer clue_sex; // 性别
    private String clue_phone; // 手机号
    private Date clue_date; // 出生日期
    private String clue_city; // 所在城市
    private String clue_grade; // 当前等级
    private String clue_person; // 紧急联系人
    private String clue_reiation; // 关系
    private BigInteger clue_person_phone; // 联系电话
    private Integer clue_home; // 家庭状况
    private String clue_company_name; // 家庭状况
    private String clue_position; // 职位
    private Integer clue_money; // 月收入
    private String clue_address; // 紧急联系人住址
    private Integer clue_marriage; // 婚姻状况
    private String clue_fuwu_city; //服务城市
    private String clue_weixin;
    private String clue_qq;
    private String clue_buy; // 购买意向
    private String clue_remark; // 购买意向
    private String clue_postill; // 批注内容
    private Integer clue_status; // 线索状态
    private String clue_status_disable = ""; //线索状态为无效线索时,需要填写的栏
    private String clue_handlerperson; //操作人。

    private Date clue_createtime; // 线索创建时间
    private Date clue_updatetime; // 线索修改时
    private Date clue_next_link; // 下次沟通时间
    private Date clue_committime; // 沟通时间'

    /**
     * 当状态为提交状态时， 提交所有的身份证正反面,驾驶本正反面。
     */

    public Clue() {
    }

    @Override
    public String toString() {
        return "Clue{" +
                "clue_id=" + clue_id +
                ", clue_user_name='" + clue_user_name + '\'' +
                ", clue_country='" + clue_country + '\'' +
                ", clue_card='" + clue_card + '\'' +
                ", clue_sex=" + clue_sex +
                ", clue_phone='" + clue_phone + '\'' +
                ", clue_date=" + clue_date +
                ", clue_city='" + clue_city + '\'' +
                ", clue_grade='" + clue_grade + '\'' +
                ", clue_person='" + clue_person + '\'' +
                ", clue_reiation='" + clue_reiation + '\'' +
                ", clue_person_phone=" + clue_person_phone +
                ", clue_home=" + clue_home +
                ", clue_company_name='" + clue_company_name + '\'' +
                ", clue_position='" + clue_position + '\'' +
                ", clue_money=" + clue_money +
                ", clue_address='" + clue_address + '\'' +
                ", clue_marriage=" + clue_marriage +
                ", clue_fuwu_city='" + clue_fuwu_city + '\'' +
                ", clue_weixin='" + clue_weixin + '\'' +
                ", clue_qq='" + clue_qq + '\'' +
                ", clue_buy='" + clue_buy + '\'' +
                ", clue_remark='" + clue_remark + '\'' +
                ", clue_postill='" + clue_postill + '\'' +
                ", clue_status=" + clue_status +
                ", clue_status_disable='" + clue_status_disable + '\'' +
                ", clue_handlerperson='" + clue_handlerperson + '\'' +
                ", clue_createtime=" + clue_createtime +
                ", clue_updatetime=" + clue_updatetime +
                ", clue_next_link=" + clue_next_link +
                ", clue_committime=" + clue_committime +
                '}';
    }

    public Integer getClue_id() {
        return clue_id;
    }

    public void setClue_id(Integer clue_id) {
        this.clue_id = clue_id;
    }

    public String getClue_user_name() {
        return clue_user_name;
    }

    public void setClue_user_name(String clue_user_name) {
        this.clue_user_name = clue_user_name;
    }

    public String getClue_country() {
        return clue_country;
    }

    public void setClue_country(String clue_country) {
        this.clue_country = clue_country;
    }

    public String getClue_card() {
        return clue_card;
    }

    public void setClue_card(String clue_card) {
        this.clue_card = clue_card;
    }

    public Integer getClue_sex() {
        return clue_sex;
    }

    public void setClue_sex(Integer clue_sex) {
        this.clue_sex = clue_sex;
    }

    public String getClue_phone() {
        return clue_phone;
    }

    public void setClue_phone(String clue_phone) {
        this.clue_phone = clue_phone;
    }

    public Date getClue_date() {
        return clue_date;
    }

    public void setClue_date(Date clue_date) {
        this.clue_date = clue_date;
    }

    public String getClue_city() {
        return clue_city;
    }

    public void setClue_city(String clue_city) {
        this.clue_city = clue_city;
    }

    public String getClue_grade() {
        return clue_grade;
    }

    public void setClue_grade(String clue_grade) {
        this.clue_grade = clue_grade;
    }

    public String getClue_person() {
        return clue_person;
    }

    public void setClue_person(String clue_person) {
        this.clue_person = clue_person;
    }

    public String getClue_reiation() {
        return clue_reiation;
    }

    public void setClue_reiation(String clue_reiation) {
        this.clue_reiation = clue_reiation;
    }

    public BigInteger getClue_person_phone() {
        return clue_person_phone;
    }

    public void setClue_person_phone(BigInteger clue_person_phone) {
        this.clue_person_phone = clue_person_phone;
    }

    public Integer getClue_home() {
        return clue_home;
    }

    public void setClue_home(Integer clue_home) {
        this.clue_home = clue_home;
    }

    public String getClue_company_name() {
        return clue_company_name;
    }

    public void setClue_company_name(String clue_company_name) {
        this.clue_company_name = clue_company_name;
    }

    public String getClue_position() {
        return clue_position;
    }

    public void setClue_position(String clue_position) {
        this.clue_position = clue_position;
    }

    public Integer getClue_money() {
        return clue_money;
    }

    public void setClue_money(Integer clue_money) {
        this.clue_money = clue_money;
    }

    public String getClue_address() {
        return clue_address;
    }

    public void setClue_address(String clue_address) {
        this.clue_address = clue_address;
    }

    public Integer getClue_marriage() {
        return clue_marriage;
    }

    public void setClue_marriage(Integer clue_marriage) {
        this.clue_marriage = clue_marriage;
    }

    public String getClue_fuwu_city() {
        return clue_fuwu_city;
    }

    public void setClue_fuwu_city(String clue_fuwu_city) {
        this.clue_fuwu_city = clue_fuwu_city;
    }

    public String getClue_weixin() {
        return clue_weixin;
    }

    public void setClue_weixin(String clue_weixin) {
        this.clue_weixin = clue_weixin;
    }

    public String getClue_qq() {
        return clue_qq;
    }

    public void setClue_qq(String clue_qq) {
        this.clue_qq = clue_qq;
    }

    public String getClue_buy() {
        return clue_buy;
    }

    public void setClue_buy(String clue_buy) {
        this.clue_buy = clue_buy;
    }

    public String getClue_remark() {
        return clue_remark;
    }

    public void setClue_remark(String clue_remark) {
        this.clue_remark = clue_remark;
    }

    public String getClue_postill() {
        return clue_postill;
    }

    public void setClue_postill(String clue_postill) {
        this.clue_postill = clue_postill;
    }

    public Integer getClue_status() {
        return clue_status;
    }

    public void setClue_status(Integer clue_status) {
        this.clue_status = clue_status;
    }

    public String getClue_status_disable() {
        return clue_status_disable;
    }

    public void setClue_status_disable(String clue_status_disable) {
        this.clue_status_disable = clue_status_disable;
    }

    public String getClue_handlerperson() {
        return clue_handlerperson;
    }

    public void setClue_handlerperson(String clue_handlerperson) {
        this.clue_handlerperson = clue_handlerperson;
    }

    public Date getClue_createtime() {
        return clue_createtime;
    }

    public void setClue_createtime(Date clue_createtime) {
        this.clue_createtime = clue_createtime;
    }

    public Date getClue_updatetime() {
        return clue_updatetime;
    }

    public void setClue_updatetime(Date clue_updatetime) {
        this.clue_updatetime = clue_updatetime;
    }

    public Date getClue_next_link() {
        return clue_next_link;
    }

    public void setClue_next_link(Date clue_next_link) {
        this.clue_next_link = clue_next_link;
    }

    public Date getClue_committime() {
        return clue_committime;
    }

    public void setClue_committime(Date clue_committime) {
        this.clue_committime = clue_committime;
    }

    public Clue(Integer clue_id, String clue_user_name, String clue_country, String clue_card, Integer clue_sex, String clue_phone, Date clue_date, String clue_city, String clue_grade, String clue_person, String clue_reiation, BigInteger clue_person_phone, Integer clue_home, String clue_company_name, String clue_position, Integer clue_money, String clue_address, Integer clue_marriage, String clue_fuwu_city, String clue_weixin, String clue_qq, String clue_buy, String clue_remark, String clue_postill, Integer clue_status, String clue_status_disable, String clue_handlerperson, Date clue_createtime, Date clue_updatetime, Date clue_next_link, Date clue_committime) {
        this.clue_id = clue_id;
        this.clue_user_name = clue_user_name;
        this.clue_country = clue_country;
        this.clue_card = clue_card;
        this.clue_sex = clue_sex;
        this.clue_phone = clue_phone;
        this.clue_date = clue_date;
        this.clue_city = clue_city;
        this.clue_grade = clue_grade;
        this.clue_person = clue_person;
        this.clue_reiation = clue_reiation;
        this.clue_person_phone = clue_person_phone;
        this.clue_home = clue_home;
        this.clue_company_name = clue_company_name;
        this.clue_position = clue_position;
        this.clue_money = clue_money;
        this.clue_address = clue_address;
        this.clue_marriage = clue_marriage;
        this.clue_fuwu_city = clue_fuwu_city;
        this.clue_weixin = clue_weixin;
        this.clue_qq = clue_qq;
        this.clue_buy = clue_buy;
        this.clue_remark = clue_remark;
        this.clue_postill = clue_postill;
        this.clue_status = clue_status;
        this.clue_status_disable = clue_status_disable;
        this.clue_handlerperson = clue_handlerperson;
        this.clue_createtime = clue_createtime;
        this.clue_updatetime = clue_updatetime;
        this.clue_next_link = clue_next_link;
        this.clue_committime = clue_committime;
    }
}
