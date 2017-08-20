package com.huihong.qike.pojo;

import java.math.BigDecimal;
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

        public Criteria andProductIdIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("productId =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("productId <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("productId >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("productId <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("productId like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("productId not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("productId in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("productId not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("lastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("lastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("lastUpdateTime =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("lastUpdateTime <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("lastUpdateTime >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("lastUpdateTime <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("lastUpdateTime in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("lastUpdateTime not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andProcuctNameIsNull() {
            addCriterion("procuctName is null");
            return (Criteria) this;
        }

        public Criteria andProcuctNameIsNotNull() {
            addCriterion("procuctName is not null");
            return (Criteria) this;
        }

        public Criteria andProcuctNameEqualTo(String value) {
            addCriterion("procuctName =", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameNotEqualTo(String value) {
            addCriterion("procuctName <>", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameGreaterThan(String value) {
            addCriterion("procuctName >", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameGreaterThanOrEqualTo(String value) {
            addCriterion("procuctName >=", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameLessThan(String value) {
            addCriterion("procuctName <", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameLessThanOrEqualTo(String value) {
            addCriterion("procuctName <=", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameLike(String value) {
            addCriterion("procuctName like", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameNotLike(String value) {
            addCriterion("procuctName not like", value, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameIn(List<String> values) {
            addCriterion("procuctName in", values, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameNotIn(List<String> values) {
            addCriterion("procuctName not in", values, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameBetween(String value1, String value2) {
            addCriterion("procuctName between", value1, value2, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProcuctNameNotBetween(String value1, String value2) {
            addCriterion("procuctName not between", value1, value2, "procuctName");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIsNull() {
            addCriterion("productPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIsNotNull() {
            addCriterion("productPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlEqualTo(String value) {
            addCriterion("productPicUrl =", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotEqualTo(String value) {
            addCriterion("productPicUrl <>", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlGreaterThan(String value) {
            addCriterion("productPicUrl >", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("productPicUrl >=", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLessThan(String value) {
            addCriterion("productPicUrl <", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLessThanOrEqualTo(String value) {
            addCriterion("productPicUrl <=", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLike(String value) {
            addCriterion("productPicUrl like", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotLike(String value) {
            addCriterion("productPicUrl not like", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIn(List<String> values) {
            addCriterion("productPicUrl in", values, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotIn(List<String> values) {
            addCriterion("productPicUrl not in", values, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlBetween(String value1, String value2) {
            addCriterion("productPicUrl between", value1, value2, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotBetween(String value1, String value2) {
            addCriterion("productPicUrl not between", value1, value2, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceIsNull() {
            addCriterion("productShowPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceIsNotNull() {
            addCriterion("productShowPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceEqualTo(BigDecimal value) {
            addCriterion("productShowPrice =", value, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceNotEqualTo(BigDecimal value) {
            addCriterion("productShowPrice <>", value, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceGreaterThan(BigDecimal value) {
            addCriterion("productShowPrice >", value, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productShowPrice >=", value, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceLessThan(BigDecimal value) {
            addCriterion("productShowPrice <", value, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productShowPrice <=", value, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceIn(List<BigDecimal> values) {
            addCriterion("productShowPrice in", values, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceNotIn(List<BigDecimal> values) {
            addCriterion("productShowPrice not in", values, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productShowPrice between", value1, value2, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductShowPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productShowPrice not between", value1, value2, "productShowPrice");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("productTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("productTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Integer value) {
            addCriterion("productTypeId =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Integer value) {
            addCriterion("productTypeId <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Integer value) {
            addCriterion("productTypeId >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productTypeId >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Integer value) {
            addCriterion("productTypeId <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("productTypeId <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Integer> values) {
            addCriterion("productTypeId in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Integer> values) {
            addCriterion("productTypeId not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("productTypeId between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productTypeId not between", value1, value2, "productTypeId");
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