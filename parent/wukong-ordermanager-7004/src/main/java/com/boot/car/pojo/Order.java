package com.boot.car.pojo;

import com.boot.car.Clue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


public class Order  extends Clue implements Serializable{
    private Integer clue_id;    //用户的ID
    private Integer order_review;//订单审核 1.未通过 2.已通过 3取消订单

    private   Integer signed_result; //签约结果 1.待签约 2.已签约 3取消订单
    private String pay_result;    //付款结果
    private String  account_result;  //到账结果
    private Integer order_status;   //订单状态 1.待审核 2.待签约 3.待付款4.确认 5.已付款 6 已取消

    public Integer getClue_id() {
        return clue_id;
    }

    public void setClue_id(Integer clue_id) {
        this.clue_id = clue_id;
    }

    public Integer getOrder_review() {
        return order_review;
    }

    public void setOrder_review(Integer order_review) {
        this.order_review = order_review;
    }

    public Integer getSigned_result() {
        return signed_result;
    }

    public void setSigned_result(Integer signed_result) {
        this.signed_result = signed_result;
    }

    public String getPay_result() {
        return pay_result;
    }

    public void setPay_result(String pay_result) {
        this.pay_result = pay_result;
    }

    public String getAccount_result() {
        return account_result;
    }

    public void setAccount_result(String account_result) {
        this.account_result = account_result;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Order(Integer clue_id, Integer order_review, Integer signed_result, String pay_result, String account_result, Integer order_status) {
        this.clue_id = clue_id;
        this.order_review = order_review;
        this.signed_result = signed_result;
        this.pay_result = pay_result;
        this.account_result = account_result;
        this.order_status = order_status;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "clue_id=" + clue_id +
                ", order_review=" + order_review +
                ", signed_result=" + signed_result +
                ", pay_result='" + pay_result + '\'' +
                ", account_result='" + account_result + '\'' +
                ", order_status=" + order_status +
                '}';
    }
}
