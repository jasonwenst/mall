package com.huihong.qike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductAttrExample() {
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

        public Criteria andProductAttrIdIsNull() {
            addCriterion("productAttrId is null");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdIsNotNull() {
            addCriterion("productAttrId is not null");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdEqualTo(Integer value) {
            addCriterion("productAttrId =", value, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdNotEqualTo(Integer value) {
            addCriterion("productAttrId <>", value, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdGreaterThan(Integer value) {
            addCriterion("productAttrId >", value, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productAttrId >=", value, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdLessThan(Integer value) {
            addCriterion("productAttrId <", value, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("productAttrId <=", value, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdIn(List<Integer> values) {
            addCriterion("productAttrId in", values, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdNotIn(List<Integer> values) {
            addCriterion("productAttrId not in", values, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("productAttrId between", value1, value2, "productAttrId");
            return (Criteria) this;
        }

        public Criteria andProductAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productAttrId not between", value1, value2, "productAttrId");
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

        public Criteria andAtrrCodeIsNull() {
            addCriterion("atrrCode is null");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeIsNotNull() {
            addCriterion("atrrCode is not null");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeEqualTo(String value) {
            addCriterion("atrrCode =", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeNotEqualTo(String value) {
            addCriterion("atrrCode <>", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeGreaterThan(String value) {
            addCriterion("atrrCode >", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("atrrCode >=", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeLessThan(String value) {
            addCriterion("atrrCode <", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeLessThanOrEqualTo(String value) {
            addCriterion("atrrCode <=", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeLike(String value) {
            addCriterion("atrrCode like", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeNotLike(String value) {
            addCriterion("atrrCode not like", value, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeIn(List<String> values) {
            addCriterion("atrrCode in", values, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeNotIn(List<String> values) {
            addCriterion("atrrCode not in", values, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeBetween(String value1, String value2) {
            addCriterion("atrrCode between", value1, value2, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andAtrrCodeNotBetween(String value1, String value2) {
            addCriterion("atrrCode not between", value1, value2, "atrrCode");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTypeValueIsNull() {
            addCriterion("typeValue is null");
            return (Criteria) this;
        }

        public Criteria andTypeValueIsNotNull() {
            addCriterion("typeValue is not null");
            return (Criteria) this;
        }

        public Criteria andTypeValueEqualTo(String value) {
            addCriterion("typeValue =", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueNotEqualTo(String value) {
            addCriterion("typeValue <>", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueGreaterThan(String value) {
            addCriterion("typeValue >", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueGreaterThanOrEqualTo(String value) {
            addCriterion("typeValue >=", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueLessThan(String value) {
            addCriterion("typeValue <", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueLessThanOrEqualTo(String value) {
            addCriterion("typeValue <=", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueLike(String value) {
            addCriterion("typeValue like", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueNotLike(String value) {
            addCriterion("typeValue not like", value, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueIn(List<String> values) {
            addCriterion("typeValue in", values, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueNotIn(List<String> values) {
            addCriterion("typeValue not in", values, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueBetween(String value1, String value2) {
            addCriterion("typeValue between", value1, value2, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeValueNotBetween(String value1, String value2) {
            addCriterion("typeValue not between", value1, value2, "typeValue");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("typeName =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("typeName >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("typeName <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("typeName like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("typeName not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("typeName in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typeName");
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