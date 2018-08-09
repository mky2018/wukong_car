package com.boot.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
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


}
