package com.huadou.cn.plateform.pojo;

import java.io.Serializable;

/**
 * Created by mengqc on 2016/6/26.
 */
public class RequestBean implements Serializable {
    private static final long serialVersionUID = 5295547160608508194L;
    private String item;
    private String card_id;
    private String security_code;
    private String record;
    private String oemr_items;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getOemr_items() {
        return oemr_items;
    }

    public void setOemr_items(String oemr_items) {
        this.oemr_items = oemr_items;
    }
}
