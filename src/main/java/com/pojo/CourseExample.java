package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursetecherIsNull() {
            addCriterion("coursetecher is null");
            return (Criteria) this;
        }

        public Criteria andCoursetecherIsNotNull() {
            addCriterion("coursetecher is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetecherEqualTo(String value) {
            addCriterion("coursetecher =", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherNotEqualTo(String value) {
            addCriterion("coursetecher <>", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherGreaterThan(String value) {
            addCriterion("coursetecher >", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherGreaterThanOrEqualTo(String value) {
            addCriterion("coursetecher >=", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherLessThan(String value) {
            addCriterion("coursetecher <", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherLessThanOrEqualTo(String value) {
            addCriterion("coursetecher <=", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherLike(String value) {
            addCriterion("coursetecher like", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherNotLike(String value) {
            addCriterion("coursetecher not like", value, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherIn(List<String> values) {
            addCriterion("coursetecher in", values, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherNotIn(List<String> values) {
            addCriterion("coursetecher not in", values, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherBetween(String value1, String value2) {
            addCriterion("coursetecher between", value1, value2, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursetecherNotBetween(String value1, String value2) {
            addCriterion("coursetecher not between", value1, value2, "coursetecher");
            return (Criteria) this;
        }

        public Criteria andCoursechapterIsNull() {
            addCriterion("coursechapter is null");
            return (Criteria) this;
        }

        public Criteria andCoursechapterIsNotNull() {
            addCriterion("coursechapter is not null");
            return (Criteria) this;
        }

        public Criteria andCoursechapterEqualTo(Integer value) {
            addCriterion("coursechapter =", value, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterNotEqualTo(Integer value) {
            addCriterion("coursechapter <>", value, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterGreaterThan(Integer value) {
            addCriterion("coursechapter >", value, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursechapter >=", value, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterLessThan(Integer value) {
            addCriterion("coursechapter <", value, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterLessThanOrEqualTo(Integer value) {
            addCriterion("coursechapter <=", value, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterIn(List<Integer> values) {
            addCriterion("coursechapter in", values, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterNotIn(List<Integer> values) {
            addCriterion("coursechapter not in", values, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterBetween(Integer value1, Integer value2) {
            addCriterion("coursechapter between", value1, value2, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCoursechapterNotBetween(Integer value1, Integer value2) {
            addCriterion("coursechapter not between", value1, value2, "coursechapter");
            return (Criteria) this;
        }

        public Criteria andCourseunitIsNull() {
            addCriterion("courseunit is null");
            return (Criteria) this;
        }

        public Criteria andCourseunitIsNotNull() {
            addCriterion("courseunit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseunitEqualTo(Integer value) {
            addCriterion("courseunit =", value, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitNotEqualTo(Integer value) {
            addCriterion("courseunit <>", value, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitGreaterThan(Integer value) {
            addCriterion("courseunit >", value, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseunit >=", value, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitLessThan(Integer value) {
            addCriterion("courseunit <", value, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitLessThanOrEqualTo(Integer value) {
            addCriterion("courseunit <=", value, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitIn(List<Integer> values) {
            addCriterion("courseunit in", values, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitNotIn(List<Integer> values) {
            addCriterion("courseunit not in", values, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitBetween(Integer value1, Integer value2) {
            addCriterion("courseunit between", value1, value2, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCourseunitNotBetween(Integer value1, Integer value2) {
            addCriterion("courseunit not between", value1, value2, "courseunit");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoIsNull() {
            addCriterion("coursechapterinfo is null");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoIsNotNull() {
            addCriterion("coursechapterinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoEqualTo(String value) {
            addCriterion("coursechapterinfo =", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoNotEqualTo(String value) {
            addCriterion("coursechapterinfo <>", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoGreaterThan(String value) {
            addCriterion("coursechapterinfo >", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoGreaterThanOrEqualTo(String value) {
            addCriterion("coursechapterinfo >=", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoLessThan(String value) {
            addCriterion("coursechapterinfo <", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoLessThanOrEqualTo(String value) {
            addCriterion("coursechapterinfo <=", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoLike(String value) {
            addCriterion("coursechapterinfo like", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoNotLike(String value) {
            addCriterion("coursechapterinfo not like", value, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoIn(List<String> values) {
            addCriterion("coursechapterinfo in", values, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoNotIn(List<String> values) {
            addCriterion("coursechapterinfo not in", values, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoBetween(String value1, String value2) {
            addCriterion("coursechapterinfo between", value1, value2, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCoursechapterinfoNotBetween(String value1, String value2) {
            addCriterion("coursechapterinfo not between", value1, value2, "coursechapterinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoIsNull() {
            addCriterion("courseunitinfo is null");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoIsNotNull() {
            addCriterion("courseunitinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoEqualTo(String value) {
            addCriterion("courseunitinfo =", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoNotEqualTo(String value) {
            addCriterion("courseunitinfo <>", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoGreaterThan(String value) {
            addCriterion("courseunitinfo >", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoGreaterThanOrEqualTo(String value) {
            addCriterion("courseunitinfo >=", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoLessThan(String value) {
            addCriterion("courseunitinfo <", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoLessThanOrEqualTo(String value) {
            addCriterion("courseunitinfo <=", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoLike(String value) {
            addCriterion("courseunitinfo like", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoNotLike(String value) {
            addCriterion("courseunitinfo not like", value, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoIn(List<String> values) {
            addCriterion("courseunitinfo in", values, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoNotIn(List<String> values) {
            addCriterion("courseunitinfo not in", values, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoBetween(String value1, String value2) {
            addCriterion("courseunitinfo between", value1, value2, "courseunitinfo");
            return (Criteria) this;
        }

        public Criteria andCourseunitinfoNotBetween(String value1, String value2) {
            addCriterion("courseunitinfo not between", value1, value2, "courseunitinfo");
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