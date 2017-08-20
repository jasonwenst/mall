package com.huihong.qike.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductdetailidIsNull() {
            addCriterion("productDetailId is null");
            return (Criteria) this;
        }

        public Criteria andProductdetailidIsNotNull() {
            addCriterion("productDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andProductdetailidEqualTo(Integer value) {
            addCriterion("productDetailId =", value, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidNotEqualTo(Integer value) {
            addCriterion("productDetailId <>", value, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidGreaterThan(Integer value) {
            addCriterion("productDetailId >", value, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productDetailId >=", value, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidLessThan(Integer value) {
            addCriterion("productDetailId <", value, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("productDetailId <=", value, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidIn(List<Integer> values) {
            addCriterion("productDetailId in", values, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidNotIn(List<Integer> values) {
            addCriterion("productDetailId not in", values, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidBetween(Integer value1, Integer value2) {
            addCriterion("productDetailId between", value1, value2, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andProductdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("productDetailId not between", value1, value2, "productdetailid");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterion("lastUpdateTime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterion("lastUpdateTime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterion("lastUpdateTime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterion("lastUpdateTime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterion("lastUpdateTime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterion("lastUpdateTime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDetailpicIsNull() {
            addCriterion("detailPic is null");
            return (Criteria) this;
        }

        public Criteria andDetailpicIsNotNull() {
            addCriterion("detailPic is not null");
            return (Criteria) this;
        }

        public Criteria andDetailpicEqualTo(String value) {
            addCriterion("detailPic =", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicNotEqualTo(String value) {
            addCriterion("detailPic <>", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicGreaterThan(String value) {
            addCriterion("detailPic >", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicGreaterThanOrEqualTo(String value) {
            addCriterion("detailPic >=", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicLessThan(String value) {
            addCriterion("detailPic <", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicLessThanOrEqualTo(String value) {
            addCriterion("detailPic <=", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicLike(String value) {
            addCriterion("detailPic like", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicNotLike(String value) {
            addCriterion("detailPic not like", value, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicIn(List<String> values) {
            addCriterion("detailPic in", values, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicNotIn(List<String> values) {
            addCriterion("detailPic not in", values, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicBetween(String value1, String value2) {
            addCriterion("detailPic between", value1, value2, "detailpic");
            return (Criteria) this;
        }

        public Criteria andDetailpicNotBetween(String value1, String value2) {
            addCriterion("detailPic not between", value1, value2, "detailpic");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridIsNull() {
            addCriterion("productColorId is null");
            return (Criteria) this;
        }

        public Criteria andProductcoloridIsNotNull() {
            addCriterion("productColorId is not null");
            return (Criteria) this;
        }

        public Criteria andProductcoloridEqualTo(Integer value) {
            addCriterion("productColorId =", value, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridNotEqualTo(Integer value) {
            addCriterion("productColorId <>", value, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridGreaterThan(Integer value) {
            addCriterion("productColorId >", value, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("productColorId >=", value, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridLessThan(Integer value) {
            addCriterion("productColorId <", value, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridLessThanOrEqualTo(Integer value) {
            addCriterion("productColorId <=", value, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridIn(List<Integer> values) {
            addCriterion("productColorId in", values, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridNotIn(List<Integer> values) {
            addCriterion("productColorId not in", values, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridBetween(Integer value1, Integer value2) {
            addCriterion("productColorId between", value1, value2, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductcoloridNotBetween(Integer value1, Integer value2) {
            addCriterion("productColorId not between", value1, value2, "productcolorid");
            return (Criteria) this;
        }

        public Criteria andProductattridIsNull() {
            addCriterion("productAttrId is null");
            return (Criteria) this;
        }

        public Criteria andProductattridIsNotNull() {
            addCriterion("productAttrId is not null");
            return (Criteria) this;
        }

        public Criteria andProductattridEqualTo(Integer value) {
            addCriterion("productAttrId =", value, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridNotEqualTo(Integer value) {
            addCriterion("productAttrId <>", value, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridGreaterThan(Integer value) {
            addCriterion("productAttrId >", value, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridGreaterThanOrEqualTo(Integer value) {
            addCriterion("productAttrId >=", value, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridLessThan(Integer value) {
            addCriterion("productAttrId <", value, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridLessThanOrEqualTo(Integer value) {
            addCriterion("productAttrId <=", value, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridIn(List<Integer> values) {
            addCriterion("productAttrId in", values, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridNotIn(List<Integer> values) {
            addCriterion("productAttrId not in", values, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridBetween(Integer value1, Integer value2) {
            addCriterion("productAttrId between", value1, value2, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductattridNotBetween(Integer value1, Integer value2) {
            addCriterion("productAttrId not between", value1, value2, "productattrid");
            return (Criteria) this;
        }

        public Criteria andProductamountIsNull() {
            addCriterion("productAmount is null");
            return (Criteria) this;
        }

        public Criteria andProductamountIsNotNull() {
            addCriterion("productAmount is not null");
            return (Criteria) this;
        }

        public Criteria andProductamountEqualTo(Integer value) {
            addCriterion("productAmount =", value, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountNotEqualTo(Integer value) {
            addCriterion("productAmount <>", value, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountGreaterThan(Integer value) {
            addCriterion("productAmount >", value, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("productAmount >=", value, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountLessThan(Integer value) {
            addCriterion("productAmount <", value, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountLessThanOrEqualTo(Integer value) {
            addCriterion("productAmount <=", value, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountIn(List<Integer> values) {
            addCriterion("productAmount in", values, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountNotIn(List<Integer> values) {
            addCriterion("productAmount not in", values, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountBetween(Integer value1, Integer value2) {
            addCriterion("productAmount between", value1, value2, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductamountNotBetween(Integer value1, Integer value2) {
            addCriterion("productAmount not between", value1, value2, "productamount");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("productPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("productPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("productPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("productPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("productPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("productPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}