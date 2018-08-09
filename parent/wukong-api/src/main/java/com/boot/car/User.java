package com.boot.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = false)
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


}
