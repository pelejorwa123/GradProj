package com.whu.cs.nuclear.platform.pojo;

import java.util.ArrayList;
import java.util.List;

public class LoerReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoerReportExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoerNoIsNull() {
            addCriterion("loer_no is null");
            return (Criteria) this;
        }

        public Criteria andLoerNoIsNotNull() {
            addCriterion("loer_no is not null");
            return (Criteria) this;
        }

        public Criteria andLoerNoEqualTo(String value) {
            addCriterion("loer_no =", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoNotEqualTo(String value) {
            addCriterion("loer_no <>", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoGreaterThan(String value) {
            addCriterion("loer_no >", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoGreaterThanOrEqualTo(String value) {
            addCriterion("loer_no >=", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoLessThan(String value) {
            addCriterion("loer_no <", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoLessThanOrEqualTo(String value) {
            addCriterion("loer_no <=", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoLike(String value) {
            addCriterion("loer_no like", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoNotLike(String value) {
            addCriterion("loer_no not like", value, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoIn(List<String> values) {
            addCriterion("loer_no in", values, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoNotIn(List<String> values) {
            addCriterion("loer_no not in", values, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoBetween(String value1, String value2) {
            addCriterion("loer_no between", value1, value2, "loerNo");
            return (Criteria) this;
        }

        public Criteria andLoerNoNotBetween(String value1, String value2) {
            addCriterion("loer_no not between", value1, value2, "loerNo");
            return (Criteria) this;
        }

        public Criteria andPlantCodeIsNull() {
            addCriterion("plant_code is null");
            return (Criteria) this;
        }

        public Criteria andPlantCodeIsNotNull() {
            addCriterion("plant_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlantCodeEqualTo(String value) {
            addCriterion("plant_code =", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeNotEqualTo(String value) {
            addCriterion("plant_code <>", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeGreaterThan(String value) {
            addCriterion("plant_code >", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("plant_code >=", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeLessThan(String value) {
            addCriterion("plant_code <", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeLessThanOrEqualTo(String value) {
            addCriterion("plant_code <=", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeLike(String value) {
            addCriterion("plant_code like", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeNotLike(String value) {
            addCriterion("plant_code not like", value, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeIn(List<String> values) {
            addCriterion("plant_code in", values, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeNotIn(List<String> values) {
            addCriterion("plant_code not in", values, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeBetween(String value1, String value2) {
            addCriterion("plant_code between", value1, value2, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantCodeNotBetween(String value1, String value2) {
            addCriterion("plant_code not between", value1, value2, "plantCode");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNull() {
            addCriterion("plant_name is null");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNotNull() {
            addCriterion("plant_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNameEqualTo(String value) {
            addCriterion("plant_name =", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotEqualTo(String value) {
            addCriterion("plant_name <>", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThan(String value) {
            addCriterion("plant_name >", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThanOrEqualTo(String value) {
            addCriterion("plant_name >=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThan(String value) {
            addCriterion("plant_name <", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThanOrEqualTo(String value) {
            addCriterion("plant_name <=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLike(String value) {
            addCriterion("plant_name like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotLike(String value) {
            addCriterion("plant_name not like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameIn(List<String> values) {
            addCriterion("plant_name in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotIn(List<String> values) {
            addCriterion("plant_name not in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameBetween(String value1, String value2) {
            addCriterion("plant_name between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotBetween(String value1, String value2) {
            addCriterion("plant_name not between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNull() {
            addCriterion("unit_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNotNull() {
            addCriterion("unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeEqualTo(String value) {
            addCriterion("unit_code =", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotEqualTo(String value) {
            addCriterion("unit_code <>", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThan(String value) {
            addCriterion("unit_code >", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_code >=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThan(String value) {
            addCriterion("unit_code <", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_code <=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLike(String value) {
            addCriterion("unit_code like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotLike(String value) {
            addCriterion("unit_code not like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIn(List<String> values) {
            addCriterion("unit_code in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotIn(List<String> values) {
            addCriterion("unit_code not in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeBetween(String value1, String value2) {
            addCriterion("unit_code between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotBetween(String value1, String value2) {
            addCriterion("unit_code not between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUniformUnitIsNull() {
            addCriterion("uniform_unit is null");
            return (Criteria) this;
        }

        public Criteria andUniformUnitIsNotNull() {
            addCriterion("uniform_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUniformUnitEqualTo(String value) {
            addCriterion("uniform_unit =", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitNotEqualTo(String value) {
            addCriterion("uniform_unit <>", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitGreaterThan(String value) {
            addCriterion("uniform_unit >", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitGreaterThanOrEqualTo(String value) {
            addCriterion("uniform_unit >=", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitLessThan(String value) {
            addCriterion("uniform_unit <", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitLessThanOrEqualTo(String value) {
            addCriterion("uniform_unit <=", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitLike(String value) {
            addCriterion("uniform_unit like", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitNotLike(String value) {
            addCriterion("uniform_unit not like", value, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitIn(List<String> values) {
            addCriterion("uniform_unit in", values, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitNotIn(List<String> values) {
            addCriterion("uniform_unit not in", values, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitBetween(String value1, String value2) {
            addCriterion("uniform_unit between", value1, value2, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andUniformUnitNotBetween(String value1, String value2) {
            addCriterion("uniform_unit not between", value1, value2, "uniformUnit");
            return (Criteria) this;
        }

        public Criteria andReportYearIsNull() {
            addCriterion("report_year is null");
            return (Criteria) this;
        }

        public Criteria andReportYearIsNotNull() {
            addCriterion("report_year is not null");
            return (Criteria) this;
        }

        public Criteria andReportYearEqualTo(String value) {
            addCriterion("report_year =", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearNotEqualTo(String value) {
            addCriterion("report_year <>", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearGreaterThan(String value) {
            addCriterion("report_year >", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearGreaterThanOrEqualTo(String value) {
            addCriterion("report_year >=", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearLessThan(String value) {
            addCriterion("report_year <", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearLessThanOrEqualTo(String value) {
            addCriterion("report_year <=", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearLike(String value) {
            addCriterion("report_year like", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearNotLike(String value) {
            addCriterion("report_year not like", value, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearIn(List<String> values) {
            addCriterion("report_year in", values, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearNotIn(List<String> values) {
            addCriterion("report_year not in", values, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearBetween(String value1, String value2) {
            addCriterion("report_year between", value1, value2, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportYearNotBetween(String value1, String value2) {
            addCriterion("report_year not between", value1, value2, "reportYear");
            return (Criteria) this;
        }

        public Criteria andReportSerialIsNull() {
            addCriterion("report_serial is null");
            return (Criteria) this;
        }

        public Criteria andReportSerialIsNotNull() {
            addCriterion("report_serial is not null");
            return (Criteria) this;
        }

        public Criteria andReportSerialEqualTo(String value) {
            addCriterion("report_serial =", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialNotEqualTo(String value) {
            addCriterion("report_serial <>", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialGreaterThan(String value) {
            addCriterion("report_serial >", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialGreaterThanOrEqualTo(String value) {
            addCriterion("report_serial >=", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialLessThan(String value) {
            addCriterion("report_serial <", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialLessThanOrEqualTo(String value) {
            addCriterion("report_serial <=", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialLike(String value) {
            addCriterion("report_serial like", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialNotLike(String value) {
            addCriterion("report_serial not like", value, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialIn(List<String> values) {
            addCriterion("report_serial in", values, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialNotIn(List<String> values) {
            addCriterion("report_serial not in", values, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialBetween(String value1, String value2) {
            addCriterion("report_serial between", value1, value2, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andReportSerialNotBetween(String value1, String value2) {
            addCriterion("report_serial not between", value1, value2, "reportSerial");
            return (Criteria) this;
        }

        public Criteria andEnNoIsNull() {
            addCriterion("en_no is null");
            return (Criteria) this;
        }

        public Criteria andEnNoIsNotNull() {
            addCriterion("en_no is not null");
            return (Criteria) this;
        }

        public Criteria andEnNoEqualTo(String value) {
            addCriterion("en_no =", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoNotEqualTo(String value) {
            addCriterion("en_no <>", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoGreaterThan(String value) {
            addCriterion("en_no >", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoGreaterThanOrEqualTo(String value) {
            addCriterion("en_no >=", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoLessThan(String value) {
            addCriterion("en_no <", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoLessThanOrEqualTo(String value) {
            addCriterion("en_no <=", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoLike(String value) {
            addCriterion("en_no like", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoNotLike(String value) {
            addCriterion("en_no not like", value, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoIn(List<String> values) {
            addCriterion("en_no in", values, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoNotIn(List<String> values) {
            addCriterion("en_no not in", values, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoBetween(String value1, String value2) {
            addCriterion("en_no between", value1, value2, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnNoNotBetween(String value1, String value2) {
            addCriterion("en_no not between", value1, value2, "enNo");
            return (Criteria) this;
        }

        public Criteria andEnDateIsNull() {
            addCriterion("en_date is null");
            return (Criteria) this;
        }

        public Criteria andEnDateIsNotNull() {
            addCriterion("en_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnDateEqualTo(String value) {
            addCriterion("en_date =", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotEqualTo(String value) {
            addCriterion("en_date <>", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateGreaterThan(String value) {
            addCriterion("en_date >", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateGreaterThanOrEqualTo(String value) {
            addCriterion("en_date >=", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateLessThan(String value) {
            addCriterion("en_date <", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateLessThanOrEqualTo(String value) {
            addCriterion("en_date <=", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateLike(String value) {
            addCriterion("en_date like", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotLike(String value) {
            addCriterion("en_date not like", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateIn(List<String> values) {
            addCriterion("en_date in", values, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotIn(List<String> values) {
            addCriterion("en_date not in", values, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateBetween(String value1, String value2) {
            addCriterion("en_date between", value1, value2, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotBetween(String value1, String value2) {
            addCriterion("en_date not between", value1, value2, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnSerialIsNull() {
            addCriterion("en_serial is null");
            return (Criteria) this;
        }

        public Criteria andEnSerialIsNotNull() {
            addCriterion("en_serial is not null");
            return (Criteria) this;
        }

        public Criteria andEnSerialEqualTo(String value) {
            addCriterion("en_serial =", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialNotEqualTo(String value) {
            addCriterion("en_serial <>", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialGreaterThan(String value) {
            addCriterion("en_serial >", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialGreaterThanOrEqualTo(String value) {
            addCriterion("en_serial >=", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialLessThan(String value) {
            addCriterion("en_serial <", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialLessThanOrEqualTo(String value) {
            addCriterion("en_serial <=", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialLike(String value) {
            addCriterion("en_serial like", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialNotLike(String value) {
            addCriterion("en_serial not like", value, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialIn(List<String> values) {
            addCriterion("en_serial in", values, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialNotIn(List<String> values) {
            addCriterion("en_serial not in", values, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialBetween(String value1, String value2) {
            addCriterion("en_serial between", value1, value2, "enSerial");
            return (Criteria) this;
        }

        public Criteria andEnSerialNotBetween(String value1, String value2) {
            addCriterion("en_serial not between", value1, value2, "enSerial");
            return (Criteria) this;
        }

        public Criteria andInesLevelIsNull() {
            addCriterion("ines_level is null");
            return (Criteria) this;
        }

        public Criteria andInesLevelIsNotNull() {
            addCriterion("ines_level is not null");
            return (Criteria) this;
        }

        public Criteria andInesLevelEqualTo(String value) {
            addCriterion("ines_level =", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelNotEqualTo(String value) {
            addCriterion("ines_level <>", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelGreaterThan(String value) {
            addCriterion("ines_level >", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ines_level >=", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelLessThan(String value) {
            addCriterion("ines_level <", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelLessThanOrEqualTo(String value) {
            addCriterion("ines_level <=", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelLike(String value) {
            addCriterion("ines_level like", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelNotLike(String value) {
            addCriterion("ines_level not like", value, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelIn(List<String> values) {
            addCriterion("ines_level in", values, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelNotIn(List<String> values) {
            addCriterion("ines_level not in", values, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelBetween(String value1, String value2) {
            addCriterion("ines_level between", value1, value2, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andInesLevelNotBetween(String value1, String value2) {
            addCriterion("ines_level not between", value1, value2, "inesLevel");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andEventBeginIsNull() {
            addCriterion("event_begin is null");
            return (Criteria) this;
        }

        public Criteria andEventBeginIsNotNull() {
            addCriterion("event_begin is not null");
            return (Criteria) this;
        }

        public Criteria andEventBeginEqualTo(String value) {
            addCriterion("event_begin =", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginNotEqualTo(String value) {
            addCriterion("event_begin <>", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginGreaterThan(String value) {
            addCriterion("event_begin >", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginGreaterThanOrEqualTo(String value) {
            addCriterion("event_begin >=", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginLessThan(String value) {
            addCriterion("event_begin <", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginLessThanOrEqualTo(String value) {
            addCriterion("event_begin <=", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginLike(String value) {
            addCriterion("event_begin like", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginNotLike(String value) {
            addCriterion("event_begin not like", value, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginIn(List<String> values) {
            addCriterion("event_begin in", values, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginNotIn(List<String> values) {
            addCriterion("event_begin not in", values, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginBetween(String value1, String value2) {
            addCriterion("event_begin between", value1, value2, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventBeginNotBetween(String value1, String value2) {
            addCriterion("event_begin not between", value1, value2, "eventBegin");
            return (Criteria) this;
        }

        public Criteria andEventEndIsNull() {
            addCriterion("event_end is null");
            return (Criteria) this;
        }

        public Criteria andEventEndIsNotNull() {
            addCriterion("event_end is not null");
            return (Criteria) this;
        }

        public Criteria andEventEndEqualTo(String value) {
            addCriterion("event_end =", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotEqualTo(String value) {
            addCriterion("event_end <>", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndGreaterThan(String value) {
            addCriterion("event_end >", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndGreaterThanOrEqualTo(String value) {
            addCriterion("event_end >=", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndLessThan(String value) {
            addCriterion("event_end <", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndLessThanOrEqualTo(String value) {
            addCriterion("event_end <=", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndLike(String value) {
            addCriterion("event_end like", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotLike(String value) {
            addCriterion("event_end not like", value, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndIn(List<String> values) {
            addCriterion("event_end in", values, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotIn(List<String> values) {
            addCriterion("event_end not in", values, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndBetween(String value1, String value2) {
            addCriterion("event_end between", value1, value2, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andEventEndNotBetween(String value1, String value2) {
            addCriterion("event_end not between", value1, value2, "eventEnd");
            return (Criteria) this;
        }

        public Criteria andReporterDateIsNull() {
            addCriterion("reporter_date is null");
            return (Criteria) this;
        }

        public Criteria andReporterDateIsNotNull() {
            addCriterion("reporter_date is not null");
            return (Criteria) this;
        }

        public Criteria andReporterDateEqualTo(String value) {
            addCriterion("reporter_date =", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateNotEqualTo(String value) {
            addCriterion("reporter_date <>", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateGreaterThan(String value) {
            addCriterion("reporter_date >", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateGreaterThanOrEqualTo(String value) {
            addCriterion("reporter_date >=", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateLessThan(String value) {
            addCriterion("reporter_date <", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateLessThanOrEqualTo(String value) {
            addCriterion("reporter_date <=", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateLike(String value) {
            addCriterion("reporter_date like", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateNotLike(String value) {
            addCriterion("reporter_date not like", value, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateIn(List<String> values) {
            addCriterion("reporter_date in", values, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateNotIn(List<String> values) {
            addCriterion("reporter_date not in", values, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateBetween(String value1, String value2) {
            addCriterion("reporter_date between", value1, value2, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andReporterDateNotBetween(String value1, String value2) {
            addCriterion("reporter_date not between", value1, value2, "reporterDate");
            return (Criteria) this;
        }

        public Criteria andPersonShineIsNull() {
            addCriterion("person_shine is null");
            return (Criteria) this;
        }

        public Criteria andPersonShineIsNotNull() {
            addCriterion("person_shine is not null");
            return (Criteria) this;
        }

        public Criteria andPersonShineEqualTo(String value) {
            addCriterion("person_shine =", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineNotEqualTo(String value) {
            addCriterion("person_shine <>", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineGreaterThan(String value) {
            addCriterion("person_shine >", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineGreaterThanOrEqualTo(String value) {
            addCriterion("person_shine >=", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineLessThan(String value) {
            addCriterion("person_shine <", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineLessThanOrEqualTo(String value) {
            addCriterion("person_shine <=", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineLike(String value) {
            addCriterion("person_shine like", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineNotLike(String value) {
            addCriterion("person_shine not like", value, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineIn(List<String> values) {
            addCriterion("person_shine in", values, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineNotIn(List<String> values) {
            addCriterion("person_shine not in", values, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineBetween(String value1, String value2) {
            addCriterion("person_shine between", value1, value2, "personShine");
            return (Criteria) this;
        }

        public Criteria andPersonShineNotBetween(String value1, String value2) {
            addCriterion("person_shine not between", value1, value2, "personShine");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteIsNull() {
            addCriterion("env_pollute is null");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteIsNotNull() {
            addCriterion("env_pollute is not null");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteEqualTo(String value) {
            addCriterion("env_pollute =", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteNotEqualTo(String value) {
            addCriterion("env_pollute <>", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteGreaterThan(String value) {
            addCriterion("env_pollute >", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteGreaterThanOrEqualTo(String value) {
            addCriterion("env_pollute >=", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteLessThan(String value) {
            addCriterion("env_pollute <", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteLessThanOrEqualTo(String value) {
            addCriterion("env_pollute <=", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteLike(String value) {
            addCriterion("env_pollute like", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteNotLike(String value) {
            addCriterion("env_pollute not like", value, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteIn(List<String> values) {
            addCriterion("env_pollute in", values, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteNotIn(List<String> values) {
            addCriterion("env_pollute not in", values, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteBetween(String value1, String value2) {
            addCriterion("env_pollute between", value1, value2, "envPollute");
            return (Criteria) this;
        }

        public Criteria andEnvPolluteNotBetween(String value1, String value2) {
            addCriterion("env_pollute not between", value1, value2, "envPollute");
            return (Criteria) this;
        }

        public Criteria andReportRuleIsNull() {
            addCriterion("report_rule is null");
            return (Criteria) this;
        }

        public Criteria andReportRuleIsNotNull() {
            addCriterion("report_rule is not null");
            return (Criteria) this;
        }

        public Criteria andReportRuleEqualTo(String value) {
            addCriterion("report_rule =", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleNotEqualTo(String value) {
            addCriterion("report_rule <>", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleGreaterThan(String value) {
            addCriterion("report_rule >", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleGreaterThanOrEqualTo(String value) {
            addCriterion("report_rule >=", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleLessThan(String value) {
            addCriterion("report_rule <", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleLessThanOrEqualTo(String value) {
            addCriterion("report_rule <=", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleLike(String value) {
            addCriterion("report_rule like", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleNotLike(String value) {
            addCriterion("report_rule not like", value, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleIn(List<String> values) {
            addCriterion("report_rule in", values, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleNotIn(List<String> values) {
            addCriterion("report_rule not in", values, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleBetween(String value1, String value2) {
            addCriterion("report_rule between", value1, value2, "reportRule");
            return (Criteria) this;
        }

        public Criteria andReportRuleNotBetween(String value1, String value2) {
            addCriterion("report_rule not between", value1, value2, "reportRule");
            return (Criteria) this;
        }

        public Criteria andUnitStateIsNull() {
            addCriterion("unit_state is null");
            return (Criteria) this;
        }

        public Criteria andUnitStateIsNotNull() {
            addCriterion("unit_state is not null");
            return (Criteria) this;
        }

        public Criteria andUnitStateEqualTo(String value) {
            addCriterion("unit_state =", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateNotEqualTo(String value) {
            addCriterion("unit_state <>", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateGreaterThan(String value) {
            addCriterion("unit_state >", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateGreaterThanOrEqualTo(String value) {
            addCriterion("unit_state >=", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateLessThan(String value) {
            addCriterion("unit_state <", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateLessThanOrEqualTo(String value) {
            addCriterion("unit_state <=", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateLike(String value) {
            addCriterion("unit_state like", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateNotLike(String value) {
            addCriterion("unit_state not like", value, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateIn(List<String> values) {
            addCriterion("unit_state in", values, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateNotIn(List<String> values) {
            addCriterion("unit_state not in", values, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateBetween(String value1, String value2) {
            addCriterion("unit_state between", value1, value2, "unitState");
            return (Criteria) this;
        }

        public Criteria andUnitStateNotBetween(String value1, String value2) {
            addCriterion("unit_state not between", value1, value2, "unitState");
            return (Criteria) this;
        }

        public Criteria andRadioEffectIsNull() {
            addCriterion("radio_effect is null");
            return (Criteria) this;
        }

        public Criteria andRadioEffectIsNotNull() {
            addCriterion("radio_effect is not null");
            return (Criteria) this;
        }

        public Criteria andRadioEffectEqualTo(String value) {
            addCriterion("radio_effect =", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectNotEqualTo(String value) {
            addCriterion("radio_effect <>", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectGreaterThan(String value) {
            addCriterion("radio_effect >", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectGreaterThanOrEqualTo(String value) {
            addCriterion("radio_effect >=", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectLessThan(String value) {
            addCriterion("radio_effect <", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectLessThanOrEqualTo(String value) {
            addCriterion("radio_effect <=", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectLike(String value) {
            addCriterion("radio_effect like", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectNotLike(String value) {
            addCriterion("radio_effect not like", value, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectIn(List<String> values) {
            addCriterion("radio_effect in", values, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectNotIn(List<String> values) {
            addCriterion("radio_effect not in", values, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectBetween(String value1, String value2) {
            addCriterion("radio_effect between", value1, value2, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andRadioEffectNotBetween(String value1, String value2) {
            addCriterion("radio_effect not between", value1, value2, "radioEffect");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleIsNull() {
            addCriterion("wano_report_rule is null");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleIsNotNull() {
            addCriterion("wano_report_rule is not null");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleEqualTo(String value) {
            addCriterion("wano_report_rule =", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleNotEqualTo(String value) {
            addCriterion("wano_report_rule <>", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleGreaterThan(String value) {
            addCriterion("wano_report_rule >", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleGreaterThanOrEqualTo(String value) {
            addCriterion("wano_report_rule >=", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleLessThan(String value) {
            addCriterion("wano_report_rule <", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleLessThanOrEqualTo(String value) {
            addCriterion("wano_report_rule <=", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleLike(String value) {
            addCriterion("wano_report_rule like", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleNotLike(String value) {
            addCriterion("wano_report_rule not like", value, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleIn(List<String> values) {
            addCriterion("wano_report_rule in", values, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleNotIn(List<String> values) {
            addCriterion("wano_report_rule not in", values, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleBetween(String value1, String value2) {
            addCriterion("wano_report_rule between", value1, value2, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoReportRuleNotBetween(String value1, String value2) {
            addCriterion("wano_report_rule not between", value1, value2, "wanoReportRule");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultIsNull() {
            addCriterion("wano_event_result is null");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultIsNotNull() {
            addCriterion("wano_event_result is not null");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultEqualTo(String value) {
            addCriterion("wano_event_result =", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultNotEqualTo(String value) {
            addCriterion("wano_event_result <>", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultGreaterThan(String value) {
            addCriterion("wano_event_result >", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultGreaterThanOrEqualTo(String value) {
            addCriterion("wano_event_result >=", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultLessThan(String value) {
            addCriterion("wano_event_result <", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultLessThanOrEqualTo(String value) {
            addCriterion("wano_event_result <=", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultLike(String value) {
            addCriterion("wano_event_result like", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultNotLike(String value) {
            addCriterion("wano_event_result not like", value, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultIn(List<String> values) {
            addCriterion("wano_event_result in", values, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultNotIn(List<String> values) {
            addCriterion("wano_event_result not in", values, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultBetween(String value1, String value2) {
            addCriterion("wano_event_result between", value1, value2, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoEventResultNotBetween(String value1, String value2) {
            addCriterion("wano_event_result not between", value1, value2, "wanoEventResult");
            return (Criteria) this;
        }

        public Criteria andWanoStateIsNull() {
            addCriterion("wano_state is null");
            return (Criteria) this;
        }

        public Criteria andWanoStateIsNotNull() {
            addCriterion("wano_state is not null");
            return (Criteria) this;
        }

        public Criteria andWanoStateEqualTo(String value) {
            addCriterion("wano_state =", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateNotEqualTo(String value) {
            addCriterion("wano_state <>", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateGreaterThan(String value) {
            addCriterion("wano_state >", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateGreaterThanOrEqualTo(String value) {
            addCriterion("wano_state >=", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateLessThan(String value) {
            addCriterion("wano_state <", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateLessThanOrEqualTo(String value) {
            addCriterion("wano_state <=", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateLike(String value) {
            addCriterion("wano_state like", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateNotLike(String value) {
            addCriterion("wano_state not like", value, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateIn(List<String> values) {
            addCriterion("wano_state in", values, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateNotIn(List<String> values) {
            addCriterion("wano_state not in", values, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateBetween(String value1, String value2) {
            addCriterion("wano_state between", value1, value2, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoStateNotBetween(String value1, String value2) {
            addCriterion("wano_state not between", value1, value2, "wanoState");
            return (Criteria) this;
        }

        public Criteria andWanoActivityIsNull() {
            addCriterion("wano_activity is null");
            return (Criteria) this;
        }

        public Criteria andWanoActivityIsNotNull() {
            addCriterion("wano_activity is not null");
            return (Criteria) this;
        }

        public Criteria andWanoActivityEqualTo(String value) {
            addCriterion("wano_activity =", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityNotEqualTo(String value) {
            addCriterion("wano_activity <>", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityGreaterThan(String value) {
            addCriterion("wano_activity >", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityGreaterThanOrEqualTo(String value) {
            addCriterion("wano_activity >=", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityLessThan(String value) {
            addCriterion("wano_activity <", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityLessThanOrEqualTo(String value) {
            addCriterion("wano_activity <=", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityLike(String value) {
            addCriterion("wano_activity like", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityNotLike(String value) {
            addCriterion("wano_activity not like", value, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityIn(List<String> values) {
            addCriterion("wano_activity in", values, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityNotIn(List<String> values) {
            addCriterion("wano_activity not in", values, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityBetween(String value1, String value2) {
            addCriterion("wano_activity between", value1, value2, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoActivityNotBetween(String value1, String value2) {
            addCriterion("wano_activity not between", value1, value2, "wanoActivity");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseIsNull() {
            addCriterion("wano_direct_cause is null");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseIsNotNull() {
            addCriterion("wano_direct_cause is not null");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseEqualTo(String value) {
            addCriterion("wano_direct_cause =", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseNotEqualTo(String value) {
            addCriterion("wano_direct_cause <>", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseGreaterThan(String value) {
            addCriterion("wano_direct_cause >", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseGreaterThanOrEqualTo(String value) {
            addCriterion("wano_direct_cause >=", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseLessThan(String value) {
            addCriterion("wano_direct_cause <", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseLessThanOrEqualTo(String value) {
            addCriterion("wano_direct_cause <=", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseLike(String value) {
            addCriterion("wano_direct_cause like", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseNotLike(String value) {
            addCriterion("wano_direct_cause not like", value, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseIn(List<String> values) {
            addCriterion("wano_direct_cause in", values, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseNotIn(List<String> values) {
            addCriterion("wano_direct_cause not in", values, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseBetween(String value1, String value2) {
            addCriterion("wano_direct_cause between", value1, value2, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoDirectCauseNotBetween(String value1, String value2) {
            addCriterion("wano_direct_cause not between", value1, value2, "wanoDirectCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseIsNull() {
            addCriterion("wano_root_cause is null");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseIsNotNull() {
            addCriterion("wano_root_cause is not null");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseEqualTo(String value) {
            addCriterion("wano_root_cause =", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseNotEqualTo(String value) {
            addCriterion("wano_root_cause <>", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseGreaterThan(String value) {
            addCriterion("wano_root_cause >", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseGreaterThanOrEqualTo(String value) {
            addCriterion("wano_root_cause >=", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseLessThan(String value) {
            addCriterion("wano_root_cause <", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseLessThanOrEqualTo(String value) {
            addCriterion("wano_root_cause <=", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseLike(String value) {
            addCriterion("wano_root_cause like", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseNotLike(String value) {
            addCriterion("wano_root_cause not like", value, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseIn(List<String> values) {
            addCriterion("wano_root_cause in", values, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseNotIn(List<String> values) {
            addCriterion("wano_root_cause not in", values, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseBetween(String value1, String value2) {
            addCriterion("wano_root_cause between", value1, value2, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoRootCauseNotBetween(String value1, String value2) {
            addCriterion("wano_root_cause not between", value1, value2, "wanoRootCause");
            return (Criteria) this;
        }

        public Criteria andWanoFactorIsNull() {
            addCriterion("wano_factor is null");
            return (Criteria) this;
        }

        public Criteria andWanoFactorIsNotNull() {
            addCriterion("wano_factor is not null");
            return (Criteria) this;
        }

        public Criteria andWanoFactorEqualTo(String value) {
            addCriterion("wano_factor =", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorNotEqualTo(String value) {
            addCriterion("wano_factor <>", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorGreaterThan(String value) {
            addCriterion("wano_factor >", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorGreaterThanOrEqualTo(String value) {
            addCriterion("wano_factor >=", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorLessThan(String value) {
            addCriterion("wano_factor <", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorLessThanOrEqualTo(String value) {
            addCriterion("wano_factor <=", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorLike(String value) {
            addCriterion("wano_factor like", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorNotLike(String value) {
            addCriterion("wano_factor not like", value, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorIn(List<String> values) {
            addCriterion("wano_factor in", values, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorNotIn(List<String> values) {
            addCriterion("wano_factor not in", values, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorBetween(String value1, String value2) {
            addCriterion("wano_factor between", value1, value2, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoFactorNotBetween(String value1, String value2) {
            addCriterion("wano_factor not between", value1, value2, "wanoFactor");
            return (Criteria) this;
        }

        public Criteria andWanoSystemIsNull() {
            addCriterion("wano_system is null");
            return (Criteria) this;
        }

        public Criteria andWanoSystemIsNotNull() {
            addCriterion("wano_system is not null");
            return (Criteria) this;
        }

        public Criteria andWanoSystemEqualTo(String value) {
            addCriterion("wano_system =", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemNotEqualTo(String value) {
            addCriterion("wano_system <>", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemGreaterThan(String value) {
            addCriterion("wano_system >", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemGreaterThanOrEqualTo(String value) {
            addCriterion("wano_system >=", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemLessThan(String value) {
            addCriterion("wano_system <", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemLessThanOrEqualTo(String value) {
            addCriterion("wano_system <=", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemLike(String value) {
            addCriterion("wano_system like", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemNotLike(String value) {
            addCriterion("wano_system not like", value, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemIn(List<String> values) {
            addCriterion("wano_system in", values, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemNotIn(List<String> values) {
            addCriterion("wano_system not in", values, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemBetween(String value1, String value2) {
            addCriterion("wano_system between", value1, value2, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoSystemNotBetween(String value1, String value2) {
            addCriterion("wano_system not between", value1, value2, "wanoSystem");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentIsNull() {
            addCriterion("wano_equipment is null");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentIsNotNull() {
            addCriterion("wano_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentEqualTo(String value) {
            addCriterion("wano_equipment =", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentNotEqualTo(String value) {
            addCriterion("wano_equipment <>", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentGreaterThan(String value) {
            addCriterion("wano_equipment >", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("wano_equipment >=", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentLessThan(String value) {
            addCriterion("wano_equipment <", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentLessThanOrEqualTo(String value) {
            addCriterion("wano_equipment <=", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentLike(String value) {
            addCriterion("wano_equipment like", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentNotLike(String value) {
            addCriterion("wano_equipment not like", value, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentIn(List<String> values) {
            addCriterion("wano_equipment in", values, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentNotIn(List<String> values) {
            addCriterion("wano_equipment not in", values, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentBetween(String value1, String value2) {
            addCriterion("wano_equipment between", value1, value2, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoEquipmentNotBetween(String value1, String value2) {
            addCriterion("wano_equipment not between", value1, value2, "wanoEquipment");
            return (Criteria) this;
        }

        public Criteria andWanoTeamIsNull() {
            addCriterion("wano_team is null");
            return (Criteria) this;
        }

        public Criteria andWanoTeamIsNotNull() {
            addCriterion("wano_team is not null");
            return (Criteria) this;
        }

        public Criteria andWanoTeamEqualTo(String value) {
            addCriterion("wano_team =", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamNotEqualTo(String value) {
            addCriterion("wano_team <>", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamGreaterThan(String value) {
            addCriterion("wano_team >", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamGreaterThanOrEqualTo(String value) {
            addCriterion("wano_team >=", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamLessThan(String value) {
            addCriterion("wano_team <", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamLessThanOrEqualTo(String value) {
            addCriterion("wano_team <=", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamLike(String value) {
            addCriterion("wano_team like", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamNotLike(String value) {
            addCriterion("wano_team not like", value, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamIn(List<String> values) {
            addCriterion("wano_team in", values, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamNotIn(List<String> values) {
            addCriterion("wano_team not in", values, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamBetween(String value1, String value2) {
            addCriterion("wano_team between", value1, value2, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andWanoTeamNotBetween(String value1, String value2) {
            addCriterion("wano_team not between", value1, value2, "wanoTeam");
            return (Criteria) this;
        }

        public Criteria andEventPropertyIsNull() {
            addCriterion("event_property is null");
            return (Criteria) this;
        }

        public Criteria andEventPropertyIsNotNull() {
            addCriterion("event_property is not null");
            return (Criteria) this;
        }

        public Criteria andEventPropertyEqualTo(String value) {
            addCriterion("event_property =", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyNotEqualTo(String value) {
            addCriterion("event_property <>", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyGreaterThan(String value) {
            addCriterion("event_property >", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("event_property >=", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyLessThan(String value) {
            addCriterion("event_property <", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyLessThanOrEqualTo(String value) {
            addCriterion("event_property <=", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyLike(String value) {
            addCriterion("event_property like", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyNotLike(String value) {
            addCriterion("event_property not like", value, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyIn(List<String> values) {
            addCriterion("event_property in", values, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyNotIn(List<String> values) {
            addCriterion("event_property not in", values, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyBetween(String value1, String value2) {
            addCriterion("event_property between", value1, value2, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andEventPropertyNotBetween(String value1, String value2) {
            addCriterion("event_property not between", value1, value2, "eventProperty");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopIsNull() {
            addCriterion("not_plan_stop is null");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopIsNotNull() {
            addCriterion("not_plan_stop is not null");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopEqualTo(String value) {
            addCriterion("not_plan_stop =", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopNotEqualTo(String value) {
            addCriterion("not_plan_stop <>", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopGreaterThan(String value) {
            addCriterion("not_plan_stop >", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopGreaterThanOrEqualTo(String value) {
            addCriterion("not_plan_stop >=", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopLessThan(String value) {
            addCriterion("not_plan_stop <", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopLessThanOrEqualTo(String value) {
            addCriterion("not_plan_stop <=", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopLike(String value) {
            addCriterion("not_plan_stop like", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopNotLike(String value) {
            addCriterion("not_plan_stop not like", value, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopIn(List<String> values) {
            addCriterion("not_plan_stop in", values, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopNotIn(List<String> values) {
            addCriterion("not_plan_stop not in", values, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopBetween(String value1, String value2) {
            addCriterion("not_plan_stop between", value1, value2, "notPlanStop");
            return (Criteria) this;
        }

        public Criteria andNotPlanStopNotBetween(String value1, String value2) {
            addCriterion("not_plan_stop not between", value1, value2, "notPlanStop");
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