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

        public Criteria andProductDetailIdIsNull() {
            addCriterion("productDetailId is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdIsNotNull() {
            addCriterion("productDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdEqualTo(Integer value) {
            addCriterion("productDetailId =", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotEqualTo(Integer value) {
            addCriterion("productDetailId <>", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdGreaterThan(Integer value) {
            addCriterion("productDetailId >", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productDetailId >=", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdLessThan(Integer value) {
            addCriterion("productDetailId <", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("productDetailId <=", value, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdIn(List<Integer> values) {
            addCriterion("productDetailId in", values, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotIn(List<Integer> values) {
            addCriterion("productDetailId not in", values, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("productDetailId between", value1, value2, "productDetailId");
            return (Criteria) this;
        }

        public Criteria andProductDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productDetailId not between", value1, value2, "productDetailId");
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

        public Criteria andDetailPicIsNull() {
            addCriterion("detailPic is null");
            return (Criteria) this;
        }

        public Criteria andDetailPicIsNotNull() {
            addCriterion("detailPic is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPicEqualTo(String value) {
            addCriterion("detailPic =", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotEqualTo(String value) {
            addCriterion("detailPic <>", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicGreaterThan(String value) {
            addCriterion("detailPic >", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicGreaterThanOrEqualTo(String value) {
            addCriterion("detailPic >=", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicLessThan(String value) {
            addCriterion("detailPic <", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicLessThanOrEqualTo(String value) {
            addCriterion("detailPic <=", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicLike(String value) {
            addCriterion("detailPic like", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotLike(String value) {
            addCriterion("detailPic not like", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicIn(List<String> values) {
            addCriterion("detailPic in", values, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotIn(List<String> values) {
            addCriterion("detailPic not in", values, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicBetween(String value1, String value2) {
            addCriterion("detailPic between", value1, value2, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotBetween(String value1, String value2) {
            addCriterion("detailPic not between", value1, value2, "detailPic");
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

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("productId =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("productId >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("productId <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("productId in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdIsNull() {
            addCriterion("productColorId is null");
            return (Criteria) this;
        }

        public Criteria andProductColorIdIsNotNull() {
            addCriterion("productColorId is not null");
            return (Criteria) this;
        }

        public Criteria andProductColorIdEqualTo(Integer value) {
            addCriterion("productColorId =", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdNotEqualTo(Integer value) {
            addCriterion("productColorId <>", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdGreaterThan(Integer value) {
            addCriterion("productColorId >", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productColorId >=", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdLessThan(Integer value) {
            addCriterion("productColorId <", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("productColorId <=", value, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdIn(List<Integer> values) {
            addCriterion("productColorId in", values, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdNotIn(List<Integer> values) {
            addCriterion("productColorId not in", values, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdBetween(Integer value1, Integer value2) {
            addCriterion("productColorId between", value1, value2, "productColorId");
            return (Criteria) this;
        }

        public Criteria andProductColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productColorId not between", value1, value2, "productColorId");
            return (Criteria) this;
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

        public Criteria andProductAmountIsNull() {
            addCriterion("productAmount is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNotNull() {
            addCriterion("productAmount is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountEqualTo(Integer value) {
            addCriterion("productAmount =", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotEqualTo(Integer value) {
            addCriterion("productAmount <>", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThan(Integer value) {
            addCriterion("productAmount >", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("productAmount >=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThan(Integer value) {
            addCriterion("productAmount <", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThanOrEqualTo(Integer value) {
            addCriterion("productAmount <=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIn(List<Integer> values) {
            addCriterion("productAmount in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotIn(List<Integer> values) {
            addCriterion("productAmount not in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountBetween(Integer value1, Integer value2) {
            addCriterion("productAmount between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("productAmount not between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("productPrice =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("productPrice <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("productPrice >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("productPrice <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("productPrice in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("productPrice not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice not between", value1, value2, "productPrice");
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