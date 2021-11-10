package com.fc.v2.iotmanage.model.respone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmokeInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public SmokeInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
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
     * This method corresponds to the database table smoke_info
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
     * This method corresponds to the database table smoke_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smoke_info
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
     * This class corresponds to the database table smoke_info
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

        public Criteria andSmokeIdIsNull() {
            addCriterion("smoke_id is null");
            return (Criteria) this;
        }

        public Criteria andSmokeIdIsNotNull() {
            addCriterion("smoke_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeIdEqualTo(Integer value) {
            addCriterion("smoke_id =", value, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdNotEqualTo(Integer value) {
            addCriterion("smoke_id <>", value, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdGreaterThan(Integer value) {
            addCriterion("smoke_id >", value, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("smoke_id >=", value, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdLessThan(Integer value) {
            addCriterion("smoke_id <", value, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdLessThanOrEqualTo(Integer value) {
            addCriterion("smoke_id <=", value, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdIn(List<Integer> values) {
            addCriterion("smoke_id in", values, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdNotIn(List<Integer> values) {
            addCriterion("smoke_id not in", values, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdBetween(Integer value1, Integer value2) {
            addCriterion("smoke_id between", value1, value2, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("smoke_id not between", value1, value2, "smokeId");
            return (Criteria) this;
        }

        public Criteria andSmokeNameIsNull() {
            addCriterion("smoke_name is null");
            return (Criteria) this;
        }

        public Criteria andSmokeNameIsNotNull() {
            addCriterion("smoke_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeNameEqualTo(String value) {
            addCriterion("smoke_name =", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameNotEqualTo(String value) {
            addCriterion("smoke_name <>", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameGreaterThan(String value) {
            addCriterion("smoke_name >", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameGreaterThanOrEqualTo(String value) {
            addCriterion("smoke_name >=", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameLessThan(String value) {
            addCriterion("smoke_name <", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameLessThanOrEqualTo(String value) {
            addCriterion("smoke_name <=", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameLike(String value) {
            addCriterion("smoke_name like", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameNotLike(String value) {
            addCriterion("smoke_name not like", value, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameIn(List<String> values) {
            addCriterion("smoke_name in", values, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameNotIn(List<String> values) {
            addCriterion("smoke_name not in", values, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameBetween(String value1, String value2) {
            addCriterion("smoke_name between", value1, value2, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeNameNotBetween(String value1, String value2) {
            addCriterion("smoke_name not between", value1, value2, "smokeName");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusIsNull() {
            addCriterion("smoke_status is null");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusIsNotNull() {
            addCriterion("smoke_status is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusEqualTo(String value) {
            addCriterion("smoke_status =", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusNotEqualTo(String value) {
            addCriterion("smoke_status <>", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusGreaterThan(String value) {
            addCriterion("smoke_status >", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("smoke_status >=", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusLessThan(String value) {
            addCriterion("smoke_status <", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusLessThanOrEqualTo(String value) {
            addCriterion("smoke_status <=", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusLike(String value) {
            addCriterion("smoke_status like", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusNotLike(String value) {
            addCriterion("smoke_status not like", value, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusIn(List<String> values) {
            addCriterion("smoke_status in", values, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusNotIn(List<String> values) {
            addCriterion("smoke_status not in", values, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusBetween(String value1, String value2) {
            addCriterion("smoke_status between", value1, value2, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeStatusNotBetween(String value1, String value2) {
            addCriterion("smoke_status not between", value1, value2, "smokeStatus");
            return (Criteria) this;
        }

        public Criteria andSmokeEleIsNull() {
            addCriterion("smoke_ele is null");
            return (Criteria) this;
        }

        public Criteria andSmokeEleIsNotNull() {
            addCriterion("smoke_ele is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeEleEqualTo(String value) {
            addCriterion("smoke_ele =", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleNotEqualTo(String value) {
            addCriterion("smoke_ele <>", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleGreaterThan(String value) {
            addCriterion("smoke_ele >", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleGreaterThanOrEqualTo(String value) {
            addCriterion("smoke_ele >=", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleLessThan(String value) {
            addCriterion("smoke_ele <", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleLessThanOrEqualTo(String value) {
            addCriterion("smoke_ele <=", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleLike(String value) {
            addCriterion("smoke_ele like", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleNotLike(String value) {
            addCriterion("smoke_ele not like", value, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleIn(List<String> values) {
            addCriterion("smoke_ele in", values, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleNotIn(List<String> values) {
            addCriterion("smoke_ele not in", values, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleBetween(String value1, String value2) {
            addCriterion("smoke_ele between", value1, value2, "smokeEle");
            return (Criteria) this;
        }

        public Criteria andSmokeEleNotBetween(String value1, String value2) {
            addCriterion("smoke_ele not between", value1, value2, "smokeEle");
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
     * This class corresponds to the database table smoke_info
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
     * This class corresponds to the database table smoke_info
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