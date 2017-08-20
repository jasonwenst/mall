package com.huihong.qike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productId like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productId not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productid");
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

        public Criteria andProcuctnameIsNull() {
            addCriterion("procuctName is null");
            return (Criteria) this;
        }

        public Criteria andProcuctnameIsNotNull() {
            addCriterion("procuctName is not null");
            return (Criteria) this;
        }

        public Criteria andProcuctnameEqualTo(String value) {
            addCriterion("procuctName =", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameNotEqualTo(String value) {
            addCriterion("procuctName <>", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameGreaterThan(String value) {
            addCriterion("procuctName >", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameGreaterThanOrEqualTo(String value) {
            addCriterion("procuctName >=", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameLessThan(String value) {
            addCriterion("procuctName <", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameLessThanOrEqualTo(String value) {
            addCriterion("procuctName <=", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameLike(String value) {
            addCriterion("procuctName like", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameNotLike(String value) {
            addCriterion("procuctName not like", value, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameIn(List<String> values) {
            addCriterion("procuctName in", values, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameNotIn(List<String> values) {
            addCriterion("procuctName not in", values, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameBetween(String value1, String value2) {
            addCriterion("procuctName between", value1, value2, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProcuctnameNotBetween(String value1, String value2) {
            addCriterion("procuctName not between", value1, value2, "procuctname");
            return (Criteria) this;
        }

        public Criteria andProductpicurlIsNull() {
            addCriterion("productPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductpicurlIsNotNull() {
            addCriterion("productPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductpicurlEqualTo(String value) {
            addCriterion("productPicUrl =", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlNotEqualTo(String value) {
            addCriterion("productPicUrl <>", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlGreaterThan(String value) {
            addCriterion("productPicUrl >", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlGreaterThanOrEqualTo(String value) {
            addCriterion("productPicUrl >=", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlLessThan(String value) {
            addCriterion("productPicUrl <", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlLessThanOrEqualTo(String value) {
            addCriterion("productPicUrl <=", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlLike(String value) {
            addCriterion("productPicUrl like", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlNotLike(String value) {
            addCriterion("productPicUrl not like", value, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlIn(List<String> values) {
            addCriterion("productPicUrl in", values, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlNotIn(List<String> values) {
            addCriterion("productPicUrl not in", values, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlBetween(String value1, String value2) {
            addCriterion("productPicUrl between", value1, value2, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProductpicurlNotBetween(String value1, String value2) {
            addCriterion("productPicUrl not between", value1, value2, "productpicurl");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNull() {
            addCriterion("productTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNotNull() {
            addCriterion("productTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidEqualTo(Integer value) {
            addCriterion("productTypeId =", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotEqualTo(Integer value) {
            addCriterion("productTypeId <>", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThan(Integer value) {
            addCriterion("productTypeId >", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productTypeId >=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThan(Integer value) {
            addCriterion("productTypeId <", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("productTypeId <=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIn(List<Integer> values) {
            addCriterion("productTypeId in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotIn(List<Integer> values) {
            addCriterion("productTypeId not in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidBetween(Integer value1, Integer value2) {
            addCriterion("productTypeId between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("productTypeId not between", value1, value2, "producttypeid");
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