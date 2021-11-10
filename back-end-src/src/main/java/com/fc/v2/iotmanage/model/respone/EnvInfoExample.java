package com.fc.v2.iotmanage.model.respone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnvInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table env_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table env_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table env_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public EnvInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table env_info
     *
     * @mbg.generated
     */
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

        public Criteria andEnvIdIsNull() {
            addCriterion("env_id is null");
            return (Criteria) this;
        }

        public Criteria andEnvIdIsNotNull() {
            addCriterion("env_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnvIdEqualTo(Integer value) {
            addCriterion("env_id =", value, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdNotEqualTo(Integer value) {
            addCriterion("env_id <>", value, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdGreaterThan(Integer value) {
            addCriterion("env_id >", value, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("env_id >=", value, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdLessThan(Integer value) {
            addCriterion("env_id <", value, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdLessThanOrEqualTo(Integer value) {
            addCriterion("env_id <=", value, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdIn(List<Integer> values) {
            addCriterion("env_id in", values, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdNotIn(List<Integer> values) {
            addCriterion("env_id not in", values, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdBetween(Integer value1, Integer value2) {
            addCriterion("env_id between", value1, value2, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("env_id not between", value1, value2, "envId");
            return (Criteria) this;
        }

        public Criteria andEnvNameIsNull() {
            addCriterion("env_name is null");
            return (Criteria) this;
        }

        public Criteria andEnvNameIsNotNull() {
            addCriterion("env_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnvNameEqualTo(String value) {
            addCriterion("env_name =", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameNotEqualTo(String value) {
            addCriterion("env_name <>", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameGreaterThan(String value) {
            addCriterion("env_name >", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameGreaterThanOrEqualTo(String value) {
            addCriterion("env_name >=", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameLessThan(String value) {
            addCriterion("env_name <", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameLessThanOrEqualTo(String value) {
            addCriterion("env_name <=", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameLike(String value) {
            addCriterion("env_name like", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameNotLike(String value) {
            addCriterion("env_name not like", value, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameIn(List<String> values) {
            addCriterion("env_name in", values, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameNotIn(List<String> values) {
            addCriterion("env_name not in", values, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameBetween(String value1, String value2) {
            addCriterion("env_name between", value1, value2, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvNameNotBetween(String value1, String value2) {
            addCriterion("env_name not between", value1, value2, "envName");
            return (Criteria) this;
        }

        public Criteria andEnvTempIsNull() {
            addCriterion("env_temp is null");
            return (Criteria) this;
        }

        public Criteria andEnvTempIsNotNull() {
            addCriterion("env_temp is not null");
            return (Criteria) this;
        }

        public Criteria andEnvTempEqualTo(String value) {
            addCriterion("env_temp =", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempNotEqualTo(String value) {
            addCriterion("env_temp <>", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempGreaterThan(String value) {
            addCriterion("env_temp >", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempGreaterThanOrEqualTo(String value) {
            addCriterion("env_temp >=", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempLessThan(String value) {
            addCriterion("env_temp <", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempLessThanOrEqualTo(String value) {
            addCriterion("env_temp <=", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempLike(String value) {
            addCriterion("env_temp like", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempNotLike(String value) {
            addCriterion("env_temp not like", value, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempIn(List<String> values) {
            addCriterion("env_temp in", values, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempNotIn(List<String> values) {
            addCriterion("env_temp not in", values, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempBetween(String value1, String value2) {
            addCriterion("env_temp between", value1, value2, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvTempNotBetween(String value1, String value2) {
            addCriterion("env_temp not between", value1, value2, "envTemp");
            return (Criteria) this;
        }

        public Criteria andEnvHumIsNull() {
            addCriterion("env_hum is null");
            return (Criteria) this;
        }

        public Criteria andEnvHumIsNotNull() {
            addCriterion("env_hum is not null");
            return (Criteria) this;
        }

        public Criteria andEnvHumEqualTo(String value) {
            addCriterion("env_hum =", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumNotEqualTo(String value) {
            addCriterion("env_hum <>", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumGreaterThan(String value) {
            addCriterion("env_hum >", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumGreaterThanOrEqualTo(String value) {
            addCriterion("env_hum >=", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumLessThan(String value) {
            addCriterion("env_hum <", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumLessThanOrEqualTo(String value) {
            addCriterion("env_hum <=", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumLike(String value) {
            addCriterion("env_hum like", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumNotLike(String value) {
            addCriterion("env_hum not like", value, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumIn(List<String> values) {
            addCriterion("env_hum in", values, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumNotIn(List<String> values) {
            addCriterion("env_hum not in", values, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumBetween(String value1, String value2) {
            addCriterion("env_hum between", value1, value2, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvHumNotBetween(String value1, String value2) {
            addCriterion("env_hum not between", value1, value2, "envHum");
            return (Criteria) this;
        }

        public Criteria andEnvEleIsNull() {
            addCriterion("env_ele is null");
            return (Criteria) this;
        }

        public Criteria andEnvEleIsNotNull() {
            addCriterion("env_ele is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEleEqualTo(String value) {
            addCriterion("env_ele =", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleNotEqualTo(String value) {
            addCriterion("env_ele <>", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleGreaterThan(String value) {
            addCriterion("env_ele >", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleGreaterThanOrEqualTo(String value) {
            addCriterion("env_ele >=", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleLessThan(String value) {
            addCriterion("env_ele <", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleLessThanOrEqualTo(String value) {
            addCriterion("env_ele <=", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleLike(String value) {
            addCriterion("env_ele like", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleNotLike(String value) {
            addCriterion("env_ele not like", value, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleIn(List<String> values) {
            addCriterion("env_ele in", values, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleNotIn(List<String> values) {
            addCriterion("env_ele not in", values, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleBetween(String value1, String value2) {
            addCriterion("env_ele between", value1, value2, "envEle");
            return (Criteria) this;
        }

        public Criteria andEnvEleNotBetween(String value1, String value2) {
            addCriterion("env_ele not between", value1, value2, "envEle");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table env_info
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table env_info
     *
     * @mbg.generated
     */
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