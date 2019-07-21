package com.ryt.demo.dal.mssql.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected Integer offSet;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOffSet(Integer offSet) {
        this.offSet = offSet;
    }

    public Integer getOffSet() {
        return offSet;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
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

        public Criteria andPKIDIsNull() {
            addCriterion("PKID is null");
            return (Criteria) this;
        }

        public Criteria andPKIDIsNotNull() {
            addCriterion("PKID is not null");
            return (Criteria) this;
        }

        public Criteria andPKIDEqualTo(Integer value) {
            addCriterion("PKID =", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDNotEqualTo(Integer value) {
            addCriterion("PKID <>", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDGreaterThan(Integer value) {
            addCriterion("PKID >", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PKID >=", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDLessThan(Integer value) {
            addCriterion("PKID <", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDLessThanOrEqualTo(Integer value) {
            addCriterion("PKID <=", value, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDIn(List<Integer> values) {
            addCriterion("PKID in", values, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDNotIn(List<Integer> values) {
            addCriterion("PKID not in", values, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDBetween(Integer value1, Integer value2) {
            addCriterion("PKID between", value1, value2, "PKID");
            return (Criteria) this;
        }

        public Criteria andPKIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PKID not between", value1, value2, "PKID");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("OrderNo like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("UserID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("UserID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("UserID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("UserID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("UserID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("UserID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("UserTel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("UserTel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("UserTel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("UserTel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("UserTel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("UserTel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("UserTel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("UserTel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("UserTel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("UserTel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("UserTel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("UserTel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("UserTel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("UserTel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andAddressIDIsNull() {
            addCriterion("AddressID is null");
            return (Criteria) this;
        }

        public Criteria andAddressIDIsNotNull() {
            addCriterion("AddressID is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIDEqualTo(Integer value) {
            addCriterion("AddressID =", value, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDNotEqualTo(Integer value) {
            addCriterion("AddressID <>", value, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDGreaterThan(Integer value) {
            addCriterion("AddressID >", value, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddressID >=", value, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDLessThan(Integer value) {
            addCriterion("AddressID <", value, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDLessThanOrEqualTo(Integer value) {
            addCriterion("AddressID <=", value, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDIn(List<Integer> values) {
            addCriterion("AddressID in", values, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDNotIn(List<Integer> values) {
            addCriterion("AddressID not in", values, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDBetween(Integer value1, Integer value2) {
            addCriterion("AddressID between", value1, value2, "addressID");
            return (Criteria) this;
        }

        public Criteria andAddressIDNotBetween(Integer value1, Integer value2) {
            addCriterion("AddressID not between", value1, value2, "addressID");
            return (Criteria) this;
        }

        public Criteria andCarIDIsNull() {
            addCriterion("CarID is null");
            return (Criteria) this;
        }

        public Criteria andCarIDIsNotNull() {
            addCriterion("CarID is not null");
            return (Criteria) this;
        }

        public Criteria andCarIDEqualTo(String value) {
            addCriterion("CarID =", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotEqualTo(String value) {
            addCriterion("CarID <>", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDGreaterThan(String value) {
            addCriterion("CarID >", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDGreaterThanOrEqualTo(String value) {
            addCriterion("CarID >=", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDLessThan(String value) {
            addCriterion("CarID <", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDLessThanOrEqualTo(String value) {
            addCriterion("CarID <=", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDLike(String value) {
            addCriterion("CarID like", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotLike(String value) {
            addCriterion("CarID not like", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDIn(List<String> values) {
            addCriterion("CarID in", values, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotIn(List<String> values) {
            addCriterion("CarID not in", values, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDBetween(String value1, String value2) {
            addCriterion("CarID between", value1, value2, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotBetween(String value1, String value2) {
            addCriterion("CarID not between", value1, value2, "carID");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeIsNull() {
            addCriterion("OrderDatetime is null");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeIsNotNull() {
            addCriterion("OrderDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeEqualTo(Date value) {
            addCriterion("OrderDatetime =", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeNotEqualTo(Date value) {
            addCriterion("OrderDatetime <>", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeGreaterThan(Date value) {
            addCriterion("OrderDatetime >", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderDatetime >=", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeLessThan(Date value) {
            addCriterion("OrderDatetime <", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderDatetime <=", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeIn(List<Date> values) {
            addCriterion("OrderDatetime in", values, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeNotIn(List<Date> values) {
            addCriterion("OrderDatetime not in", values, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeBetween(Date value1, Date value2) {
            addCriterion("OrderDatetime between", value1, value2, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderDatetime not between", value1, value2, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeIsNull() {
            addCriterion("BookDatetime is null");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeIsNotNull() {
            addCriterion("BookDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeEqualTo(Date value) {
            addCriterion("BookDatetime =", value, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeNotEqualTo(Date value) {
            addCriterion("BookDatetime <>", value, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeGreaterThan(Date value) {
            addCriterion("BookDatetime >", value, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BookDatetime >=", value, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeLessThan(Date value) {
            addCriterion("BookDatetime <", value, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("BookDatetime <=", value, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeIn(List<Date> values) {
            addCriterion("BookDatetime in", values, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeNotIn(List<Date> values) {
            addCriterion("BookDatetime not in", values, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeBetween(Date value1, Date value2) {
            addCriterion("BookDatetime between", value1, value2, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("BookDatetime not between", value1, value2, "bookDatetime");
            return (Criteria) this;
        }

        public Criteria andBookPeriodIsNull() {
            addCriterion("BookPeriod is null");
            return (Criteria) this;
        }

        public Criteria andBookPeriodIsNotNull() {
            addCriterion("BookPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andBookPeriodEqualTo(String value) {
            addCriterion("BookPeriod =", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodNotEqualTo(String value) {
            addCriterion("BookPeriod <>", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodGreaterThan(String value) {
            addCriterion("BookPeriod >", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("BookPeriod >=", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodLessThan(String value) {
            addCriterion("BookPeriod <", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodLessThanOrEqualTo(String value) {
            addCriterion("BookPeriod <=", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodLike(String value) {
            addCriterion("BookPeriod like", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodNotLike(String value) {
            addCriterion("BookPeriod not like", value, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodIn(List<String> values) {
            addCriterion("BookPeriod in", values, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodNotIn(List<String> values) {
            addCriterion("BookPeriod not in", values, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodBetween(String value1, String value2) {
            addCriterion("BookPeriod between", value1, value2, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andBookPeriodNotBetween(String value1, String value2) {
            addCriterion("BookPeriod not between", value1, value2, "bookPeriod");
            return (Criteria) this;
        }

        public Criteria andAbstIsNull() {
            addCriterion("Abst is null");
            return (Criteria) this;
        }

        public Criteria andAbstIsNotNull() {
            addCriterion("Abst is not null");
            return (Criteria) this;
        }

        public Criteria andAbstEqualTo(String value) {
            addCriterion("Abst =", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstNotEqualTo(String value) {
            addCriterion("Abst <>", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstGreaterThan(String value) {
            addCriterion("Abst >", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstGreaterThanOrEqualTo(String value) {
            addCriterion("Abst >=", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstLessThan(String value) {
            addCriterion("Abst <", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstLessThanOrEqualTo(String value) {
            addCriterion("Abst <=", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstLike(String value) {
            addCriterion("Abst like", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstNotLike(String value) {
            addCriterion("Abst not like", value, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstIn(List<String> values) {
            addCriterion("Abst in", values, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstNotIn(List<String> values) {
            addCriterion("Abst not in", values, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstBetween(String value1, String value2) {
            addCriterion("Abst between", value1, value2, "abst");
            return (Criteria) this;
        }

        public Criteria andAbstNotBetween(String value1, String value2) {
            addCriterion("Abst not between", value1, value2, "abst");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("Owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("Owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("Owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("Owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("Owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("Owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("Owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("Owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("Owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("Owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("Owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("Owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("Owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("Owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andSubmitorIsNull() {
            addCriterion("Submitor is null");
            return (Criteria) this;
        }

        public Criteria andSubmitorIsNotNull() {
            addCriterion("Submitor is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitorEqualTo(String value) {
            addCriterion("Submitor =", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorNotEqualTo(String value) {
            addCriterion("Submitor <>", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorGreaterThan(String value) {
            addCriterion("Submitor >", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorGreaterThanOrEqualTo(String value) {
            addCriterion("Submitor >=", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorLessThan(String value) {
            addCriterion("Submitor <", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorLessThanOrEqualTo(String value) {
            addCriterion("Submitor <=", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorLike(String value) {
            addCriterion("Submitor like", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorNotLike(String value) {
            addCriterion("Submitor not like", value, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorIn(List<String> values) {
            addCriterion("Submitor in", values, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorNotIn(List<String> values) {
            addCriterion("Submitor not in", values, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorBetween(String value1, String value2) {
            addCriterion("Submitor between", value1, value2, "submitor");
            return (Criteria) this;
        }

        public Criteria andSubmitorNotBetween(String value1, String value2) {
            addCriterion("Submitor not between", value1, value2, "submitor");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("Auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("Auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("Auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("Auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("Auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("Auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("Auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("Auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("Auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("Auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("Auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("Auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("Auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("Auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeIsNull() {
            addCriterion("AuditDatetime is null");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeIsNotNull() {
            addCriterion("AuditDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeEqualTo(Date value) {
            addCriterion("AuditDatetime =", value, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeNotEqualTo(Date value) {
            addCriterion("AuditDatetime <>", value, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeGreaterThan(Date value) {
            addCriterion("AuditDatetime >", value, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditDatetime >=", value, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeLessThan(Date value) {
            addCriterion("AuditDatetime <", value, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("AuditDatetime <=", value, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeIn(List<Date> values) {
            addCriterion("AuditDatetime in", values, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeNotIn(List<Date> values) {
            addCriterion("AuditDatetime not in", values, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeBetween(Date value1, Date value2) {
            addCriterion("AuditDatetime between", value1, value2, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andAuditDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("AuditDatetime not between", value1, value2, "auditDatetime");
            return (Criteria) this;
        }

        public Criteria andSumNumIsNull() {
            addCriterion("SumNum is null");
            return (Criteria) this;
        }

        public Criteria andSumNumIsNotNull() {
            addCriterion("SumNum is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumEqualTo(Integer value) {
            addCriterion("SumNum =", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotEqualTo(Integer value) {
            addCriterion("SumNum <>", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumGreaterThan(Integer value) {
            addCriterion("SumNum >", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SumNum >=", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumLessThan(Integer value) {
            addCriterion("SumNum <", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumLessThanOrEqualTo(Integer value) {
            addCriterion("SumNum <=", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumIn(List<Integer> values) {
            addCriterion("SumNum in", values, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotIn(List<Integer> values) {
            addCriterion("SumNum not in", values, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumBetween(Integer value1, Integer value2) {
            addCriterion("SumNum between", value1, value2, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SumNum not between", value1, value2, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumMoneyIsNull() {
            addCriterion("SumMoney is null");
            return (Criteria) this;
        }

        public Criteria andSumMoneyIsNotNull() {
            addCriterion("SumMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSumMoneyEqualTo(BigDecimal value) {
            addCriterion("SumMoney =", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyNotEqualTo(BigDecimal value) {
            addCriterion("SumMoney <>", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyGreaterThan(BigDecimal value) {
            addCriterion("SumMoney >", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumMoney >=", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyLessThan(BigDecimal value) {
            addCriterion("SumMoney <", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumMoney <=", value, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyIn(List<BigDecimal> values) {
            addCriterion("SumMoney in", values, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyNotIn(List<BigDecimal> values) {
            addCriterion("SumMoney not in", values, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumMoney between", value1, value2, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumMoney not between", value1, value2, "sumMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyIsNull() {
            addCriterion("SumMarkedMoney is null");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyIsNotNull() {
            addCriterion("SumMarkedMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyEqualTo(BigDecimal value) {
            addCriterion("SumMarkedMoney =", value, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyNotEqualTo(BigDecimal value) {
            addCriterion("SumMarkedMoney <>", value, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyGreaterThan(BigDecimal value) {
            addCriterion("SumMarkedMoney >", value, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumMarkedMoney >=", value, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyLessThan(BigDecimal value) {
            addCriterion("SumMarkedMoney <", value, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumMarkedMoney <=", value, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyIn(List<BigDecimal> values) {
            addCriterion("SumMarkedMoney in", values, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyNotIn(List<BigDecimal> values) {
            addCriterion("SumMarkedMoney not in", values, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumMarkedMoney between", value1, value2, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumMarkedMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumMarkedMoney not between", value1, value2, "sumMarkedMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyIsNull() {
            addCriterion("SumDisMoney is null");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyIsNotNull() {
            addCriterion("SumDisMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyEqualTo(BigDecimal value) {
            addCriterion("SumDisMoney =", value, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyNotEqualTo(BigDecimal value) {
            addCriterion("SumDisMoney <>", value, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyGreaterThan(BigDecimal value) {
            addCriterion("SumDisMoney >", value, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumDisMoney >=", value, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyLessThan(BigDecimal value) {
            addCriterion("SumDisMoney <", value, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumDisMoney <=", value, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyIn(List<BigDecimal> values) {
            addCriterion("SumDisMoney in", values, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyNotIn(List<BigDecimal> values) {
            addCriterion("SumDisMoney not in", values, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumDisMoney between", value1, value2, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andSumDisMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumDisMoney not between", value1, value2, "sumDisMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyIsNull() {
            addCriterion("ShippingMoney is null");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyIsNotNull() {
            addCriterion("ShippingMoney is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyEqualTo(BigDecimal value) {
            addCriterion("ShippingMoney =", value, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("ShippingMoney <>", value, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyGreaterThan(BigDecimal value) {
            addCriterion("ShippingMoney >", value, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShippingMoney >=", value, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyLessThan(BigDecimal value) {
            addCriterion("ShippingMoney <", value, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShippingMoney <=", value, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyIn(List<BigDecimal> values) {
            addCriterion("ShippingMoney in", values, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("ShippingMoney not in", values, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShippingMoney between", value1, value2, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andShippingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShippingMoney not between", value1, value2, "shippingMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyIsNull() {
            addCriterion("InstallMoney is null");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyIsNotNull() {
            addCriterion("InstallMoney is not null");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyEqualTo(BigDecimal value) {
            addCriterion("InstallMoney =", value, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyNotEqualTo(BigDecimal value) {
            addCriterion("InstallMoney <>", value, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyGreaterThan(BigDecimal value) {
            addCriterion("InstallMoney >", value, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InstallMoney >=", value, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyLessThan(BigDecimal value) {
            addCriterion("InstallMoney <", value, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InstallMoney <=", value, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyIn(List<BigDecimal> values) {
            addCriterion("InstallMoney in", values, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyNotIn(List<BigDecimal> values) {
            addCriterion("InstallMoney not in", values, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InstallMoney between", value1, value2, "installMoney");
            return (Criteria) this;
        }

        public Criteria andInstallMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InstallMoney not between", value1, value2, "installMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountItemIsNull() {
            addCriterion("DiscountItem is null");
            return (Criteria) this;
        }

        public Criteria andDiscountItemIsNotNull() {
            addCriterion("DiscountItem is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountItemEqualTo(String value) {
            addCriterion("DiscountItem =", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemNotEqualTo(String value) {
            addCriterion("DiscountItem <>", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemGreaterThan(String value) {
            addCriterion("DiscountItem >", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemGreaterThanOrEqualTo(String value) {
            addCriterion("DiscountItem >=", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemLessThan(String value) {
            addCriterion("DiscountItem <", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemLessThanOrEqualTo(String value) {
            addCriterion("DiscountItem <=", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemLike(String value) {
            addCriterion("DiscountItem like", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemNotLike(String value) {
            addCriterion("DiscountItem not like", value, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemIn(List<String> values) {
            addCriterion("DiscountItem in", values, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemNotIn(List<String> values) {
            addCriterion("DiscountItem not in", values, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemBetween(String value1, String value2) {
            addCriterion("DiscountItem between", value1, value2, "discountItem");
            return (Criteria) this;
        }

        public Criteria andDiscountItemNotBetween(String value1, String value2) {
            addCriterion("DiscountItem not between", value1, value2, "discountItem");
            return (Criteria) this;
        }

        public Criteria andInstallTypeIsNull() {
            addCriterion("InstallType is null");
            return (Criteria) this;
        }

        public Criteria andInstallTypeIsNotNull() {
            addCriterion("InstallType is not null");
            return (Criteria) this;
        }

        public Criteria andInstallTypeEqualTo(String value) {
            addCriterion("InstallType =", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeNotEqualTo(String value) {
            addCriterion("InstallType <>", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeGreaterThan(String value) {
            addCriterion("InstallType >", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("InstallType >=", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeLessThan(String value) {
            addCriterion("InstallType <", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeLessThanOrEqualTo(String value) {
            addCriterion("InstallType <=", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeLike(String value) {
            addCriterion("InstallType like", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeNotLike(String value) {
            addCriterion("InstallType not like", value, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeIn(List<String> values) {
            addCriterion("InstallType in", values, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeNotIn(List<String> values) {
            addCriterion("InstallType not in", values, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeBetween(String value1, String value2) {
            addCriterion("InstallType between", value1, value2, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallTypeNotBetween(String value1, String value2) {
            addCriterion("InstallType not between", value1, value2, "installType");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDIsNull() {
            addCriterion("InstallShopID is null");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDIsNotNull() {
            addCriterion("InstallShopID is not null");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDEqualTo(Integer value) {
            addCriterion("InstallShopID =", value, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDNotEqualTo(Integer value) {
            addCriterion("InstallShopID <>", value, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDGreaterThan(Integer value) {
            addCriterion("InstallShopID >", value, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("InstallShopID >=", value, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDLessThan(Integer value) {
            addCriterion("InstallShopID <", value, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDLessThanOrEqualTo(Integer value) {
            addCriterion("InstallShopID <=", value, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDIn(List<Integer> values) {
            addCriterion("InstallShopID in", values, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDNotIn(List<Integer> values) {
            addCriterion("InstallShopID not in", values, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDBetween(Integer value1, Integer value2) {
            addCriterion("InstallShopID between", value1, value2, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIDNotBetween(Integer value1, Integer value2) {
            addCriterion("InstallShopID not between", value1, value2, "installShopID");
            return (Criteria) this;
        }

        public Criteria andInstallShopIsNull() {
            addCriterion("InstallShop is null");
            return (Criteria) this;
        }

        public Criteria andInstallShopIsNotNull() {
            addCriterion("InstallShop is not null");
            return (Criteria) this;
        }

        public Criteria andInstallShopEqualTo(String value) {
            addCriterion("InstallShop =", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopNotEqualTo(String value) {
            addCriterion("InstallShop <>", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopGreaterThan(String value) {
            addCriterion("InstallShop >", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopGreaterThanOrEqualTo(String value) {
            addCriterion("InstallShop >=", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopLessThan(String value) {
            addCriterion("InstallShop <", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopLessThanOrEqualTo(String value) {
            addCriterion("InstallShop <=", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopLike(String value) {
            addCriterion("InstallShop like", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopNotLike(String value) {
            addCriterion("InstallShop not like", value, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopIn(List<String> values) {
            addCriterion("InstallShop in", values, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopNotIn(List<String> values) {
            addCriterion("InstallShop not in", values, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopBetween(String value1, String value2) {
            addCriterion("InstallShop between", value1, value2, "installShop");
            return (Criteria) this;
        }

        public Criteria andInstallShopNotBetween(String value1, String value2) {
            addCriterion("InstallShop not between", value1, value2, "installShop");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeIsNull() {
            addCriterion("DeliveryCode is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeIsNotNull() {
            addCriterion("DeliveryCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeEqualTo(String value) {
            addCriterion("DeliveryCode =", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeNotEqualTo(String value) {
            addCriterion("DeliveryCode <>", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeGreaterThan(String value) {
            addCriterion("DeliveryCode >", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryCode >=", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeLessThan(String value) {
            addCriterion("DeliveryCode <", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeLessThanOrEqualTo(String value) {
            addCriterion("DeliveryCode <=", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeLike(String value) {
            addCriterion("DeliveryCode like", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeNotLike(String value) {
            addCriterion("DeliveryCode not like", value, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeIn(List<String> values) {
            addCriterion("DeliveryCode in", values, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeNotIn(List<String> values) {
            addCriterion("DeliveryCode not in", values, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeBetween(String value1, String value2) {
            addCriterion("DeliveryCode between", value1, value2, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryCodeNotBetween(String value1, String value2) {
            addCriterion("DeliveryCode not between", value1, value2, "deliveryCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PayStatus is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PayStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("PayStatus =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("PayStatus <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("PayStatus >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PayStatus >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("PayStatus <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("PayStatus <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("PayStatus like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("PayStatus not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("PayStatus in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("PayStatus not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("PayStatus between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("PayStatus not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andSumPaidIsNull() {
            addCriterion("SumPaid is null");
            return (Criteria) this;
        }

        public Criteria andSumPaidIsNotNull() {
            addCriterion("SumPaid is not null");
            return (Criteria) this;
        }

        public Criteria andSumPaidEqualTo(BigDecimal value) {
            addCriterion("SumPaid =", value, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidNotEqualTo(BigDecimal value) {
            addCriterion("SumPaid <>", value, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidGreaterThan(BigDecimal value) {
            addCriterion("SumPaid >", value, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumPaid >=", value, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidLessThan(BigDecimal value) {
            addCriterion("SumPaid <", value, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumPaid <=", value, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidIn(List<BigDecimal> values) {
            addCriterion("SumPaid in", values, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidNotIn(List<BigDecimal> values) {
            addCriterion("SumPaid not in", values, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumPaid between", value1, value2, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andSumPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumPaid not between", value1, value2, "sumPaid");
            return (Criteria) this;
        }

        public Criteria andPayMothedIsNull() {
            addCriterion("PayMothed is null");
            return (Criteria) this;
        }

        public Criteria andPayMothedIsNotNull() {
            addCriterion("PayMothed is not null");
            return (Criteria) this;
        }

        public Criteria andPayMothedEqualTo(String value) {
            addCriterion("PayMothed =", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedNotEqualTo(String value) {
            addCriterion("PayMothed <>", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedGreaterThan(String value) {
            addCriterion("PayMothed >", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedGreaterThanOrEqualTo(String value) {
            addCriterion("PayMothed >=", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedLessThan(String value) {
            addCriterion("PayMothed <", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedLessThanOrEqualTo(String value) {
            addCriterion("PayMothed <=", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedLike(String value) {
            addCriterion("PayMothed like", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedNotLike(String value) {
            addCriterion("PayMothed not like", value, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedIn(List<String> values) {
            addCriterion("PayMothed in", values, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedNotIn(List<String> values) {
            addCriterion("PayMothed not in", values, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedBetween(String value1, String value2) {
            addCriterion("PayMothed between", value1, value2, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPayMothedNotBetween(String value1, String value2) {
            addCriterion("PayMothed not between", value1, value2, "payMothed");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PaymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PaymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("PaymentType =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("PaymentType <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("PaymentType >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PaymentType >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("PaymentType <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("PaymentType <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("PaymentType like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("PaymentType not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("PaymentType in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("PaymentType not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("PaymentType between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("PaymentType not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeIsNull() {
            addCriterion("PurchaseDatetime is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeIsNotNull() {
            addCriterion("PurchaseDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeEqualTo(Date value) {
            addCriterion("PurchaseDatetime =", value, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeNotEqualTo(Date value) {
            addCriterion("PurchaseDatetime <>", value, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeGreaterThan(Date value) {
            addCriterion("PurchaseDatetime >", value, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PurchaseDatetime >=", value, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeLessThan(Date value) {
            addCriterion("PurchaseDatetime <", value, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("PurchaseDatetime <=", value, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeIn(List<Date> values) {
            addCriterion("PurchaseDatetime in", values, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeNotIn(List<Date> values) {
            addCriterion("PurchaseDatetime not in", values, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeBetween(Date value1, Date value2) {
            addCriterion("PurchaseDatetime between", value1, value2, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("PurchaseDatetime not between", value1, value2, "purchaseDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("DeliveryType is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("DeliveryType is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(String value) {
            addCriterion("DeliveryType =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(String value) {
            addCriterion("DeliveryType <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(String value) {
            addCriterion("DeliveryType >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryType >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(String value) {
            addCriterion("DeliveryType <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(String value) {
            addCriterion("DeliveryType <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLike(String value) {
            addCriterion("DeliveryType like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotLike(String value) {
            addCriterion("DeliveryType not like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<String> values) {
            addCriterion("DeliveryType in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<String> values) {
            addCriterion("DeliveryType not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(String value1, String value2) {
            addCriterion("DeliveryType between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(String value1, String value2) {
            addCriterion("DeliveryType not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNull() {
            addCriterion("DeliveryStatus is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNotNull() {
            addCriterion("DeliveryStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusEqualTo(String value) {
            addCriterion("DeliveryStatus =", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotEqualTo(String value) {
            addCriterion("DeliveryStatus <>", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThan(String value) {
            addCriterion("DeliveryStatus >", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryStatus >=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThan(String value) {
            addCriterion("DeliveryStatus <", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThanOrEqualTo(String value) {
            addCriterion("DeliveryStatus <=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLike(String value) {
            addCriterion("DeliveryStatus like", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotLike(String value) {
            addCriterion("DeliveryStatus not like", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIn(List<String> values) {
            addCriterion("DeliveryStatus in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotIn(List<String> values) {
            addCriterion("DeliveryStatus not in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusBetween(String value1, String value2) {
            addCriterion("DeliveryStatus between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotBetween(String value1, String value2) {
            addCriterion("DeliveryStatus not between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeIsNull() {
            addCriterion("DeliveryDatetime is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeIsNotNull() {
            addCriterion("DeliveryDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeEqualTo(Date value) {
            addCriterion("DeliveryDatetime =", value, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeNotEqualTo(Date value) {
            addCriterion("DeliveryDatetime <>", value, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeGreaterThan(Date value) {
            addCriterion("DeliveryDatetime >", value, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeliveryDatetime >=", value, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeLessThan(Date value) {
            addCriterion("DeliveryDatetime <", value, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DeliveryDatetime <=", value, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeIn(List<Date> values) {
            addCriterion("DeliveryDatetime in", values, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeNotIn(List<Date> values) {
            addCriterion("DeliveryDatetime not in", values, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeBetween(Date value1, Date value2) {
            addCriterion("DeliveryDatetime between", value1, value2, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DeliveryDatetime not between", value1, value2, "deliveryDatetime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorIsNull() {
            addCriterion("DeliveryConfirmor is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorIsNotNull() {
            addCriterion("DeliveryConfirmor is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorEqualTo(String value) {
            addCriterion("DeliveryConfirmor =", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorNotEqualTo(String value) {
            addCriterion("DeliveryConfirmor <>", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorGreaterThan(String value) {
            addCriterion("DeliveryConfirmor >", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryConfirmor >=", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorLessThan(String value) {
            addCriterion("DeliveryConfirmor <", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorLessThanOrEqualTo(String value) {
            addCriterion("DeliveryConfirmor <=", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorLike(String value) {
            addCriterion("DeliveryConfirmor like", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorNotLike(String value) {
            addCriterion("DeliveryConfirmor not like", value, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorIn(List<String> values) {
            addCriterion("DeliveryConfirmor in", values, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorNotIn(List<String> values) {
            addCriterion("DeliveryConfirmor not in", values, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorBetween(String value1, String value2) {
            addCriterion("DeliveryConfirmor between", value1, value2, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmorNotBetween(String value1, String value2) {
            addCriterion("DeliveryConfirmor not between", value1, value2, "deliveryConfirmor");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeIsNull() {
            addCriterion("InstallDatetime is null");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeIsNotNull() {
            addCriterion("InstallDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeEqualTo(Date value) {
            addCriterion("InstallDatetime =", value, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeNotEqualTo(Date value) {
            addCriterion("InstallDatetime <>", value, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeGreaterThan(Date value) {
            addCriterion("InstallDatetime >", value, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InstallDatetime >=", value, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeLessThan(Date value) {
            addCriterion("InstallDatetime <", value, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("InstallDatetime <=", value, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeIn(List<Date> values) {
            addCriterion("InstallDatetime in", values, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeNotIn(List<Date> values) {
            addCriterion("InstallDatetime not in", values, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeBetween(Date value1, Date value2) {
            addCriterion("InstallDatetime between", value1, value2, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("InstallDatetime not between", value1, value2, "installDatetime");
            return (Criteria) this;
        }

        public Criteria andInstallStatusIsNull() {
            addCriterion("InstallStatus is null");
            return (Criteria) this;
        }

        public Criteria andInstallStatusIsNotNull() {
            addCriterion("InstallStatus is not null");
            return (Criteria) this;
        }

        public Criteria andInstallStatusEqualTo(String value) {
            addCriterion("InstallStatus =", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusNotEqualTo(String value) {
            addCriterion("InstallStatus <>", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusGreaterThan(String value) {
            addCriterion("InstallStatus >", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusGreaterThanOrEqualTo(String value) {
            addCriterion("InstallStatus >=", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusLessThan(String value) {
            addCriterion("InstallStatus <", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusLessThanOrEqualTo(String value) {
            addCriterion("InstallStatus <=", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusLike(String value) {
            addCriterion("InstallStatus like", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusNotLike(String value) {
            addCriterion("InstallStatus not like", value, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusIn(List<String> values) {
            addCriterion("InstallStatus in", values, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusNotIn(List<String> values) {
            addCriterion("InstallStatus not in", values, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusBetween(String value1, String value2) {
            addCriterion("InstallStatus between", value1, value2, "installStatus");
            return (Criteria) this;
        }

        public Criteria andInstallStatusNotBetween(String value1, String value2) {
            addCriterion("InstallStatus not between", value1, value2, "installStatus");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateIsNull() {
            addCriterion("PayToCPDate is null");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateIsNotNull() {
            addCriterion("PayToCPDate is not null");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateEqualTo(Date value) {
            addCriterion("PayToCPDate =", value, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateNotEqualTo(Date value) {
            addCriterion("PayToCPDate <>", value, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateGreaterThan(Date value) {
            addCriterion("PayToCPDate >", value, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PayToCPDate >=", value, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateLessThan(Date value) {
            addCriterion("PayToCPDate <", value, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateLessThanOrEqualTo(Date value) {
            addCriterion("PayToCPDate <=", value, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateIn(List<Date> values) {
            addCriterion("PayToCPDate in", values, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateNotIn(List<Date> values) {
            addCriterion("PayToCPDate not in", values, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateBetween(Date value1, Date value2) {
            addCriterion("PayToCPDate between", value1, value2, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayToCPDateNotBetween(Date value1, Date value2) {
            addCriterion("PayToCPDate not between", value1, value2, "payToCPDate");
            return (Criteria) this;
        }

        public Criteria andPayInfoIsNull() {
            addCriterion("PayInfo is null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIsNotNull() {
            addCriterion("PayInfo is not null");
            return (Criteria) this;
        }

        public Criteria andPayInfoEqualTo(String value) {
            addCriterion("PayInfo =", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotEqualTo(String value) {
            addCriterion("PayInfo <>", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoGreaterThan(String value) {
            addCriterion("PayInfo >", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PayInfo >=", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoLessThan(String value) {
            addCriterion("PayInfo <", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoLessThanOrEqualTo(String value) {
            addCriterion("PayInfo <=", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoLike(String value) {
            addCriterion("PayInfo like", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotLike(String value) {
            addCriterion("PayInfo not like", value, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoIn(List<String> values) {
            addCriterion("PayInfo in", values, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotIn(List<String> values) {
            addCriterion("PayInfo not in", values, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoBetween(String value1, String value2) {
            addCriterion("PayInfo between", value1, value2, "payInfo");
            return (Criteria) this;
        }

        public Criteria andPayInfoNotBetween(String value1, String value2) {
            addCriterion("PayInfo not between", value1, value2, "payInfo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("InvoiceTitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("InvoiceTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("InvoiceTitle =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("InvoiceTitle <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("InvoiceTitle >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceTitle >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("InvoiceTitle <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("InvoiceTitle <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("InvoiceTitle like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("InvoiceTitle not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("InvoiceTitle in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("InvoiceTitle not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("InvoiceTitle between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("InvoiceTitle not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("InvoiceType is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("InvoiceType is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("InvoiceType =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("InvoiceType <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("InvoiceType >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceType >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("InvoiceType <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("InvoiceType <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("InvoiceType like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("InvoiceType not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("InvoiceType in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("InvoiceType not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("InvoiceType between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("InvoiceType not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("InvoiceStatus is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("InvoiceStatus is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("InvoiceStatus =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("InvoiceStatus <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("InvoiceStatus >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceStatus >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("InvoiceStatus <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("InvoiceStatus <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLike(String value) {
            addCriterion("InvoiceStatus like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("InvoiceStatus not like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("InvoiceStatus in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("InvoiceStatus not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("InvoiceStatus between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("InvoiceStatus not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeIsNull() {
            addCriterion("InvoiceDeliveryCode is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeIsNotNull() {
            addCriterion("InvoiceDeliveryCode is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeEqualTo(String value) {
            addCriterion("InvoiceDeliveryCode =", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeNotEqualTo(String value) {
            addCriterion("InvoiceDeliveryCode <>", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeGreaterThan(String value) {
            addCriterion("InvoiceDeliveryCode >", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceDeliveryCode >=", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeLessThan(String value) {
            addCriterion("InvoiceDeliveryCode <", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeLessThanOrEqualTo(String value) {
            addCriterion("InvoiceDeliveryCode <=", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeLike(String value) {
            addCriterion("InvoiceDeliveryCode like", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeNotLike(String value) {
            addCriterion("InvoiceDeliveryCode not like", value, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeIn(List<String> values) {
            addCriterion("InvoiceDeliveryCode in", values, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeNotIn(List<String> values) {
            addCriterion("InvoiceDeliveryCode not in", values, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeBetween(String value1, String value2) {
            addCriterion("InvoiceDeliveryCode between", value1, value2, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceDeliveryCodeNotBetween(String value1, String value2) {
            addCriterion("InvoiceDeliveryCode not between", value1, value2, "invoiceDeliveryCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxIsNull() {
            addCriterion("InvoiceAddTax is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxIsNotNull() {
            addCriterion("InvoiceAddTax is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxEqualTo(BigDecimal value) {
            addCriterion("InvoiceAddTax =", value, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxNotEqualTo(BigDecimal value) {
            addCriterion("InvoiceAddTax <>", value, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxGreaterThan(BigDecimal value) {
            addCriterion("InvoiceAddTax >", value, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InvoiceAddTax >=", value, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxLessThan(BigDecimal value) {
            addCriterion("InvoiceAddTax <", value, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InvoiceAddTax <=", value, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxIn(List<BigDecimal> values) {
            addCriterion("InvoiceAddTax in", values, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxNotIn(List<BigDecimal> values) {
            addCriterion("InvoiceAddTax not in", values, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InvoiceAddTax between", value1, value2, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InvoiceAddTax not between", value1, value2, "invoiceAddTax");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LastUpdateTime =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LastUpdateTime <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LastUpdateTime >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastUpdateTime >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LastUpdateTime <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastUpdateTime <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LastUpdateTime in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LastUpdateTime not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LastUpdateTime between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastUpdateTime not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCarPlateIsNull() {
            addCriterion("CarPlate is null");
            return (Criteria) this;
        }

        public Criteria andCarPlateIsNotNull() {
            addCriterion("CarPlate is not null");
            return (Criteria) this;
        }

        public Criteria andCarPlateEqualTo(String value) {
            addCriterion("CarPlate =", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotEqualTo(String value) {
            addCriterion("CarPlate <>", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateGreaterThan(String value) {
            addCriterion("CarPlate >", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateGreaterThanOrEqualTo(String value) {
            addCriterion("CarPlate >=", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateLessThan(String value) {
            addCriterion("CarPlate <", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateLessThanOrEqualTo(String value) {
            addCriterion("CarPlate <=", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateLike(String value) {
            addCriterion("CarPlate like", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotLike(String value) {
            addCriterion("CarPlate not like", value, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateIn(List<String> values) {
            addCriterion("CarPlate in", values, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotIn(List<String> values) {
            addCriterion("CarPlate not in", values, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateBetween(String value1, String value2) {
            addCriterion("CarPlate between", value1, value2, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCarPlateNotBetween(String value1, String value2) {
            addCriterion("CarPlate not between", value1, value2, "carPlate");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("Cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("Cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("Cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("Cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("Cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("Cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("Cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("Cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andInstallFeeIsNull() {
            addCriterion("InstallFee is null");
            return (Criteria) this;
        }

        public Criteria andInstallFeeIsNotNull() {
            addCriterion("InstallFee is not null");
            return (Criteria) this;
        }

        public Criteria andInstallFeeEqualTo(BigDecimal value) {
            addCriterion("InstallFee =", value, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeNotEqualTo(BigDecimal value) {
            addCriterion("InstallFee <>", value, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeGreaterThan(BigDecimal value) {
            addCriterion("InstallFee >", value, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InstallFee >=", value, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeLessThan(BigDecimal value) {
            addCriterion("InstallFee <", value, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InstallFee <=", value, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeIn(List<BigDecimal> values) {
            addCriterion("InstallFee in", values, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeNotIn(List<BigDecimal> values) {
            addCriterion("InstallFee not in", values, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InstallFee between", value1, value2, "installFee");
            return (Criteria) this;
        }

        public Criteria andInstallFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InstallFee not between", value1, value2, "installFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIsNull() {
            addCriterion("DeliveryFee is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIsNotNull() {
            addCriterion("DeliveryFee is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeEqualTo(BigDecimal value) {
            addCriterion("DeliveryFee =", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotEqualTo(BigDecimal value) {
            addCriterion("DeliveryFee <>", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeGreaterThan(BigDecimal value) {
            addCriterion("DeliveryFee >", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DeliveryFee >=", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeLessThan(BigDecimal value) {
            addCriterion("DeliveryFee <", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DeliveryFee <=", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIn(List<BigDecimal> values) {
            addCriterion("DeliveryFee in", values, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotIn(List<BigDecimal> values) {
            addCriterion("DeliveryFee not in", values, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeliveryFee between", value1, value2, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeliveryFee not between", value1, value2, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopIsNull() {
            addCriterion("OtherPayShop is null");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopIsNotNull() {
            addCriterion("OtherPayShop is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopEqualTo(BigDecimal value) {
            addCriterion("OtherPayShop =", value, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopNotEqualTo(BigDecimal value) {
            addCriterion("OtherPayShop <>", value, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopGreaterThan(BigDecimal value) {
            addCriterion("OtherPayShop >", value, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherPayShop >=", value, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopLessThan(BigDecimal value) {
            addCriterion("OtherPayShop <", value, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherPayShop <=", value, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopIn(List<BigDecimal> values) {
            addCriterion("OtherPayShop in", values, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopNotIn(List<BigDecimal> values) {
            addCriterion("OtherPayShop not in", values, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherPayShop between", value1, value2, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andOtherPayShopNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherPayShop not between", value1, value2, "otherPayShop");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidIsNull() {
            addCriterion("IsOtherPaid is null");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidIsNotNull() {
            addCriterion("IsOtherPaid is not null");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidEqualTo(Boolean value) {
            addCriterion("IsOtherPaid =", value, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidNotEqualTo(Boolean value) {
            addCriterion("IsOtherPaid <>", value, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidGreaterThan(Boolean value) {
            addCriterion("IsOtherPaid >", value, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOtherPaid >=", value, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidLessThan(Boolean value) {
            addCriterion("IsOtherPaid <", value, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOtherPaid <=", value, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidIn(List<Boolean> values) {
            addCriterion("IsOtherPaid in", values, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidNotIn(List<Boolean> values) {
            addCriterion("IsOtherPaid not in", values, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOtherPaid between", value1, value2, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andIsOtherPaidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOtherPaid not between", value1, value2, "isOtherPaid");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateIsNull() {
            addCriterion("OtherPaidDate is null");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateIsNotNull() {
            addCriterion("OtherPaidDate is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateEqualTo(Date value) {
            addCriterion("OtherPaidDate =", value, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateNotEqualTo(Date value) {
            addCriterion("OtherPaidDate <>", value, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateGreaterThan(Date value) {
            addCriterion("OtherPaidDate >", value, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OtherPaidDate >=", value, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateLessThan(Date value) {
            addCriterion("OtherPaidDate <", value, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateLessThanOrEqualTo(Date value) {
            addCriterion("OtherPaidDate <=", value, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateIn(List<Date> values) {
            addCriterion("OtherPaidDate in", values, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateNotIn(List<Date> values) {
            addCriterion("OtherPaidDate not in", values, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateBetween(Date value1, Date value2) {
            addCriterion("OtherPaidDate between", value1, value2, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andOtherPaidDateNotBetween(Date value1, Date value2) {
            addCriterion("OtherPaidDate not between", value1, value2, "otherPaidDate");
            return (Criteria) this;
        }

        public Criteria andInvAmontIsNull() {
            addCriterion("InvAmont is null");
            return (Criteria) this;
        }

        public Criteria andInvAmontIsNotNull() {
            addCriterion("InvAmont is not null");
            return (Criteria) this;
        }

        public Criteria andInvAmontEqualTo(BigDecimal value) {
            addCriterion("InvAmont =", value, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontNotEqualTo(BigDecimal value) {
            addCriterion("InvAmont <>", value, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontGreaterThan(BigDecimal value) {
            addCriterion("InvAmont >", value, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InvAmont >=", value, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontLessThan(BigDecimal value) {
            addCriterion("InvAmont <", value, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InvAmont <=", value, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontIn(List<BigDecimal> values) {
            addCriterion("InvAmont in", values, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontNotIn(List<BigDecimal> values) {
            addCriterion("InvAmont not in", values, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InvAmont between", value1, value2, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAmontNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InvAmont not between", value1, value2, "invAmont");
            return (Criteria) this;
        }

        public Criteria andInvAddressIsNull() {
            addCriterion("InvAddress is null");
            return (Criteria) this;
        }

        public Criteria andInvAddressIsNotNull() {
            addCriterion("InvAddress is not null");
            return (Criteria) this;
        }

        public Criteria andInvAddressEqualTo(String value) {
            addCriterion("InvAddress =", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotEqualTo(String value) {
            addCriterion("InvAddress <>", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressGreaterThan(String value) {
            addCriterion("InvAddress >", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressGreaterThanOrEqualTo(String value) {
            addCriterion("InvAddress >=", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressLessThan(String value) {
            addCriterion("InvAddress <", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressLessThanOrEqualTo(String value) {
            addCriterion("InvAddress <=", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressLike(String value) {
            addCriterion("InvAddress like", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotLike(String value) {
            addCriterion("InvAddress not like", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressIn(List<String> values) {
            addCriterion("InvAddress in", values, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotIn(List<String> values) {
            addCriterion("InvAddress not in", values, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressBetween(String value1, String value2) {
            addCriterion("InvAddress between", value1, value2, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotBetween(String value1, String value2) {
            addCriterion("InvAddress not between", value1, value2, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumIsNull() {
            addCriterion("InvTaxNum is null");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumIsNotNull() {
            addCriterion("InvTaxNum is not null");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumEqualTo(String value) {
            addCriterion("InvTaxNum =", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumNotEqualTo(String value) {
            addCriterion("InvTaxNum <>", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumGreaterThan(String value) {
            addCriterion("InvTaxNum >", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumGreaterThanOrEqualTo(String value) {
            addCriterion("InvTaxNum >=", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumLessThan(String value) {
            addCriterion("InvTaxNum <", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumLessThanOrEqualTo(String value) {
            addCriterion("InvTaxNum <=", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumLike(String value) {
            addCriterion("InvTaxNum like", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumNotLike(String value) {
            addCriterion("InvTaxNum not like", value, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumIn(List<String> values) {
            addCriterion("InvTaxNum in", values, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumNotIn(List<String> values) {
            addCriterion("InvTaxNum not in", values, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumBetween(String value1, String value2) {
            addCriterion("InvTaxNum between", value1, value2, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvTaxNumNotBetween(String value1, String value2) {
            addCriterion("InvTaxNum not between", value1, value2, "invTaxNum");
            return (Criteria) this;
        }

        public Criteria andInvBankIsNull() {
            addCriterion("InvBank is null");
            return (Criteria) this;
        }

        public Criteria andInvBankIsNotNull() {
            addCriterion("InvBank is not null");
            return (Criteria) this;
        }

        public Criteria andInvBankEqualTo(String value) {
            addCriterion("InvBank =", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotEqualTo(String value) {
            addCriterion("InvBank <>", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankGreaterThan(String value) {
            addCriterion("InvBank >", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankGreaterThanOrEqualTo(String value) {
            addCriterion("InvBank >=", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankLessThan(String value) {
            addCriterion("InvBank <", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankLessThanOrEqualTo(String value) {
            addCriterion("InvBank <=", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankLike(String value) {
            addCriterion("InvBank like", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotLike(String value) {
            addCriterion("InvBank not like", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankIn(List<String> values) {
            addCriterion("InvBank in", values, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotIn(List<String> values) {
            addCriterion("InvBank not in", values, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankBetween(String value1, String value2) {
            addCriterion("InvBank between", value1, value2, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotBetween(String value1, String value2) {
            addCriterion("InvBank not between", value1, value2, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountIsNull() {
            addCriterion("InvBankAccount is null");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountIsNotNull() {
            addCriterion("InvBankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountEqualTo(String value) {
            addCriterion("InvBankAccount =", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountNotEqualTo(String value) {
            addCriterion("InvBankAccount <>", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountGreaterThan(String value) {
            addCriterion("InvBankAccount >", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("InvBankAccount >=", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountLessThan(String value) {
            addCriterion("InvBankAccount <", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountLessThanOrEqualTo(String value) {
            addCriterion("InvBankAccount <=", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountLike(String value) {
            addCriterion("InvBankAccount like", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountNotLike(String value) {
            addCriterion("InvBankAccount not like", value, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountIn(List<String> values) {
            addCriterion("InvBankAccount in", values, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountNotIn(List<String> values) {
            addCriterion("InvBankAccount not in", values, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountBetween(String value1, String value2) {
            addCriterion("InvBankAccount between", value1, value2, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvBankAccountNotBetween(String value1, String value2) {
            addCriterion("InvBankAccount not between", value1, value2, "invBankAccount");
            return (Criteria) this;
        }

        public Criteria andInvRemarkIsNull() {
            addCriterion("InvRemark is null");
            return (Criteria) this;
        }

        public Criteria andInvRemarkIsNotNull() {
            addCriterion("InvRemark is not null");
            return (Criteria) this;
        }

        public Criteria andInvRemarkEqualTo(String value) {
            addCriterion("InvRemark =", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkNotEqualTo(String value) {
            addCriterion("InvRemark <>", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkGreaterThan(String value) {
            addCriterion("InvRemark >", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("InvRemark >=", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkLessThan(String value) {
            addCriterion("InvRemark <", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkLessThanOrEqualTo(String value) {
            addCriterion("InvRemark <=", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkLike(String value) {
            addCriterion("InvRemark like", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkNotLike(String value) {
            addCriterion("InvRemark not like", value, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkIn(List<String> values) {
            addCriterion("InvRemark in", values, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkNotIn(List<String> values) {
            addCriterion("InvRemark not in", values, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkBetween(String value1, String value2) {
            addCriterion("InvRemark between", value1, value2, "invRemark");
            return (Criteria) this;
        }

        public Criteria andInvRemarkNotBetween(String value1, String value2) {
            addCriterion("InvRemark not between", value1, value2, "invRemark");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("OrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("OrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("OrderType =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("OrderType <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("OrderType >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderType >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("OrderType <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("OrderType <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("OrderType like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("OrderType not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("OrderType in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("OrderType not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("OrderType between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("OrderType not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNull() {
            addCriterion("OrderChannel is null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIsNotNull() {
            addCriterion("OrderChannel is not null");
            return (Criteria) this;
        }

        public Criteria andOrderChannelEqualTo(String value) {
            addCriterion("OrderChannel =", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotEqualTo(String value) {
            addCriterion("OrderChannel <>", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThan(String value) {
            addCriterion("OrderChannel >", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelGreaterThanOrEqualTo(String value) {
            addCriterion("OrderChannel >=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThan(String value) {
            addCriterion("OrderChannel <", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLessThanOrEqualTo(String value) {
            addCriterion("OrderChannel <=", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelLike(String value) {
            addCriterion("OrderChannel like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotLike(String value) {
            addCriterion("OrderChannel not like", value, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelIn(List<String> values) {
            addCriterion("OrderChannel in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotIn(List<String> values) {
            addCriterion("OrderChannel not in", values, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelBetween(String value1, String value2) {
            addCriterion("OrderChannel between", value1, value2, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andOrderChannelNotBetween(String value1, String value2) {
            addCriterion("OrderChannel not between", value1, value2, "orderChannel");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNull() {
            addCriterion("RefNo is null");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNotNull() {
            addCriterion("RefNo is not null");
            return (Criteria) this;
        }

        public Criteria andRefNoEqualTo(String value) {
            addCriterion("RefNo =", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotEqualTo(String value) {
            addCriterion("RefNo <>", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThan(String value) {
            addCriterion("RefNo >", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("RefNo >=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThan(String value) {
            addCriterion("RefNo <", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThanOrEqualTo(String value) {
            addCriterion("RefNo <=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLike(String value) {
            addCriterion("RefNo like", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotLike(String value) {
            addCriterion("RefNo not like", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoIn(List<String> values) {
            addCriterion("RefNo in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotIn(List<String> values) {
            addCriterion("RefNo not in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoBetween(String value1, String value2) {
            addCriterion("RefNo between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotBetween(String value1, String value2) {
            addCriterion("RefNo not between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("CaseId is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("CaseId is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(String value) {
            addCriterion("CaseId =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(String value) {
            addCriterion("CaseId <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(String value) {
            addCriterion("CaseId >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("CaseId >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(String value) {
            addCriterion("CaseId <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(String value) {
            addCriterion("CaseId <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLike(String value) {
            addCriterion("CaseId like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotLike(String value) {
            addCriterion("CaseId not like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<String> values) {
            addCriterion("CaseId in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<String> values) {
            addCriterion("CaseId not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(String value1, String value2) {
            addCriterion("CaseId between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(String value1, String value2) {
            addCriterion("CaseId not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("CommentStatus is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("CommentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Integer value) {
            addCriterion("CommentStatus =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Integer value) {
            addCriterion("CommentStatus <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Integer value) {
            addCriterion("CommentStatus >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentStatus >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Integer value) {
            addCriterion("CommentStatus <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CommentStatus <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Integer> values) {
            addCriterion("CommentStatus in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Integer> values) {
            addCriterion("CommentStatus not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("CommentStatus between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentStatus not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andReconciliationIsNull() {
            addCriterion("Reconciliation is null");
            return (Criteria) this;
        }

        public Criteria andReconciliationIsNotNull() {
            addCriterion("Reconciliation is not null");
            return (Criteria) this;
        }

        public Criteria andReconciliationEqualTo(Boolean value) {
            addCriterion("Reconciliation =", value, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationNotEqualTo(Boolean value) {
            addCriterion("Reconciliation <>", value, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationGreaterThan(Boolean value) {
            addCriterion("Reconciliation >", value, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Reconciliation >=", value, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationLessThan(Boolean value) {
            addCriterion("Reconciliation <", value, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationLessThanOrEqualTo(Boolean value) {
            addCriterion("Reconciliation <=", value, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationIn(List<Boolean> values) {
            addCriterion("Reconciliation in", values, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationNotIn(List<Boolean> values) {
            addCriterion("Reconciliation not in", values, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationBetween(Boolean value1, Boolean value2) {
            addCriterion("Reconciliation between", value1, value2, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconciliationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Reconciliation not between", value1, value2, "reconciliation");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeIsNull() {
            addCriterion("ReconcileTime is null");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeIsNotNull() {
            addCriterion("ReconcileTime is not null");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeEqualTo(Date value) {
            addCriterion("ReconcileTime =", value, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeNotEqualTo(Date value) {
            addCriterion("ReconcileTime <>", value, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeGreaterThan(Date value) {
            addCriterion("ReconcileTime >", value, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReconcileTime >=", value, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeLessThan(Date value) {
            addCriterion("ReconcileTime <", value, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeLessThanOrEqualTo(Date value) {
            addCriterion("ReconcileTime <=", value, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeIn(List<Date> values) {
            addCriterion("ReconcileTime in", values, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeNotIn(List<Date> values) {
            addCriterion("ReconcileTime not in", values, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeBetween(Date value1, Date value2) {
            addCriterion("ReconcileTime between", value1, value2, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconcileTimeNotBetween(Date value1, Date value2) {
            addCriterion("ReconcileTime not between", value1, value2, "reconcileTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeIsNull() {
            addCriterion("ReconciledTime is null");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeIsNotNull() {
            addCriterion("ReconciledTime is not null");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeEqualTo(Date value) {
            addCriterion("ReconciledTime =", value, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeNotEqualTo(Date value) {
            addCriterion("ReconciledTime <>", value, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeGreaterThan(Date value) {
            addCriterion("ReconciledTime >", value, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReconciledTime >=", value, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeLessThan(Date value) {
            addCriterion("ReconciledTime <", value, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeLessThanOrEqualTo(Date value) {
            addCriterion("ReconciledTime <=", value, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeIn(List<Date> values) {
            addCriterion("ReconciledTime in", values, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeNotIn(List<Date> values) {
            addCriterion("ReconciledTime not in", values, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeBetween(Date value1, Date value2) {
            addCriterion("ReconciledTime between", value1, value2, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andReconciledTimeNotBetween(Date value1, Date value2) {
            addCriterion("ReconciledTime not between", value1, value2, "reconciledTime");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherIsNull() {
            addCriterion("ShopReconcileVoucher is null");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherIsNotNull() {
            addCriterion("ShopReconcileVoucher is not null");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherEqualTo(Integer value) {
            addCriterion("ShopReconcileVoucher =", value, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherNotEqualTo(Integer value) {
            addCriterion("ShopReconcileVoucher <>", value, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherGreaterThan(Integer value) {
            addCriterion("ShopReconcileVoucher >", value, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShopReconcileVoucher >=", value, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherLessThan(Integer value) {
            addCriterion("ShopReconcileVoucher <", value, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherLessThanOrEqualTo(Integer value) {
            addCriterion("ShopReconcileVoucher <=", value, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherIn(List<Integer> values) {
            addCriterion("ShopReconcileVoucher in", values, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherNotIn(List<Integer> values) {
            addCriterion("ShopReconcileVoucher not in", values, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherBetween(Integer value1, Integer value2) {
            addCriterion("ShopReconcileVoucher between", value1, value2, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andShopReconcileVoucherNotBetween(Integer value1, Integer value2) {
            addCriterion("ShopReconcileVoucher not between", value1, value2, "shopReconcileVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherIsNull() {
            addCriterion("BankRecieveVoucher is null");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherIsNotNull() {
            addCriterion("BankRecieveVoucher is not null");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherEqualTo(Integer value) {
            addCriterion("BankRecieveVoucher =", value, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherNotEqualTo(Integer value) {
            addCriterion("BankRecieveVoucher <>", value, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherGreaterThan(Integer value) {
            addCriterion("BankRecieveVoucher >", value, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherGreaterThanOrEqualTo(Integer value) {
            addCriterion("BankRecieveVoucher >=", value, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherLessThan(Integer value) {
            addCriterion("BankRecieveVoucher <", value, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherLessThanOrEqualTo(Integer value) {
            addCriterion("BankRecieveVoucher <=", value, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherIn(List<Integer> values) {
            addCriterion("BankRecieveVoucher in", values, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherNotIn(List<Integer> values) {
            addCriterion("BankRecieveVoucher not in", values, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherBetween(Integer value1, Integer value2) {
            addCriterion("BankRecieveVoucher between", value1, value2, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andBankRecieveVoucherNotBetween(Integer value1, Integer value2) {
            addCriterion("BankRecieveVoucher not between", value1, value2, "bankRecieveVoucher");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNull() {
            addCriterion("OrderAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNotNull() {
            addCriterion("OrderAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressEqualTo(String value) {
            addCriterion("OrderAddress =", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotEqualTo(String value) {
            addCriterion("OrderAddress <>", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThan(String value) {
            addCriterion("OrderAddress >", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("OrderAddress >=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThan(String value) {
            addCriterion("OrderAddress <", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThanOrEqualTo(String value) {
            addCriterion("OrderAddress <=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLike(String value) {
            addCriterion("OrderAddress like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotLike(String value) {
            addCriterion("OrderAddress not like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIn(List<String> values) {
            addCriterion("OrderAddress in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotIn(List<String> values) {
            addCriterion("OrderAddress not in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressBetween(String value1, String value2) {
            addCriterion("OrderAddress between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotBetween(String value1, String value2) {
            addCriterion("OrderAddress not between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeIsNull() {
            addCriterion("OutStockDatetime is null");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeIsNotNull() {
            addCriterion("OutStockDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeEqualTo(Date value) {
            addCriterion("OutStockDatetime =", value, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeNotEqualTo(Date value) {
            addCriterion("OutStockDatetime <>", value, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeGreaterThan(Date value) {
            addCriterion("OutStockDatetime >", value, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OutStockDatetime >=", value, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeLessThan(Date value) {
            addCriterion("OutStockDatetime <", value, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OutStockDatetime <=", value, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeIn(List<Date> values) {
            addCriterion("OutStockDatetime in", values, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeNotIn(List<Date> values) {
            addCriterion("OutStockDatetime not in", values, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeBetween(Date value1, Date value2) {
            addCriterion("OutStockDatetime between", value1, value2, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andOutStockDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OutStockDatetime not between", value1, value2, "outStockDatetime");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherIsNull() {
            addCriterion("IncomeVoucher is null");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherIsNotNull() {
            addCriterion("IncomeVoucher is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherEqualTo(Integer value) {
            addCriterion("IncomeVoucher =", value, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherNotEqualTo(Integer value) {
            addCriterion("IncomeVoucher <>", value, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherGreaterThan(Integer value) {
            addCriterion("IncomeVoucher >", value, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherGreaterThanOrEqualTo(Integer value) {
            addCriterion("IncomeVoucher >=", value, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherLessThan(Integer value) {
            addCriterion("IncomeVoucher <", value, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherLessThanOrEqualTo(Integer value) {
            addCriterion("IncomeVoucher <=", value, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherIn(List<Integer> values) {
            addCriterion("IncomeVoucher in", values, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherNotIn(List<Integer> values) {
            addCriterion("IncomeVoucher not in", values, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherBetween(Integer value1, Integer value2) {
            addCriterion("IncomeVoucher between", value1, value2, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andIncomeVoucherNotBetween(Integer value1, Integer value2) {
            addCriterion("IncomeVoucher not between", value1, value2, "incomeVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherIsNull() {
            addCriterion("CostVoucher is null");
            return (Criteria) this;
        }

        public Criteria andCostVoucherIsNotNull() {
            addCriterion("CostVoucher is not null");
            return (Criteria) this;
        }

        public Criteria andCostVoucherEqualTo(Integer value) {
            addCriterion("CostVoucher =", value, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherNotEqualTo(Integer value) {
            addCriterion("CostVoucher <>", value, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherGreaterThan(Integer value) {
            addCriterion("CostVoucher >", value, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherGreaterThanOrEqualTo(Integer value) {
            addCriterion("CostVoucher >=", value, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherLessThan(Integer value) {
            addCriterion("CostVoucher <", value, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherLessThanOrEqualTo(Integer value) {
            addCriterion("CostVoucher <=", value, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherIn(List<Integer> values) {
            addCriterion("CostVoucher in", values, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherNotIn(List<Integer> values) {
            addCriterion("CostVoucher not in", values, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherBetween(Integer value1, Integer value2) {
            addCriterion("CostVoucher between", value1, value2, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andCostVoucherNotBetween(Integer value1, Integer value2) {
            addCriterion("CostVoucher not between", value1, value2, "costVoucher");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedIsNull() {
            addCriterion("OrderProcessed is null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedIsNotNull() {
            addCriterion("OrderProcessed is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedEqualTo(Boolean value) {
            addCriterion("OrderProcessed =", value, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedNotEqualTo(Boolean value) {
            addCriterion("OrderProcessed <>", value, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedGreaterThan(Boolean value) {
            addCriterion("OrderProcessed >", value, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OrderProcessed >=", value, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedLessThan(Boolean value) {
            addCriterion("OrderProcessed <", value, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedLessThanOrEqualTo(Boolean value) {
            addCriterion("OrderProcessed <=", value, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedIn(List<Boolean> values) {
            addCriterion("OrderProcessed in", values, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedNotIn(List<Boolean> values) {
            addCriterion("OrderProcessed not in", values, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedBetween(Boolean value1, Boolean value2) {
            addCriterion("OrderProcessed between", value1, value2, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OrderProcessed not between", value1, value2, "orderProcessed");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorIsNull() {
            addCriterion("OrderProcessor is null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorIsNotNull() {
            addCriterion("OrderProcessor is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorEqualTo(String value) {
            addCriterion("OrderProcessor =", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorNotEqualTo(String value) {
            addCriterion("OrderProcessor <>", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorGreaterThan(String value) {
            addCriterion("OrderProcessor >", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorGreaterThanOrEqualTo(String value) {
            addCriterion("OrderProcessor >=", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorLessThan(String value) {
            addCriterion("OrderProcessor <", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorLessThanOrEqualTo(String value) {
            addCriterion("OrderProcessor <=", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorLike(String value) {
            addCriterion("OrderProcessor like", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorNotLike(String value) {
            addCriterion("OrderProcessor not like", value, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorIn(List<String> values) {
            addCriterion("OrderProcessor in", values, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorNotIn(List<String> values) {
            addCriterion("OrderProcessor not in", values, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorBetween(String value1, String value2) {
            addCriterion("OrderProcessor between", value1, value2, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessorNotBetween(String value1, String value2) {
            addCriterion("OrderProcessor not between", value1, value2, "orderProcessor");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeIsNull() {
            addCriterion("OrderProcessTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeIsNotNull() {
            addCriterion("OrderProcessTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeEqualTo(Date value) {
            addCriterion("OrderProcessTime =", value, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeNotEqualTo(Date value) {
            addCriterion("OrderProcessTime <>", value, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeGreaterThan(Date value) {
            addCriterion("OrderProcessTime >", value, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderProcessTime >=", value, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeLessThan(Date value) {
            addCriterion("OrderProcessTime <", value, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderProcessTime <=", value, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeIn(List<Date> values) {
            addCriterion("OrderProcessTime in", values, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeNotIn(List<Date> values) {
            addCriterion("OrderProcessTime not in", values, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeBetween(Date value1, Date value2) {
            addCriterion("OrderProcessTime between", value1, value2, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderProcessTime not between", value1, value2, "orderProcessTime");
            return (Criteria) this;
        }

        public Criteria andOrderProductsIsNull() {
            addCriterion("OrderProducts is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductsIsNotNull() {
            addCriterion("OrderProducts is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductsEqualTo(String value) {
            addCriterion("OrderProducts =", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsNotEqualTo(String value) {
            addCriterion("OrderProducts <>", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsGreaterThan(String value) {
            addCriterion("OrderProducts >", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsGreaterThanOrEqualTo(String value) {
            addCriterion("OrderProducts >=", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsLessThan(String value) {
            addCriterion("OrderProducts <", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsLessThanOrEqualTo(String value) {
            addCriterion("OrderProducts <=", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsLike(String value) {
            addCriterion("OrderProducts like", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsNotLike(String value) {
            addCriterion("OrderProducts not like", value, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsIn(List<String> values) {
            addCriterion("OrderProducts in", values, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsNotIn(List<String> values) {
            addCriterion("OrderProducts not in", values, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsBetween(String value1, String value2) {
            addCriterion("OrderProducts between", value1, value2, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andOrderProductsNotBetween(String value1, String value2) {
            addCriterion("OrderProducts not between", value1, value2, "orderProducts");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIsNull() {
            addCriterion("DeliveryCompany is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIsNotNull() {
            addCriterion("DeliveryCompany is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyEqualTo(String value) {
            addCriterion("DeliveryCompany =", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotEqualTo(String value) {
            addCriterion("DeliveryCompany <>", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyGreaterThan(String value) {
            addCriterion("DeliveryCompany >", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryCompany >=", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyLessThan(String value) {
            addCriterion("DeliveryCompany <", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyLessThanOrEqualTo(String value) {
            addCriterion("DeliveryCompany <=", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyLike(String value) {
            addCriterion("DeliveryCompany like", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotLike(String value) {
            addCriterion("DeliveryCompany not like", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIn(List<String> values) {
            addCriterion("DeliveryCompany in", values, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotIn(List<String> values) {
            addCriterion("DeliveryCompany not in", values, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyBetween(String value1, String value2) {
            addCriterion("DeliveryCompany between", value1, value2, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotBetween(String value1, String value2) {
            addCriterion("DeliveryCompany not between", value1, value2, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateIsNull() {
            addCriterion("RecheiveDate is null");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateIsNotNull() {
            addCriterion("RecheiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateEqualTo(Date value) {
            addCriterion("RecheiveDate =", value, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateNotEqualTo(Date value) {
            addCriterion("RecheiveDate <>", value, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateGreaterThan(Date value) {
            addCriterion("RecheiveDate >", value, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RecheiveDate >=", value, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateLessThan(Date value) {
            addCriterion("RecheiveDate <", value, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateLessThanOrEqualTo(Date value) {
            addCriterion("RecheiveDate <=", value, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateIn(List<Date> values) {
            addCriterion("RecheiveDate in", values, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateNotIn(List<Date> values) {
            addCriterion("RecheiveDate not in", values, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateBetween(Date value1, Date value2) {
            addCriterion("RecheiveDate between", value1, value2, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andRecheiveDateNotBetween(Date value1, Date value2) {
            addCriterion("RecheiveDate not between", value1, value2, "recheiveDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDIsNull() {
            addCriterion("DeliveryAddressID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDIsNotNull() {
            addCriterion("DeliveryAddressID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDEqualTo(String value) {
            addCriterion("DeliveryAddressID =", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDNotEqualTo(String value) {
            addCriterion("DeliveryAddressID <>", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDGreaterThan(String value) {
            addCriterion("DeliveryAddressID >", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryAddressID >=", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDLessThan(String value) {
            addCriterion("DeliveryAddressID <", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDLessThanOrEqualTo(String value) {
            addCriterion("DeliveryAddressID <=", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDLike(String value) {
            addCriterion("DeliveryAddressID like", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDNotLike(String value) {
            addCriterion("DeliveryAddressID not like", value, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDIn(List<String> values) {
            addCriterion("DeliveryAddressID in", values, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDNotIn(List<String> values) {
            addCriterion("DeliveryAddressID not in", values, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDBetween(String value1, String value2) {
            addCriterion("DeliveryAddressID between", value1, value2, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIDNotBetween(String value1, String value2) {
            addCriterion("DeliveryAddressID not between", value1, value2, "deliveryAddressID");
            return (Criteria) this;
        }

        public Criteria andTranRefNumIsNull() {
            addCriterion("TranRefNum is null");
            return (Criteria) this;
        }

        public Criteria andTranRefNumIsNotNull() {
            addCriterion("TranRefNum is not null");
            return (Criteria) this;
        }

        public Criteria andTranRefNumEqualTo(String value) {
            addCriterion("TranRefNum =", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumNotEqualTo(String value) {
            addCriterion("TranRefNum <>", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumGreaterThan(String value) {
            addCriterion("TranRefNum >", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumGreaterThanOrEqualTo(String value) {
            addCriterion("TranRefNum >=", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumLessThan(String value) {
            addCriterion("TranRefNum <", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumLessThanOrEqualTo(String value) {
            addCriterion("TranRefNum <=", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumLike(String value) {
            addCriterion("TranRefNum like", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumNotLike(String value) {
            addCriterion("TranRefNum not like", value, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumIn(List<String> values) {
            addCriterion("TranRefNum in", values, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumNotIn(List<String> values) {
            addCriterion("TranRefNum not in", values, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumBetween(String value1, String value2) {
            addCriterion("TranRefNum between", value1, value2, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andTranRefNumNotBetween(String value1, String value2) {
            addCriterion("TranRefNum not between", value1, value2, "tranRefNum");
            return (Criteria) this;
        }

        public Criteria andCheckMarkIsNull() {
            addCriterion("CheckMark is null");
            return (Criteria) this;
        }

        public Criteria andCheckMarkIsNotNull() {
            addCriterion("CheckMark is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMarkEqualTo(Boolean value) {
            addCriterion("CheckMark =", value, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkNotEqualTo(Boolean value) {
            addCriterion("CheckMark <>", value, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkGreaterThan(Boolean value) {
            addCriterion("CheckMark >", value, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CheckMark >=", value, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkLessThan(Boolean value) {
            addCriterion("CheckMark <", value, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkLessThanOrEqualTo(Boolean value) {
            addCriterion("CheckMark <=", value, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkIn(List<Boolean> values) {
            addCriterion("CheckMark in", values, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkNotIn(List<Boolean> values) {
            addCriterion("CheckMark not in", values, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkBetween(Boolean value1, Boolean value2) {
            addCriterion("CheckMark between", value1, value2, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckMarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CheckMark not between", value1, value2, "checkMark");
            return (Criteria) this;
        }

        public Criteria andCheckCommentIsNull() {
            addCriterion("CheckComment is null");
            return (Criteria) this;
        }

        public Criteria andCheckCommentIsNotNull() {
            addCriterion("CheckComment is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCommentEqualTo(String value) {
            addCriterion("CheckComment =", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotEqualTo(String value) {
            addCriterion("CheckComment <>", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentGreaterThan(String value) {
            addCriterion("CheckComment >", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentGreaterThanOrEqualTo(String value) {
            addCriterion("CheckComment >=", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentLessThan(String value) {
            addCriterion("CheckComment <", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentLessThanOrEqualTo(String value) {
            addCriterion("CheckComment <=", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentLike(String value) {
            addCriterion("CheckComment like", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotLike(String value) {
            addCriterion("CheckComment not like", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentIn(List<String> values) {
            addCriterion("CheckComment in", values, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotIn(List<String> values) {
            addCriterion("CheckComment not in", values, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentBetween(String value1, String value2) {
            addCriterion("CheckComment between", value1, value2, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotBetween(String value1, String value2) {
            addCriterion("CheckComment not between", value1, value2, "checkComment");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerIsNull() {
            addCriterion("TuHuHandler is null");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerIsNotNull() {
            addCriterion("TuHuHandler is not null");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerEqualTo(String value) {
            addCriterion("TuHuHandler =", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerNotEqualTo(String value) {
            addCriterion("TuHuHandler <>", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerGreaterThan(String value) {
            addCriterion("TuHuHandler >", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("TuHuHandler >=", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerLessThan(String value) {
            addCriterion("TuHuHandler <", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerLessThanOrEqualTo(String value) {
            addCriterion("TuHuHandler <=", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerLike(String value) {
            addCriterion("TuHuHandler like", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerNotLike(String value) {
            addCriterion("TuHuHandler not like", value, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerIn(List<String> values) {
            addCriterion("TuHuHandler in", values, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerNotIn(List<String> values) {
            addCriterion("TuHuHandler not in", values, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerBetween(String value1, String value2) {
            addCriterion("TuHuHandler between", value1, value2, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andTuHuHandlerNotBetween(String value1, String value2) {
            addCriterion("TuHuHandler not between", value1, value2, "tuHuHandler");
            return (Criteria) this;
        }

        public Criteria andHandleCommentIsNull() {
            addCriterion("HandleComment is null");
            return (Criteria) this;
        }

        public Criteria andHandleCommentIsNotNull() {
            addCriterion("HandleComment is not null");
            return (Criteria) this;
        }

        public Criteria andHandleCommentEqualTo(String value) {
            addCriterion("HandleComment =", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotEqualTo(String value) {
            addCriterion("HandleComment <>", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentGreaterThan(String value) {
            addCriterion("HandleComment >", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentGreaterThanOrEqualTo(String value) {
            addCriterion("HandleComment >=", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentLessThan(String value) {
            addCriterion("HandleComment <", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentLessThanOrEqualTo(String value) {
            addCriterion("HandleComment <=", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentLike(String value) {
            addCriterion("HandleComment like", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotLike(String value) {
            addCriterion("HandleComment not like", value, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentIn(List<String> values) {
            addCriterion("HandleComment in", values, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotIn(List<String> values) {
            addCriterion("HandleComment not in", values, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentBetween(String value1, String value2) {
            addCriterion("HandleComment between", value1, value2, "handleComment");
            return (Criteria) this;
        }

        public Criteria andHandleCommentNotBetween(String value1, String value2) {
            addCriterion("HandleComment not between", value1, value2, "handleComment");
            return (Criteria) this;
        }

        public Criteria andIsHandleIsNull() {
            addCriterion("IsHandle is null");
            return (Criteria) this;
        }

        public Criteria andIsHandleIsNotNull() {
            addCriterion("IsHandle is not null");
            return (Criteria) this;
        }

        public Criteria andIsHandleEqualTo(Boolean value) {
            addCriterion("IsHandle =", value, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleNotEqualTo(Boolean value) {
            addCriterion("IsHandle <>", value, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleGreaterThan(Boolean value) {
            addCriterion("IsHandle >", value, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsHandle >=", value, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleLessThan(Boolean value) {
            addCriterion("IsHandle <", value, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleLessThanOrEqualTo(Boolean value) {
            addCriterion("IsHandle <=", value, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleIn(List<Boolean> values) {
            addCriterion("IsHandle in", values, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleNotIn(List<Boolean> values) {
            addCriterion("IsHandle not in", values, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHandle between", value1, value2, "isHandle");
            return (Criteria) this;
        }

        public Criteria andIsHandleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHandle not between", value1, value2, "isHandle");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIsNull() {
            addCriterion("PurchaseStatus is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIsNotNull() {
            addCriterion("PurchaseStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusEqualTo(Integer value) {
            addCriterion("PurchaseStatus =", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotEqualTo(Integer value) {
            addCriterion("PurchaseStatus <>", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThan(Integer value) {
            addCriterion("PurchaseStatus >", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PurchaseStatus >=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThan(Integer value) {
            addCriterion("PurchaseStatus <", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("PurchaseStatus <=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIn(List<Integer> values) {
            addCriterion("PurchaseStatus in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotIn(List<Integer> values) {
            addCriterion("PurchaseStatus not in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusBetween(Integer value1, Integer value2) {
            addCriterion("PurchaseStatus between", value1, value2, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PurchaseStatus not between", value1, value2, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andRegionIDIsNull() {
            addCriterion("RegionID is null");
            return (Criteria) this;
        }

        public Criteria andRegionIDIsNotNull() {
            addCriterion("RegionID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIDEqualTo(Integer value) {
            addCriterion("RegionID =", value, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDNotEqualTo(Integer value) {
            addCriterion("RegionID <>", value, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDGreaterThan(Integer value) {
            addCriterion("RegionID >", value, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegionID >=", value, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDLessThan(Integer value) {
            addCriterion("RegionID <", value, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDLessThanOrEqualTo(Integer value) {
            addCriterion("RegionID <=", value, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDIn(List<Integer> values) {
            addCriterion("RegionID in", values, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDNotIn(List<Integer> values) {
            addCriterion("RegionID not in", values, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDBetween(Integer value1, Integer value2) {
            addCriterion("RegionID between", value1, value2, "regionID");
            return (Criteria) this;
        }

        public Criteria andRegionIDNotBetween(Integer value1, Integer value2) {
            addCriterion("RegionID not between", value1, value2, "regionID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDIsNull() {
            addCriterion("WareHouseID is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDIsNotNull() {
            addCriterion("WareHouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDEqualTo(Integer value) {
            addCriterion("WareHouseID =", value, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDNotEqualTo(Integer value) {
            addCriterion("WareHouseID <>", value, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDGreaterThan(Integer value) {
            addCriterion("WareHouseID >", value, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("WareHouseID >=", value, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDLessThan(Integer value) {
            addCriterion("WareHouseID <", value, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDLessThanOrEqualTo(Integer value) {
            addCriterion("WareHouseID <=", value, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDIn(List<Integer> values) {
            addCriterion("WareHouseID in", values, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDNotIn(List<Integer> values) {
            addCriterion("WareHouseID not in", values, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDBetween(Integer value1, Integer value2) {
            addCriterion("WareHouseID between", value1, value2, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseIDNotBetween(Integer value1, Integer value2) {
            addCriterion("WareHouseID not between", value1, value2, "wareHouseID");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameIsNull() {
            addCriterion("WareHouseName is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameIsNotNull() {
            addCriterion("WareHouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameEqualTo(String value) {
            addCriterion("WareHouseName =", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotEqualTo(String value) {
            addCriterion("WareHouseName <>", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameGreaterThan(String value) {
            addCriterion("WareHouseName >", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouseName >=", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameLessThan(String value) {
            addCriterion("WareHouseName <", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameLessThanOrEqualTo(String value) {
            addCriterion("WareHouseName <=", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameLike(String value) {
            addCriterion("WareHouseName like", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotLike(String value) {
            addCriterion("WareHouseName not like", value, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameIn(List<String> values) {
            addCriterion("WareHouseName in", values, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotIn(List<String> values) {
            addCriterion("WareHouseName not in", values, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameBetween(String value1, String value2) {
            addCriterion("WareHouseName between", value1, value2, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andWareHouseNameNotBetween(String value1, String value2) {
            addCriterion("WareHouseName not between", value1, value2, "wareHouseName");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateIsNull() {
            addCriterion("RefOrderState is null");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateIsNotNull() {
            addCriterion("RefOrderState is not null");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateEqualTo(Integer value) {
            addCriterion("RefOrderState =", value, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateNotEqualTo(Integer value) {
            addCriterion("RefOrderState <>", value, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateGreaterThan(Integer value) {
            addCriterion("RefOrderState >", value, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RefOrderState >=", value, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateLessThan(Integer value) {
            addCriterion("RefOrderState <", value, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("RefOrderState <=", value, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateIn(List<Integer> values) {
            addCriterion("RefOrderState in", values, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateNotIn(List<Integer> values) {
            addCriterion("RefOrderState not in", values, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("RefOrderState between", value1, value2, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andRefOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("RefOrderState not between", value1, value2, "refOrderState");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeIsNull() {
            addCriterion("BuyAgainType is null");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeIsNotNull() {
            addCriterion("BuyAgainType is not null");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeEqualTo(String value) {
            addCriterion("BuyAgainType =", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeNotEqualTo(String value) {
            addCriterion("BuyAgainType <>", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeGreaterThan(String value) {
            addCriterion("BuyAgainType >", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BuyAgainType >=", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeLessThan(String value) {
            addCriterion("BuyAgainType <", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeLessThanOrEqualTo(String value) {
            addCriterion("BuyAgainType <=", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeLike(String value) {
            addCriterion("BuyAgainType like", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeNotLike(String value) {
            addCriterion("BuyAgainType not like", value, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeIn(List<String> values) {
            addCriterion("BuyAgainType in", values, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeNotIn(List<String> values) {
            addCriterion("BuyAgainType not in", values, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeBetween(String value1, String value2) {
            addCriterion("BuyAgainType between", value1, value2, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andBuyAgainTypeNotBetween(String value1, String value2) {
            addCriterion("BuyAgainType not between", value1, value2, "buyAgainType");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("DriverName is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("DriverName is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("DriverName =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("DriverName <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("DriverName >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("DriverName >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("DriverName <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("DriverName <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("DriverName like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("DriverName not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("DriverName in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("DriverName not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("DriverName between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("DriverName not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("SubmitDate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("SubmitDate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("SubmitDate =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("SubmitDate <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("SubmitDate >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SubmitDate >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("SubmitDate <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("SubmitDate <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("SubmitDate in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("SubmitDate not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("SubmitDate between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("SubmitDate not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andIsReminderIsNull() {
            addCriterion("IsReminder is null");
            return (Criteria) this;
        }

        public Criteria andIsReminderIsNotNull() {
            addCriterion("IsReminder is not null");
            return (Criteria) this;
        }

        public Criteria andIsReminderEqualTo(Boolean value) {
            addCriterion("IsReminder =", value, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderNotEqualTo(Boolean value) {
            addCriterion("IsReminder <>", value, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderGreaterThan(Boolean value) {
            addCriterion("IsReminder >", value, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsReminder >=", value, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderLessThan(Boolean value) {
            addCriterion("IsReminder <", value, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderLessThanOrEqualTo(Boolean value) {
            addCriterion("IsReminder <=", value, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderIn(List<Boolean> values) {
            addCriterion("IsReminder in", values, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderNotIn(List<Boolean> values) {
            addCriterion("IsReminder not in", values, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReminder between", value1, value2, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsReminderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReminder not between", value1, value2, "isReminder");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("IsGift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("IsGift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Boolean value) {
            addCriterion("IsGift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Boolean value) {
            addCriterion("IsGift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Boolean value) {
            addCriterion("IsGift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsGift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Boolean value) {
            addCriterion("IsGift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Boolean value) {
            addCriterion("IsGift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Boolean> values) {
            addCriterion("IsGift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Boolean> values) {
            addCriterion("IsGift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeIsNull() {
            addCriterion("GetGiftDateTime is null");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeIsNotNull() {
            addCriterion("GetGiftDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeEqualTo(Date value) {
            addCriterion("GetGiftDateTime =", value, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeNotEqualTo(Date value) {
            addCriterion("GetGiftDateTime <>", value, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeGreaterThan(Date value) {
            addCriterion("GetGiftDateTime >", value, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GetGiftDateTime >=", value, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeLessThan(Date value) {
            addCriterion("GetGiftDateTime <", value, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("GetGiftDateTime <=", value, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeIn(List<Date> values) {
            addCriterion("GetGiftDateTime in", values, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeNotIn(List<Date> values) {
            addCriterion("GetGiftDateTime not in", values, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeBetween(Date value1, Date value2) {
            addCriterion("GetGiftDateTime between", value1, value2, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andGetGiftDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("GetGiftDateTime not between", value1, value2, "getGiftDateTime");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoIsNull() {
            addCriterion("InstallOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoIsNotNull() {
            addCriterion("InstallOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoEqualTo(String value) {
            addCriterion("InstallOrderNo =", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoNotEqualTo(String value) {
            addCriterion("InstallOrderNo <>", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoGreaterThan(String value) {
            addCriterion("InstallOrderNo >", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("InstallOrderNo >=", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoLessThan(String value) {
            addCriterion("InstallOrderNo <", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoLessThanOrEqualTo(String value) {
            addCriterion("InstallOrderNo <=", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoLike(String value) {
            addCriterion("InstallOrderNo like", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoNotLike(String value) {
            addCriterion("InstallOrderNo not like", value, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoIn(List<String> values) {
            addCriterion("InstallOrderNo in", values, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoNotIn(List<String> values) {
            addCriterion("InstallOrderNo not in", values, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoBetween(String value1, String value2) {
            addCriterion("InstallOrderNo between", value1, value2, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andInstallOrderNoNotBetween(String value1, String value2) {
            addCriterion("InstallOrderNo not between", value1, value2, "installOrderNo");
            return (Criteria) this;
        }

        public Criteria andGotPayDateIsNull() {
            addCriterion("GotPayDate is null");
            return (Criteria) this;
        }

        public Criteria andGotPayDateIsNotNull() {
            addCriterion("GotPayDate is not null");
            return (Criteria) this;
        }

        public Criteria andGotPayDateEqualTo(Date value) {
            addCriterion("GotPayDate =", value, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateNotEqualTo(Date value) {
            addCriterion("GotPayDate <>", value, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateGreaterThan(Date value) {
            addCriterion("GotPayDate >", value, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("GotPayDate >=", value, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateLessThan(Date value) {
            addCriterion("GotPayDate <", value, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateLessThanOrEqualTo(Date value) {
            addCriterion("GotPayDate <=", value, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateIn(List<Date> values) {
            addCriterion("GotPayDate in", values, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateNotIn(List<Date> values) {
            addCriterion("GotPayDate not in", values, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateBetween(Date value1, Date value2) {
            addCriterion("GotPayDate between", value1, value2, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andGotPayDateNotBetween(Date value1, Date value2) {
            addCriterion("GotPayDate not between", value1, value2, "gotPayDate");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyIsNull() {
            addCriterion("PromotionMoney is null");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyIsNotNull() {
            addCriterion("PromotionMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyEqualTo(BigDecimal value) {
            addCriterion("PromotionMoney =", value, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("PromotionMoney <>", value, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyGreaterThan(BigDecimal value) {
            addCriterion("PromotionMoney >", value, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PromotionMoney >=", value, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyLessThan(BigDecimal value) {
            addCriterion("PromotionMoney <", value, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PromotionMoney <=", value, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyIn(List<BigDecimal> values) {
            addCriterion("PromotionMoney in", values, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("PromotionMoney not in", values, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PromotionMoney between", value1, value2, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andPromotionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PromotionMoney not between", value1, value2, "promotionMoney");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeIsNull() {
            addCriterion("BookSentDateTime is null");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeIsNotNull() {
            addCriterion("BookSentDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeEqualTo(Date value) {
            addCriterion("BookSentDateTime =", value, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeNotEqualTo(Date value) {
            addCriterion("BookSentDateTime <>", value, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeGreaterThan(Date value) {
            addCriterion("BookSentDateTime >", value, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BookSentDateTime >=", value, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeLessThan(Date value) {
            addCriterion("BookSentDateTime <", value, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("BookSentDateTime <=", value, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeIn(List<Date> values) {
            addCriterion("BookSentDateTime in", values, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeNotIn(List<Date> values) {
            addCriterion("BookSentDateTime not in", values, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeBetween(Date value1, Date value2) {
            addCriterion("BookSentDateTime between", value1, value2, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andBookSentDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("BookSentDateTime not between", value1, value2, "bookSentDateTime");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionIsNull() {
            addCriterion("SumPayDeduction is null");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionIsNotNull() {
            addCriterion("SumPayDeduction is not null");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionEqualTo(BigDecimal value) {
            addCriterion("SumPayDeduction =", value, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionNotEqualTo(BigDecimal value) {
            addCriterion("SumPayDeduction <>", value, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionGreaterThan(BigDecimal value) {
            addCriterion("SumPayDeduction >", value, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumPayDeduction >=", value, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionLessThan(BigDecimal value) {
            addCriterion("SumPayDeduction <", value, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumPayDeduction <=", value, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionIn(List<BigDecimal> values) {
            addCriterion("SumPayDeduction in", values, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionNotIn(List<BigDecimal> values) {
            addCriterion("SumPayDeduction not in", values, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumPayDeduction between", value1, value2, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayDeductionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumPayDeduction not between", value1, value2, "sumPayDeduction");
            return (Criteria) this;
        }

        public Criteria andSumPayableIsNull() {
            addCriterion("SumPayable is null");
            return (Criteria) this;
        }

        public Criteria andSumPayableIsNotNull() {
            addCriterion("SumPayable is not null");
            return (Criteria) this;
        }

        public Criteria andSumPayableEqualTo(BigDecimal value) {
            addCriterion("SumPayable =", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableNotEqualTo(BigDecimal value) {
            addCriterion("SumPayable <>", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableGreaterThan(BigDecimal value) {
            addCriterion("SumPayable >", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumPayable >=", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableLessThan(BigDecimal value) {
            addCriterion("SumPayable <", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumPayable <=", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableIn(List<BigDecimal> values) {
            addCriterion("SumPayable in", values, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableNotIn(List<BigDecimal> values) {
            addCriterion("SumPayable not in", values, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumPayable between", value1, value2, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumPayable not between", value1, value2, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumListPriceIsNull() {
            addCriterion("SumListPrice is null");
            return (Criteria) this;
        }

        public Criteria andSumListPriceIsNotNull() {
            addCriterion("SumListPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSumListPriceEqualTo(BigDecimal value) {
            addCriterion("SumListPrice =", value, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceNotEqualTo(BigDecimal value) {
            addCriterion("SumListPrice <>", value, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceGreaterThan(BigDecimal value) {
            addCriterion("SumListPrice >", value, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumListPrice >=", value, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceLessThan(BigDecimal value) {
            addCriterion("SumListPrice <", value, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumListPrice <=", value, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceIn(List<BigDecimal> values) {
            addCriterion("SumListPrice in", values, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceNotIn(List<BigDecimal> values) {
            addCriterion("SumListPrice not in", values, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumListPrice between", value1, value2, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumListPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumListPrice not between", value1, value2, "sumListPrice");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountIsNull() {
            addCriterion("SumManualDiscount is null");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountIsNotNull() {
            addCriterion("SumManualDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountEqualTo(BigDecimal value) {
            addCriterion("SumManualDiscount =", value, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountNotEqualTo(BigDecimal value) {
            addCriterion("SumManualDiscount <>", value, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountGreaterThan(BigDecimal value) {
            addCriterion("SumManualDiscount >", value, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SumManualDiscount >=", value, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountLessThan(BigDecimal value) {
            addCriterion("SumManualDiscount <", value, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SumManualDiscount <=", value, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountIn(List<BigDecimal> values) {
            addCriterion("SumManualDiscount in", values, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountNotIn(List<BigDecimal> values) {
            addCriterion("SumManualDiscount not in", values, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumManualDiscount between", value1, value2, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andSumManualDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SumManualDiscount not between", value1, value2, "sumManualDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDIsNull() {
            addCriterion("OrderStockID is null");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDIsNotNull() {
            addCriterion("OrderStockID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDEqualTo(Integer value) {
            addCriterion("OrderStockID =", value, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDNotEqualTo(Integer value) {
            addCriterion("OrderStockID <>", value, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDGreaterThan(Integer value) {
            addCriterion("OrderStockID >", value, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderStockID >=", value, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDLessThan(Integer value) {
            addCriterion("OrderStockID <", value, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDLessThanOrEqualTo(Integer value) {
            addCriterion("OrderStockID <=", value, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDIn(List<Integer> values) {
            addCriterion("OrderStockID in", values, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDNotIn(List<Integer> values) {
            addCriterion("OrderStockID not in", values, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDBetween(Integer value1, Integer value2) {
            addCriterion("OrderStockID between", value1, value2, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockIDNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderStockID not between", value1, value2, "orderStockID");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameIsNull() {
            addCriterion("OrderStockName is null");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameIsNotNull() {
            addCriterion("OrderStockName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameEqualTo(String value) {
            addCriterion("OrderStockName =", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameNotEqualTo(String value) {
            addCriterion("OrderStockName <>", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameGreaterThan(String value) {
            addCriterion("OrderStockName >", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderStockName >=", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameLessThan(String value) {
            addCriterion("OrderStockName <", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameLessThanOrEqualTo(String value) {
            addCriterion("OrderStockName <=", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameLike(String value) {
            addCriterion("OrderStockName like", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameNotLike(String value) {
            addCriterion("OrderStockName not like", value, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameIn(List<String> values) {
            addCriterion("OrderStockName in", values, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameNotIn(List<String> values) {
            addCriterion("OrderStockName not in", values, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameBetween(String value1, String value2) {
            addCriterion("OrderStockName between", value1, value2, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andOrderStockNameNotBetween(String value1, String value2) {
            addCriterion("OrderStockName not between", value1, value2, "orderStockName");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeIsNull() {
            addCriterion("RecieveDatetime is null");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeIsNotNull() {
            addCriterion("RecieveDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeEqualTo(Date value) {
            addCriterion("RecieveDatetime =", value, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeNotEqualTo(Date value) {
            addCriterion("RecieveDatetime <>", value, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeGreaterThan(Date value) {
            addCriterion("RecieveDatetime >", value, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RecieveDatetime >=", value, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeLessThan(Date value) {
            addCriterion("RecieveDatetime <", value, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("RecieveDatetime <=", value, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeIn(List<Date> values) {
            addCriterion("RecieveDatetime in", values, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeNotIn(List<Date> values) {
            addCriterion("RecieveDatetime not in", values, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeBetween(Date value1, Date value2) {
            addCriterion("RecieveDatetime between", value1, value2, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andRecieveDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("RecieveDatetime not between", value1, value2, "recieveDatetime");
            return (Criteria) this;
        }

        public Criteria andPayCategoryIsNull() {
            addCriterion("PayCategory is null");
            return (Criteria) this;
        }

        public Criteria andPayCategoryIsNotNull() {
            addCriterion("PayCategory is not null");
            return (Criteria) this;
        }

        public Criteria andPayCategoryEqualTo(String value) {
            addCriterion("PayCategory =", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotEqualTo(String value) {
            addCriterion("PayCategory <>", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryGreaterThan(String value) {
            addCriterion("PayCategory >", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PayCategory >=", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryLessThan(String value) {
            addCriterion("PayCategory <", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryLessThanOrEqualTo(String value) {
            addCriterion("PayCategory <=", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryLike(String value) {
            addCriterion("PayCategory like", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotLike(String value) {
            addCriterion("PayCategory not like", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryIn(List<String> values) {
            addCriterion("PayCategory in", values, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotIn(List<String> values) {
            addCriterion("PayCategory not in", values, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryBetween(String value1, String value2) {
            addCriterion("PayCategory between", value1, value2, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotBetween(String value1, String value2) {
            addCriterion("PayCategory not between", value1, value2, "payCategory");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeIsNull() {
            addCriterion("OrderProductType is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeIsNotNull() {
            addCriterion("OrderProductType is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeEqualTo(String value) {
            addCriterion("OrderProductType =", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeNotEqualTo(String value) {
            addCriterion("OrderProductType <>", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeGreaterThan(String value) {
            addCriterion("OrderProductType >", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderProductType >=", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeLessThan(String value) {
            addCriterion("OrderProductType <", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeLessThanOrEqualTo(String value) {
            addCriterion("OrderProductType <=", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeLike(String value) {
            addCriterion("OrderProductType like", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeNotLike(String value) {
            addCriterion("OrderProductType not like", value, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeIn(List<String> values) {
            addCriterion("OrderProductType in", values, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeNotIn(List<String> values) {
            addCriterion("OrderProductType not in", values, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeBetween(String value1, String value2) {
            addCriterion("OrderProductType between", value1, value2, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andOrderProductTypeNotBetween(String value1, String value2) {
            addCriterion("OrderProductType not between", value1, value2, "orderProductType");
            return (Criteria) this;
        }

        public Criteria andTradeIDIsNull() {
            addCriterion("TradeID is null");
            return (Criteria) this;
        }

        public Criteria andTradeIDIsNotNull() {
            addCriterion("TradeID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIDEqualTo(Long value) {
            addCriterion("TradeID =", value, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDNotEqualTo(Long value) {
            addCriterion("TradeID <>", value, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDGreaterThan(Long value) {
            addCriterion("TradeID >", value, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDGreaterThanOrEqualTo(Long value) {
            addCriterion("TradeID >=", value, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDLessThan(Long value) {
            addCriterion("TradeID <", value, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDLessThanOrEqualTo(Long value) {
            addCriterion("TradeID <=", value, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDIn(List<Long> values) {
            addCriterion("TradeID in", values, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDNotIn(List<Long> values) {
            addCriterion("TradeID not in", values, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDBetween(Long value1, Long value2) {
            addCriterion("TradeID between", value1, value2, "tradeID");
            return (Criteria) this;
        }

        public Criteria andTradeIDNotBetween(Long value1, Long value2) {
            addCriterion("TradeID not between", value1, value2, "tradeID");
            return (Criteria) this;
        }

        public Criteria andSourceIDIsNull() {
            addCriterion("SourceID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIDIsNotNull() {
            addCriterion("SourceID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIDEqualTo(Integer value) {
            addCriterion("SourceID =", value, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDNotEqualTo(Integer value) {
            addCriterion("SourceID <>", value, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDGreaterThan(Integer value) {
            addCriterion("SourceID >", value, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("SourceID >=", value, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDLessThan(Integer value) {
            addCriterion("SourceID <", value, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDLessThanOrEqualTo(Integer value) {
            addCriterion("SourceID <=", value, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDIn(List<Integer> values) {
            addCriterion("SourceID in", values, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDNotIn(List<Integer> values) {
            addCriterion("SourceID not in", values, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDBetween(Integer value1, Integer value2) {
            addCriterion("SourceID between", value1, value2, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceIDNotBetween(Integer value1, Integer value2) {
            addCriterion("SourceID not between", value1, value2, "sourceID");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("SourceType is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SourceType is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("SourceType =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("SourceType <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("SourceType >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SourceType >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("SourceType <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SourceType <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("SourceType in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("SourceType not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("SourceType between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SourceType not between", value1, value2, "sourceType");
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