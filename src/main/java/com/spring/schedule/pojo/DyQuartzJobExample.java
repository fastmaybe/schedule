package com.spring.schedule.pojo;

import java.util.ArrayList;
import java.util.List;

public class DyQuartzJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DyQuartzJobExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("`desc` is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("`desc` is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("`desc` =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("`desc` <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("`desc` >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("`desc` >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("`desc` <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("`desc` <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("`desc` like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("`desc` not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("`desc` in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("`desc` not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("`desc` between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("`desc` not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andGroupIsNull() {
            addCriterion("`group` is null");
            return (Criteria) this;
        }

        public Criteria andGroupIsNotNull() {
            addCriterion("`group` is not null");
            return (Criteria) this;
        }

        public Criteria andGroupEqualTo(String value) {
            addCriterion("`group` =", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotEqualTo(String value) {
            addCriterion("`group` <>", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupGreaterThan(String value) {
            addCriterion("`group` >", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupGreaterThanOrEqualTo(String value) {
            addCriterion("`group` >=", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLessThan(String value) {
            addCriterion("`group` <", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLessThanOrEqualTo(String value) {
            addCriterion("`group` <=", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLike(String value) {
            addCriterion("`group` like", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotLike(String value) {
            addCriterion("`group` not like", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupIn(List<String> values) {
            addCriterion("`group` in", values, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotIn(List<String> values) {
            addCriterion("`group` not in", values, "group");
            return (Criteria) this;
        }

        public Criteria andGroupBetween(String value1, String value2) {
            addCriterion("`group` between", value1, value2, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotBetween(String value1, String value2) {
            addCriterion("`group` not between", value1, value2, "group");
            return (Criteria) this;
        }

        public Criteria andInvokeClassIsNull() {
            addCriterion("invoke_class is null");
            return (Criteria) this;
        }

        public Criteria andInvokeClassIsNotNull() {
            addCriterion("invoke_class is not null");
            return (Criteria) this;
        }

        public Criteria andInvokeClassEqualTo(String value) {
            addCriterion("invoke_class =", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassNotEqualTo(String value) {
            addCriterion("invoke_class <>", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassGreaterThan(String value) {
            addCriterion("invoke_class >", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassGreaterThanOrEqualTo(String value) {
            addCriterion("invoke_class >=", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassLessThan(String value) {
            addCriterion("invoke_class <", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassLessThanOrEqualTo(String value) {
            addCriterion("invoke_class <=", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassLike(String value) {
            addCriterion("invoke_class like", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassNotLike(String value) {
            addCriterion("invoke_class not like", value, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassIn(List<String> values) {
            addCriterion("invoke_class in", values, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassNotIn(List<String> values) {
            addCriterion("invoke_class not in", values, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassBetween(String value1, String value2) {
            addCriterion("invoke_class between", value1, value2, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeClassNotBetween(String value1, String value2) {
            addCriterion("invoke_class not between", value1, value2, "invokeClass");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodIsNull() {
            addCriterion("invoke_method is null");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodIsNotNull() {
            addCriterion("invoke_method is not null");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodEqualTo(String value) {
            addCriterion("invoke_method =", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodNotEqualTo(String value) {
            addCriterion("invoke_method <>", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodGreaterThan(String value) {
            addCriterion("invoke_method >", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodGreaterThanOrEqualTo(String value) {
            addCriterion("invoke_method >=", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodLessThan(String value) {
            addCriterion("invoke_method <", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodLessThanOrEqualTo(String value) {
            addCriterion("invoke_method <=", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodLike(String value) {
            addCriterion("invoke_method like", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodNotLike(String value) {
            addCriterion("invoke_method not like", value, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodIn(List<String> values) {
            addCriterion("invoke_method in", values, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodNotIn(List<String> values) {
            addCriterion("invoke_method not in", values, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodBetween(String value1, String value2) {
            addCriterion("invoke_method between", value1, value2, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andInvokeMethodNotBetween(String value1, String value2) {
            addCriterion("invoke_method not between", value1, value2, "invokeMethod");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("params is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("params is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("params =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("params <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("params >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("params >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("params <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("params <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("params like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("params not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("params in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("params not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("params between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("params not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andCronIsNull() {
            addCriterion("cron is null");
            return (Criteria) this;
        }

        public Criteria andCronIsNotNull() {
            addCriterion("cron is not null");
            return (Criteria) this;
        }

        public Criteria andCronEqualTo(String value) {
            addCriterion("cron =", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotEqualTo(String value) {
            addCriterion("cron <>", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThan(String value) {
            addCriterion("cron >", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThanOrEqualTo(String value) {
            addCriterion("cron >=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThan(String value) {
            addCriterion("cron <", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThanOrEqualTo(String value) {
            addCriterion("cron <=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLike(String value) {
            addCriterion("cron like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotLike(String value) {
            addCriterion("cron not like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronIn(List<String> values) {
            addCriterion("cron in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotIn(List<String> values) {
            addCriterion("cron not in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronBetween(String value1, String value2) {
            addCriterion("cron between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotBetween(String value1, String value2) {
            addCriterion("cron not between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyIsNull() {
            addCriterion("misFirePolicy is null");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyIsNotNull() {
            addCriterion("misFirePolicy is not null");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyEqualTo(Integer value) {
            addCriterion("misFirePolicy =", value, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyNotEqualTo(Integer value) {
            addCriterion("misFirePolicy <>", value, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyGreaterThan(Integer value) {
            addCriterion("misFirePolicy >", value, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyGreaterThanOrEqualTo(Integer value) {
            addCriterion("misFirePolicy >=", value, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyLessThan(Integer value) {
            addCriterion("misFirePolicy <", value, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyLessThanOrEqualTo(Integer value) {
            addCriterion("misFirePolicy <=", value, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyIn(List<Integer> values) {
            addCriterion("misFirePolicy in", values, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyNotIn(List<Integer> values) {
            addCriterion("misFirePolicy not in", values, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyBetween(Integer value1, Integer value2) {
            addCriterion("misFirePolicy between", value1, value2, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirepolicyNotBetween(Integer value1, Integer value2) {
            addCriterion("misFirePolicy not between", value1, value2, "misfirepolicy");
            return (Criteria) this;
        }

        public Criteria andConcurrentIsNull() {
            addCriterion("concurrent is null");
            return (Criteria) this;
        }

        public Criteria andConcurrentIsNotNull() {
            addCriterion("concurrent is not null");
            return (Criteria) this;
        }

        public Criteria andConcurrentEqualTo(Integer value) {
            addCriterion("concurrent =", value, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentNotEqualTo(Integer value) {
            addCriterion("concurrent <>", value, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentGreaterThan(Integer value) {
            addCriterion("concurrent >", value, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("concurrent >=", value, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentLessThan(Integer value) {
            addCriterion("concurrent <", value, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentLessThanOrEqualTo(Integer value) {
            addCriterion("concurrent <=", value, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentIn(List<Integer> values) {
            addCriterion("concurrent in", values, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentNotIn(List<Integer> values) {
            addCriterion("concurrent not in", values, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentBetween(Integer value1, Integer value2) {
            addCriterion("concurrent between", value1, value2, "concurrent");
            return (Criteria) this;
        }

        public Criteria andConcurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("concurrent not between", value1, value2, "concurrent");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
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