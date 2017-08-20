package com.huihong.qike.pojo;

import java.util.Date;

public class ProductAttr {
    private Integer productattrid;

    private Date lastupdatetime;

    private Date createtime;

    private String atrrcode;

    private Integer userid;

    private String typevalue;

    private String typename;

    public Integer getProductattrid() {
        return productattrid;
    }

    public void setProductattrid(Integer productattrid) {
        this.productattrid = productattrid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAtrrcode() {
        return atrrcode;
    }

    public void setAtrrcode(String atrrcode) {
        this.atrrcode = atrrcode;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTypevalue() {
        return typevalue;
    }

    public void setTypevalue(String typevalue) {
        this.typevalue = typevalue;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}