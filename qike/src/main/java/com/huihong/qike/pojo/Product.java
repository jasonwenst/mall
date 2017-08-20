package com.huihong.qike.pojo;

import java.util.Date;

public class Product {
    private Integer id;

    private String productid;

    private Date lastupdatetime;

    private Date createtime;

    private String procuctname;

    private String productpicurl;

    private Integer producttypeid;

    private String productdesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
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

    public String getProcuctname() {
        return procuctname;
    }

    public void setProcuctname(String procuctname) {
        this.procuctname = procuctname;
    }

    public String getProductpicurl() {
        return productpicurl;
    }

    public void setProductpicurl(String productpicurl) {
        this.productpicurl = productpicurl;
    }

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }
}