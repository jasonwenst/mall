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

        public Criteria andAtrrcodeIsNull() {
            addCriterion("atrrCode is null");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeIsNotNull() {
            addCriterion("atrrCode is not null");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeEqualTo(String value) {
            addCriterion("atrrCode =", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeNotEqualTo(String value) {
            addCriterion("atrrCode <>", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeGreaterThan(String value) {
            addCriterion("atrrCode >", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("atrrCode >=", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeLessThan(String value) {
            addCriterion("atrrCode <", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeLessThanOrEqualTo(String value) {
            addCriterion("atrrCode <=", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeLike(String value) {
            addCriterion("atrrCode like", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeNotLike(String value) {
            addCriterion("atrrCode not like", value, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeIn(List<String> values) {
            addCriterion("atrrCode in", values, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeNotIn(List<String> values) {
            addCriterion("atrrCode not in", values, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeBetween(String value1, String value2) {
            addCriterion("atrrCode between", value1, value2, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andAtrrcodeNotBetween(String value1, String value2) {
            addCriterion("atrrCode not between", value1, value2, "atrrcode");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTypevalueIsNull() {
            addCriterion("typeValue is null");
            return (Criteria) this;
        }

        public Criteria andTypevalueIsNotNull() {
            addCriterion("typeValue is not null");
            return (Criteria) this;
        }

        public Criteria andTypevalueEqualTo(String value) {
            addCriterion("typeValue =", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotEqualTo(String value) {
            addCriterion("typeValue <>", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueGreaterThan(String value) {
            addCriterion("typeValue >", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueGreaterThanOrEqualTo(String value) {
            addCriterion("typeValue >=", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLessThan(String value) {
            addCriterion("typeValue <", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLessThanOrEqualTo(String value) {
            addCriterion("typeValue <=", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLike(String value) {
            addCriterion("typeValue like", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotLike(String value) {
            addCriterion("typeValue not like", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueIn(List<String> values) {
            addCriterion("typeValue in", values, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotIn(List<String> values) {
            addCriterion("typeValue not in", values, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueBetween(String value1, String value2) {
            addCriterion("typeValue between", value1, value2, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotBetween(String value1, String value2) {
            addCriterion("typeValue not between", value1, value2, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
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