package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class questionbankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public questionbankExample() {
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

        public Criteria andBankidIsNull() {
            addCriterion("bankid is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankid is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Integer value) {
            addCriterion("bankid =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Integer value) {
            addCriterion("bankid <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Integer value) {
            addCriterion("bankid >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankid >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Integer value) {
            addCriterion("bankid <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Integer value) {
            addCriterion("bankid <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Integer> values) {
            addCriterion("bankid in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Integer> values) {
            addCriterion("bankid not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Integer value1, Integer value2) {
            addCriterion("bankid between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Integer value1, Integer value2) {
            addCriterion("bankid not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andQuetionIsNull() {
            addCriterion("quetion is null");
            return (Criteria) this;
        }

        public Criteria andQuetionIsNotNull() {
            addCriterion("quetion is not null");
            return (Criteria) this;
        }

        public Criteria andQuetionEqualTo(String value) {
            addCriterion("quetion =", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionNotEqualTo(String value) {
            addCriterion("quetion <>", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionGreaterThan(String value) {
            addCriterion("quetion >", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionGreaterThanOrEqualTo(String value) {
            addCriterion("quetion >=", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionLessThan(String value) {
            addCriterion("quetion <", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionLessThanOrEqualTo(String value) {
            addCriterion("quetion <=", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionLike(String value) {
            addCriterion("quetion like", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionNotLike(String value) {
            addCriterion("quetion not like", value, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionIn(List<String> values) {
            addCriterion("quetion in", values, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionNotIn(List<String> values) {
            addCriterion("quetion not in", values, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionBetween(String value1, String value2) {
            addCriterion("quetion between", value1, value2, "quetion");
            return (Criteria) this;
        }

        public Criteria andQuetionNotBetween(String value1, String value2) {
            addCriterion("quetion not between", value1, value2, "quetion");
            return (Criteria) this;
        }

        public Criteria andAnsweraIsNull() {
            addCriterion("answerA is null");
            return (Criteria) this;
        }

        public Criteria andAnsweraIsNotNull() {
            addCriterion("answerA is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweraEqualTo(String value) {
            addCriterion("answerA =", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotEqualTo(String value) {
            addCriterion("answerA <>", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraGreaterThan(String value) {
            addCriterion("answerA >", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraGreaterThanOrEqualTo(String value) {
            addCriterion("answerA >=", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLessThan(String value) {
            addCriterion("answerA <", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLessThanOrEqualTo(String value) {
            addCriterion("answerA <=", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLike(String value) {
            addCriterion("answerA like", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotLike(String value) {
            addCriterion("answerA not like", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraIn(List<String> values) {
            addCriterion("answerA in", values, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotIn(List<String> values) {
            addCriterion("answerA not in", values, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraBetween(String value1, String value2) {
            addCriterion("answerA between", value1, value2, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotBetween(String value1, String value2) {
            addCriterion("answerA not between", value1, value2, "answera");
            return (Criteria) this;
        }

        public Criteria andAnswerbIsNull() {
            addCriterion("answerB is null");
            return (Criteria) this;
        }

        public Criteria andAnswerbIsNotNull() {
            addCriterion("answerB is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerbEqualTo(String value) {
            addCriterion("answerB =", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotEqualTo(String value) {
            addCriterion("answerB <>", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbGreaterThan(String value) {
            addCriterion("answerB >", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbGreaterThanOrEqualTo(String value) {
            addCriterion("answerB >=", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLessThan(String value) {
            addCriterion("answerB <", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLessThanOrEqualTo(String value) {
            addCriterion("answerB <=", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLike(String value) {
            addCriterion("answerB like", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotLike(String value) {
            addCriterion("answerB not like", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbIn(List<String> values) {
            addCriterion("answerB in", values, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotIn(List<String> values) {
            addCriterion("answerB not in", values, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbBetween(String value1, String value2) {
            addCriterion("answerB between", value1, value2, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotBetween(String value1, String value2) {
            addCriterion("answerB not between", value1, value2, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswercIsNull() {
            addCriterion("answerC is null");
            return (Criteria) this;
        }

        public Criteria andAnswercIsNotNull() {
            addCriterion("answerC is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercEqualTo(String value) {
            addCriterion("answerC =", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotEqualTo(String value) {
            addCriterion("answerC <>", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercGreaterThan(String value) {
            addCriterion("answerC >", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercGreaterThanOrEqualTo(String value) {
            addCriterion("answerC >=", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLessThan(String value) {
            addCriterion("answerC <", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLessThanOrEqualTo(String value) {
            addCriterion("answerC <=", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLike(String value) {
            addCriterion("answerC like", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotLike(String value) {
            addCriterion("answerC not like", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercIn(List<String> values) {
            addCriterion("answerC in", values, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotIn(List<String> values) {
            addCriterion("answerC not in", values, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercBetween(String value1, String value2) {
            addCriterion("answerC between", value1, value2, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotBetween(String value1, String value2) {
            addCriterion("answerC not between", value1, value2, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswerdIsNull() {
            addCriterion("answerD is null");
            return (Criteria) this;
        }

        public Criteria andAnswerdIsNotNull() {
            addCriterion("answerD is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerdEqualTo(String value) {
            addCriterion("answerD =", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotEqualTo(String value) {
            addCriterion("answerD <>", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdGreaterThan(String value) {
            addCriterion("answerD >", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdGreaterThanOrEqualTo(String value) {
            addCriterion("answerD >=", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLessThan(String value) {
            addCriterion("answerD <", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLessThanOrEqualTo(String value) {
            addCriterion("answerD <=", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLike(String value) {
            addCriterion("answerD like", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotLike(String value) {
            addCriterion("answerD not like", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdIn(List<String> values) {
            addCriterion("answerD in", values, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotIn(List<String> values) {
            addCriterion("answerD not in", values, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdBetween(String value1, String value2) {
            addCriterion("answerD between", value1, value2, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotBetween(String value1, String value2) {
            addCriterion("answerD not between", value1, value2, "answerd");
            return (Criteria) this;
        }

        public Criteria andRightsanswerIsNull() {
            addCriterion("rightsanswer is null");
            return (Criteria) this;
        }

        public Criteria andRightsanswerIsNotNull() {
            addCriterion("rightsanswer is not null");
            return (Criteria) this;
        }

        public Criteria andRightsanswerEqualTo(String value) {
            addCriterion("rightsanswer =", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerNotEqualTo(String value) {
            addCriterion("rightsanswer <>", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerGreaterThan(String value) {
            addCriterion("rightsanswer >", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerGreaterThanOrEqualTo(String value) {
            addCriterion("rightsanswer >=", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerLessThan(String value) {
            addCriterion("rightsanswer <", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerLessThanOrEqualTo(String value) {
            addCriterion("rightsanswer <=", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerLike(String value) {
            addCriterion("rightsanswer like", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerNotLike(String value) {
            addCriterion("rightsanswer not like", value, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerIn(List<String> values) {
            addCriterion("rightsanswer in", values, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerNotIn(List<String> values) {
            addCriterion("rightsanswer not in", values, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerBetween(String value1, String value2) {
            addCriterion("rightsanswer between", value1, value2, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andRightsanswerNotBetween(String value1, String value2) {
            addCriterion("rightsanswer not between", value1, value2, "rightsanswer");
            return (Criteria) this;
        }

        public Criteria andIsmultipleIsNull() {
            addCriterion("ismultiple is null");
            return (Criteria) this;
        }

        public Criteria andIsmultipleIsNotNull() {
            addCriterion("ismultiple is not null");
            return (Criteria) this;
        }

        public Criteria andIsmultipleEqualTo(Integer value) {
            addCriterion("ismultiple =", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleNotEqualTo(Integer value) {
            addCriterion("ismultiple <>", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleGreaterThan(Integer value) {
            addCriterion("ismultiple >", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismultiple >=", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleLessThan(Integer value) {
            addCriterion("ismultiple <", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleLessThanOrEqualTo(Integer value) {
            addCriterion("ismultiple <=", value, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleIn(List<Integer> values) {
            addCriterion("ismultiple in", values, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleNotIn(List<Integer> values) {
            addCriterion("ismultiple not in", values, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleBetween(Integer value1, Integer value2) {
            addCriterion("ismultiple between", value1, value2, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andIsmultipleNotBetween(Integer value1, Integer value2) {
            addCriterion("ismultiple not between", value1, value2, "ismultiple");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
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