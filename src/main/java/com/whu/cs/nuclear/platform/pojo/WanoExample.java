package com.whu.cs.nuclear.platform.pojo;

import java.util.ArrayList;
import java.util.List;

public class WanoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WanoExample() {
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

        public Criteria andWanoTypeIsNull() {
            addCriterion("wano_type is null");
            return (Criteria) this;
        }

        public Criteria andWanoTypeIsNotNull() {
            addCriterion("wano_type is not null");
            return (Criteria) this;
        }

        public Criteria andWanoTypeEqualTo(String value) {
            addCriterion("wano_type =", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeNotEqualTo(String value) {
            addCriterion("wano_type <>", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeGreaterThan(String value) {
            addCriterion("wano_type >", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wano_type >=", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeLessThan(String value) {
            addCriterion("wano_type <", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeLessThanOrEqualTo(String value) {
            addCriterion("wano_type <=", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeLike(String value) {
            addCriterion("wano_type like", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeNotLike(String value) {
            addCriterion("wano_type not like", value, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeIn(List<String> values) {
            addCriterion("wano_type in", values, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeNotIn(List<String> values) {
            addCriterion("wano_type not in", values, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeBetween(String value1, String value2) {
            addCriterion("wano_type between", value1, value2, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoTypeNotBetween(String value1, String value2) {
            addCriterion("wano_type not between", value1, value2, "wanoType");
            return (Criteria) this;
        }

        public Criteria andWanoIdIsNull() {
            addCriterion("wano_id is null");
            return (Criteria) this;
        }

        public Criteria andWanoIdIsNotNull() {
            addCriterion("wano_id is not null");
            return (Criteria) this;
        }

        public Criteria andWanoIdEqualTo(Integer value) {
            addCriterion("wano_id =", value, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdNotEqualTo(Integer value) {
            addCriterion("wano_id <>", value, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdGreaterThan(Integer value) {
            addCriterion("wano_id >", value, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wano_id >=", value, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdLessThan(Integer value) {
            addCriterion("wano_id <", value, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdLessThanOrEqualTo(Integer value) {
            addCriterion("wano_id <=", value, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdIn(List<Integer> values) {
            addCriterion("wano_id in", values, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdNotIn(List<Integer> values) {
            addCriterion("wano_id not in", values, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdBetween(Integer value1, Integer value2) {
            addCriterion("wano_id between", value1, value2, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wano_id not between", value1, value2, "wanoId");
            return (Criteria) this;
        }

        public Criteria andWanoDescIsNull() {
            addCriterion("wano_desc is null");
            return (Criteria) this;
        }

        public Criteria andWanoDescIsNotNull() {
            addCriterion("wano_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWanoDescEqualTo(String value) {
            addCriterion("wano_desc =", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescNotEqualTo(String value) {
            addCriterion("wano_desc <>", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescGreaterThan(String value) {
            addCriterion("wano_desc >", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescGreaterThanOrEqualTo(String value) {
            addCriterion("wano_desc >=", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescLessThan(String value) {
            addCriterion("wano_desc <", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescLessThanOrEqualTo(String value) {
            addCriterion("wano_desc <=", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescLike(String value) {
            addCriterion("wano_desc like", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescNotLike(String value) {
            addCriterion("wano_desc not like", value, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescIn(List<String> values) {
            addCriterion("wano_desc in", values, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescNotIn(List<String> values) {
            addCriterion("wano_desc not in", values, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescBetween(String value1, String value2) {
            addCriterion("wano_desc between", value1, value2, "wanoDesc");
            return (Criteria) this;
        }

        public Criteria andWanoDescNotBetween(String value1, String value2) {
            addCriterion("wano_desc not between", value1, value2, "wanoDesc");
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