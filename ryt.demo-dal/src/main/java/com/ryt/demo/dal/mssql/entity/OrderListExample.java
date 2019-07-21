package com.ryt.demo.dal.mssql.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderListExample {
    protected String orderByClause;

    protected Integer offSet;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderListExample() {
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

        public Criteria andOrderIDIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIDIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIDEqualTo(Integer value) {
            addCriterion("OrderID =", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotEqualTo(Integer value) {
            addCriterion("OrderID <>", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThan(Integer value) {
            addCriterion("OrderID >", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderID >=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThan(Integer value) {
            addCriterion("OrderID <", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThanOrEqualTo(Integer value) {
            addCriterion("OrderID <=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDIn(List<Integer> values) {
            addCriterion("OrderID in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotIn(List<Integer> values) {
            addCriterion("OrderID not in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDBetween(Integer value1, Integer value2) {
            addCriterion("OrderID between", value1, value2, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderID not between", value1, value2, "orderID");
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

        public Criteria andPIDIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPIDIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPIDEqualTo(String value) {
            addCriterion("PID =", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotEqualTo(String value) {
            addCriterion("PID <>", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDGreaterThan(String value) {
            addCriterion("PID >", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLessThan(String value) {
            addCriterion("PID <", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLike(String value) {
            addCriterion("PID like", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotLike(String value) {
            addCriterion("PID not like", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDIn(List<String> values) {
            addCriterion("PID in", values, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotIn(List<String> values) {
            addCriterion("PID not in", values, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "PID");
            return (Criteria) this;
        }

        public Criteria andPoidIsNull() {
            addCriterion("Poid is null");
            return (Criteria) this;
        }

        public Criteria andPoidIsNotNull() {
            addCriterion("Poid is not null");
            return (Criteria) this;
        }

        public Criteria andPoidEqualTo(Integer value) {
            addCriterion("Poid =", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotEqualTo(Integer value) {
            addCriterion("Poid <>", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThan(Integer value) {
            addCriterion("Poid >", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Poid >=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThan(Integer value) {
            addCriterion("Poid <", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThanOrEqualTo(Integer value) {
            addCriterion("Poid <=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidIn(List<Integer> values) {
            addCriterion("Poid in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotIn(List<Integer> values) {
            addCriterion("Poid not in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidBetween(Integer value1, Integer value2) {
            addCriterion("Poid between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotBetween(Integer value1, Integer value2) {
            addCriterion("Poid not between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("Category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("Category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
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

        public Criteria andCarCodeIsNull() {
            addCriterion("CarCode is null");
            return (Criteria) this;
        }

        public Criteria andCarCodeIsNotNull() {
            addCriterion("CarCode is not null");
            return (Criteria) this;
        }

        public Criteria andCarCodeEqualTo(String value) {
            addCriterion("CarCode =", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotEqualTo(String value) {
            addCriterion("CarCode <>", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThan(String value) {
            addCriterion("CarCode >", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CarCode >=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThan(String value) {
            addCriterion("CarCode <", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThanOrEqualTo(String value) {
            addCriterion("CarCode <=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLike(String value) {
            addCriterion("CarCode like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotLike(String value) {
            addCriterion("CarCode not like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeIn(List<String> values) {
            addCriterion("CarCode in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotIn(List<String> values) {
            addCriterion("CarCode not in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeBetween(String value1, String value2) {
            addCriterion("CarCode between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotBetween(String value1, String value2) {
            addCriterion("CarCode not between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNull() {
            addCriterion("CarName is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("CarName is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("CarName =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("CarName <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("CarName >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("CarName >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("CarName <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("CarName <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("CarName like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("CarName not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("CarName in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("CarName not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("CarName between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("CarName not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("Num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("Num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("Num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("Num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("Num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("Num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("Num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("Num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("Num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("Num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceIsNull() {
            addCriterion("MarkedPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceIsNotNull() {
            addCriterion("MarkedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceEqualTo(BigDecimal value) {
            addCriterion("MarkedPrice =", value, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceNotEqualTo(BigDecimal value) {
            addCriterion("MarkedPrice <>", value, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceGreaterThan(BigDecimal value) {
            addCriterion("MarkedPrice >", value, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MarkedPrice >=", value, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceLessThan(BigDecimal value) {
            addCriterion("MarkedPrice <", value, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MarkedPrice <=", value, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceIn(List<BigDecimal> values) {
            addCriterion("MarkedPrice in", values, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceNotIn(List<BigDecimal> values) {
            addCriterion("MarkedPrice not in", values, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MarkedPrice between", value1, value2, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andMarkedPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MarkedPrice not between", value1, value2, "markedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNull() {
            addCriterion("TotalDiscount is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNotNull() {
            addCriterion("TotalDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount =", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount <>", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThan(BigDecimal value) {
            addCriterion("TotalDiscount >", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount >=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThan(BigDecimal value) {
            addCriterion("TotalDiscount <", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount <=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIn(List<BigDecimal> values) {
            addCriterion("TotalDiscount in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotIn(List<BigDecimal> values) {
            addCriterion("TotalDiscount not in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalDiscount between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalDiscount not between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("TotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("TotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("TotalPrice =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("TotalPrice <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("TotalPrice >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPrice >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("TotalPrice <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPrice <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("TotalPrice in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("TotalPrice not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPrice between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPrice not between", value1, value2, "totalPrice");
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

        public Criteria andPurchasePriceIsNull() {
            addCriterion("PurchasePrice is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("PurchasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("PurchasePrice >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("PurchasePrice <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice not between", value1, value2, "purchasePrice");
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

        public Criteria andVendorIsNull() {
            addCriterion("Vendor is null");
            return (Criteria) this;
        }

        public Criteria andVendorIsNotNull() {
            addCriterion("Vendor is not null");
            return (Criteria) this;
        }

        public Criteria andVendorEqualTo(String value) {
            addCriterion("Vendor =", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotEqualTo(String value) {
            addCriterion("Vendor <>", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThan(String value) {
            addCriterion("Vendor >", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThanOrEqualTo(String value) {
            addCriterion("Vendor >=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThan(String value) {
            addCriterion("Vendor <", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThanOrEqualTo(String value) {
            addCriterion("Vendor <=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLike(String value) {
            addCriterion("Vendor like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotLike(String value) {
            addCriterion("Vendor not like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorIn(List<String> values) {
            addCriterion("Vendor in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotIn(List<String> values) {
            addCriterion("Vendor not in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorBetween(String value1, String value2) {
            addCriterion("Vendor between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotBetween(String value1, String value2) {
            addCriterion("Vendor not between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("IsPaid is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("IsPaid is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Boolean value) {
            addCriterion("IsPaid =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Boolean value) {
            addCriterion("IsPaid <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Boolean value) {
            addCriterion("IsPaid >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsPaid >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Boolean value) {
            addCriterion("IsPaid <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Boolean value) {
            addCriterion("IsPaid <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Boolean> values) {
            addCriterion("IsPaid in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Boolean> values) {
            addCriterion("IsPaid not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Boolean value1, Boolean value2) {
            addCriterion("IsPaid between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsPaid not between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andPaidViaIsNull() {
            addCriterion("PaidVia is null");
            return (Criteria) this;
        }

        public Criteria andPaidViaIsNotNull() {
            addCriterion("PaidVia is not null");
            return (Criteria) this;
        }

        public Criteria andPaidViaEqualTo(String value) {
            addCriterion("PaidVia =", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaNotEqualTo(String value) {
            addCriterion("PaidVia <>", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaGreaterThan(String value) {
            addCriterion("PaidVia >", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaGreaterThanOrEqualTo(String value) {
            addCriterion("PaidVia >=", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaLessThan(String value) {
            addCriterion("PaidVia <", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaLessThanOrEqualTo(String value) {
            addCriterion("PaidVia <=", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaLike(String value) {
            addCriterion("PaidVia like", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaNotLike(String value) {
            addCriterion("PaidVia not like", value, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaIn(List<String> values) {
            addCriterion("PaidVia in", values, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaNotIn(List<String> values) {
            addCriterion("PaidVia not in", values, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaBetween(String value1, String value2) {
            addCriterion("PaidVia between", value1, value2, "paidVia");
            return (Criteria) this;
        }

        public Criteria andPaidViaNotBetween(String value1, String value2) {
            addCriterion("PaidVia not between", value1, value2, "paidVia");
            return (Criteria) this;
        }

        public Criteria andInstockDateIsNull() {
            addCriterion("InstockDate is null");
            return (Criteria) this;
        }

        public Criteria andInstockDateIsNotNull() {
            addCriterion("InstockDate is not null");
            return (Criteria) this;
        }

        public Criteria andInstockDateEqualTo(Date value) {
            addCriterion("InstockDate =", value, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateNotEqualTo(Date value) {
            addCriterion("InstockDate <>", value, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateGreaterThan(Date value) {
            addCriterion("InstockDate >", value, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("InstockDate >=", value, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateLessThan(Date value) {
            addCriterion("InstockDate <", value, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateLessThanOrEqualTo(Date value) {
            addCriterion("InstockDate <=", value, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateIn(List<Date> values) {
            addCriterion("InstockDate in", values, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateNotIn(List<Date> values) {
            addCriterion("InstockDate not in", values, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateBetween(Date value1, Date value2) {
            addCriterion("InstockDate between", value1, value2, "instockDate");
            return (Criteria) this;
        }

        public Criteria andInstockDateNotBetween(Date value1, Date value2) {
            addCriterion("InstockDate not between", value1, value2, "instockDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateIsNull() {
            addCriterion("PaidDate is null");
            return (Criteria) this;
        }

        public Criteria andPaidDateIsNotNull() {
            addCriterion("PaidDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaidDateEqualTo(Date value) {
            addCriterion("PaidDate =", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotEqualTo(Date value) {
            addCriterion("PaidDate <>", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateGreaterThan(Date value) {
            addCriterion("PaidDate >", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PaidDate >=", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateLessThan(Date value) {
            addCriterion("PaidDate <", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateLessThanOrEqualTo(Date value) {
            addCriterion("PaidDate <=", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateIn(List<Date> values) {
            addCriterion("PaidDate in", values, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotIn(List<Date> values) {
            addCriterion("PaidDate not in", values, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateBetween(Date value1, Date value2) {
            addCriterion("PaidDate between", value1, value2, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotBetween(Date value1, Date value2) {
            addCriterion("PaidDate not between", value1, value2, "paidDate");
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

        public Criteria andPurchaseStatusEqualTo(String value) {
            addCriterion("PurchaseStatus =", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotEqualTo(String value) {
            addCriterion("PurchaseStatus <>", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThan(String value) {
            addCriterion("PurchaseStatus >", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PurchaseStatus >=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThan(String value) {
            addCriterion("PurchaseStatus <", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThanOrEqualTo(String value) {
            addCriterion("PurchaseStatus <=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLike(String value) {
            addCriterion("PurchaseStatus like", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotLike(String value) {
            addCriterion("PurchaseStatus not like", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIn(List<String> values) {
            addCriterion("PurchaseStatus in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotIn(List<String> values) {
            addCriterion("PurchaseStatus not in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusBetween(String value1, String value2) {
            addCriterion("PurchaseStatus between", value1, value2, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotBetween(String value1, String value2) {
            addCriterion("PurchaseStatus not between", value1, value2, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidIsNull() {
            addCriterion("IsInstallFeePaid is null");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidIsNotNull() {
            addCriterion("IsInstallFeePaid is not null");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidEqualTo(Boolean value) {
            addCriterion("IsInstallFeePaid =", value, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidNotEqualTo(Boolean value) {
            addCriterion("IsInstallFeePaid <>", value, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidGreaterThan(Boolean value) {
            addCriterion("IsInstallFeePaid >", value, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsInstallFeePaid >=", value, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidLessThan(Boolean value) {
            addCriterion("IsInstallFeePaid <", value, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidLessThanOrEqualTo(Boolean value) {
            addCriterion("IsInstallFeePaid <=", value, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidIn(List<Boolean> values) {
            addCriterion("IsInstallFeePaid in", values, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidNotIn(List<Boolean> values) {
            addCriterion("IsInstallFeePaid not in", values, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidBetween(Boolean value1, Boolean value2) {
            addCriterion("IsInstallFeePaid between", value1, value2, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andIsInstallFeePaidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsInstallFeePaid not between", value1, value2, "isInstallFeePaid");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateIsNull() {
            addCriterion("InstallFeePaidDate is null");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateIsNotNull() {
            addCriterion("InstallFeePaidDate is not null");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateEqualTo(Date value) {
            addCriterion("InstallFeePaidDate =", value, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateNotEqualTo(Date value) {
            addCriterion("InstallFeePaidDate <>", value, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateGreaterThan(Date value) {
            addCriterion("InstallFeePaidDate >", value, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("InstallFeePaidDate >=", value, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateLessThan(Date value) {
            addCriterion("InstallFeePaidDate <", value, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateLessThanOrEqualTo(Date value) {
            addCriterion("InstallFeePaidDate <=", value, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateIn(List<Date> values) {
            addCriterion("InstallFeePaidDate in", values, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateNotIn(List<Date> values) {
            addCriterion("InstallFeePaidDate not in", values, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateBetween(Date value1, Date value2) {
            addCriterion("InstallFeePaidDate between", value1, value2, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andInstallFeePaidDateNotBetween(Date value1, Date value2) {
            addCriterion("InstallFeePaidDate not between", value1, value2, "installFeePaidDate");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("Deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("Deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("Deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("Deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("Deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("Deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("Deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("Deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("Commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("Commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Double value) {
            addCriterion("Commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Double value) {
            addCriterion("Commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Double value) {
            addCriterion("Commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Double value) {
            addCriterion("Commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Double value) {
            addCriterion("Commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Double value) {
            addCriterion("Commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Double> values) {
            addCriterion("Commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Double> values) {
            addCriterion("Commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Double value1, Double value2) {
            addCriterion("Commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Double value1, Double value2) {
            addCriterion("Commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andHCNumIsNull() {
            addCriterion("HCNum is null");
            return (Criteria) this;
        }

        public Criteria andHCNumIsNotNull() {
            addCriterion("HCNum is not null");
            return (Criteria) this;
        }

        public Criteria andHCNumEqualTo(Integer value) {
            addCriterion("HCNum =", value, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumNotEqualTo(Integer value) {
            addCriterion("HCNum <>", value, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumGreaterThan(Integer value) {
            addCriterion("HCNum >", value, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("HCNum >=", value, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumLessThan(Integer value) {
            addCriterion("HCNum <", value, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumLessThanOrEqualTo(Integer value) {
            addCriterion("HCNum <=", value, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumIn(List<Integer> values) {
            addCriterion("HCNum in", values, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumNotIn(List<Integer> values) {
            addCriterion("HCNum not in", values, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumBetween(Integer value1, Integer value2) {
            addCriterion("HCNum between", value1, value2, "HCNum");
            return (Criteria) this;
        }

        public Criteria andHCNumNotBetween(Integer value1, Integer value2) {
            addCriterion("HCNum not between", value1, value2, "HCNum");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdIsNull() {
            addCriterion("OrigProdId is null");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdIsNotNull() {
            addCriterion("OrigProdId is not null");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdEqualTo(Integer value) {
            addCriterion("OrigProdId =", value, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdNotEqualTo(Integer value) {
            addCriterion("OrigProdId <>", value, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdGreaterThan(Integer value) {
            addCriterion("OrigProdId >", value, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrigProdId >=", value, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdLessThan(Integer value) {
            addCriterion("OrigProdId <", value, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("OrigProdId <=", value, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdIn(List<Integer> values) {
            addCriterion("OrigProdId in", values, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdNotIn(List<Integer> values) {
            addCriterion("OrigProdId not in", values, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdBetween(Integer value1, Integer value2) {
            addCriterion("OrigProdId between", value1, value2, "origProdId");
            return (Criteria) this;
        }

        public Criteria andOrigProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OrigProdId not between", value1, value2, "origProdId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("ProductType is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("ProductType is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("ProductType =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("ProductType <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("ProductType >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductType >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("ProductType <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ProductType <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("ProductType in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("ProductType not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("ProductType between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductType not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIDEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andWeekYearIsNull() {
            addCriterion("WeekYear is null");
            return (Criteria) this;
        }

        public Criteria andWeekYearIsNotNull() {
            addCriterion("WeekYear is not null");
            return (Criteria) this;
        }

        public Criteria andWeekYearEqualTo(String value) {
            addCriterion("WeekYear =", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearNotEqualTo(String value) {
            addCriterion("WeekYear <>", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearGreaterThan(String value) {
            addCriterion("WeekYear >", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearGreaterThanOrEqualTo(String value) {
            addCriterion("WeekYear >=", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearLessThan(String value) {
            addCriterion("WeekYear <", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearLessThanOrEqualTo(String value) {
            addCriterion("WeekYear <=", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearLike(String value) {
            addCriterion("WeekYear like", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearNotLike(String value) {
            addCriterion("WeekYear not like", value, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearIn(List<String> values) {
            addCriterion("WeekYear in", values, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearNotIn(List<String> values) {
            addCriterion("WeekYear not in", values, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearBetween(String value1, String value2) {
            addCriterion("WeekYear between", value1, value2, "weekYear");
            return (Criteria) this;
        }

        public Criteria andWeekYearNotBetween(String value1, String value2) {
            addCriterion("WeekYear not between", value1, value2, "weekYear");
            return (Criteria) this;
        }

        public Criteria andRefIDIsNull() {
            addCriterion("RefID is null");
            return (Criteria) this;
        }

        public Criteria andRefIDIsNotNull() {
            addCriterion("RefID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIDEqualTo(String value) {
            addCriterion("RefID =", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDNotEqualTo(String value) {
            addCriterion("RefID <>", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDGreaterThan(String value) {
            addCriterion("RefID >", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDGreaterThanOrEqualTo(String value) {
            addCriterion("RefID >=", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDLessThan(String value) {
            addCriterion("RefID <", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDLessThanOrEqualTo(String value) {
            addCriterion("RefID <=", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDLike(String value) {
            addCriterion("RefID like", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDNotLike(String value) {
            addCriterion("RefID not like", value, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDIn(List<String> values) {
            addCriterion("RefID in", values, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDNotIn(List<String> values) {
            addCriterion("RefID not in", values, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDBetween(String value1, String value2) {
            addCriterion("RefID between", value1, value2, "refID");
            return (Criteria) this;
        }

        public Criteria andRefIDNotBetween(String value1, String value2) {
            addCriterion("RefID not between", value1, value2, "refID");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeIsNull() {
            addCriterion("PromotionCode is null");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeIsNotNull() {
            addCriterion("PromotionCode is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeEqualTo(Integer value) {
            addCriterion("PromotionCode =", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotEqualTo(Integer value) {
            addCriterion("PromotionCode <>", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeGreaterThan(Integer value) {
            addCriterion("PromotionCode >", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PromotionCode >=", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeLessThan(Integer value) {
            addCriterion("PromotionCode <", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PromotionCode <=", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeIn(List<Integer> values) {
            addCriterion("PromotionCode in", values, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotIn(List<Integer> values) {
            addCriterion("PromotionCode not in", values, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeBetween(Integer value1, Integer value2) {
            addCriterion("PromotionCode between", value1, value2, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PromotionCode not between", value1, value2, "promotionCode");
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

        public Criteria andMatchedProductsIsNull() {
            addCriterion("MatchedProducts is null");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsIsNotNull() {
            addCriterion("MatchedProducts is not null");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsEqualTo(String value) {
            addCriterion("MatchedProducts =", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsNotEqualTo(String value) {
            addCriterion("MatchedProducts <>", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsGreaterThan(String value) {
            addCriterion("MatchedProducts >", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsGreaterThanOrEqualTo(String value) {
            addCriterion("MatchedProducts >=", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsLessThan(String value) {
            addCriterion("MatchedProducts <", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsLessThanOrEqualTo(String value) {
            addCriterion("MatchedProducts <=", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsLike(String value) {
            addCriterion("MatchedProducts like", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsNotLike(String value) {
            addCriterion("MatchedProducts not like", value, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsIn(List<String> values) {
            addCriterion("MatchedProducts in", values, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsNotIn(List<String> values) {
            addCriterion("MatchedProducts not in", values, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsBetween(String value1, String value2) {
            addCriterion("MatchedProducts between", value1, value2, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andMatchedProductsNotBetween(String value1, String value2) {
            addCriterion("MatchedProducts not between", value1, value2, "matchedProducts");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaIsNull() {
            addCriterion("IsDaiFa is null");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaIsNotNull() {
            addCriterion("IsDaiFa is not null");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaEqualTo(Boolean value) {
            addCriterion("IsDaiFa =", value, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaNotEqualTo(Boolean value) {
            addCriterion("IsDaiFa <>", value, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaGreaterThan(Boolean value) {
            addCriterion("IsDaiFa >", value, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDaiFa >=", value, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaLessThan(Boolean value) {
            addCriterion("IsDaiFa <", value, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDaiFa <=", value, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaIn(List<Boolean> values) {
            addCriterion("IsDaiFa in", values, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaNotIn(List<Boolean> values) {
            addCriterion("IsDaiFa not in", values, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDaiFa between", value1, value2, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andIsDaiFaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDaiFa not between", value1, value2, "isDaiFa");
            return (Criteria) this;
        }

        public Criteria andNodeNoIsNull() {
            addCriterion("NodeNo is null");
            return (Criteria) this;
        }

        public Criteria andNodeNoIsNotNull() {
            addCriterion("NodeNo is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNoEqualTo(String value) {
            addCriterion("NodeNo =", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoNotEqualTo(String value) {
            addCriterion("NodeNo <>", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoGreaterThan(String value) {
            addCriterion("NodeNo >", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("NodeNo >=", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoLessThan(String value) {
            addCriterion("NodeNo <", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoLessThanOrEqualTo(String value) {
            addCriterion("NodeNo <=", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoLike(String value) {
            addCriterion("NodeNo like", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoNotLike(String value) {
            addCriterion("NodeNo not like", value, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoIn(List<String> values) {
            addCriterion("NodeNo in", values, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoNotIn(List<String> values) {
            addCriterion("NodeNo not in", values, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoBetween(String value1, String value2) {
            addCriterion("NodeNo between", value1, value2, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andNodeNoNotBetween(String value1, String value2) {
            addCriterion("NodeNo not between", value1, value2, "nodeNo");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountIsNull() {
            addCriterion("TotalManualDiscount is null");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountIsNotNull() {
            addCriterion("TotalManualDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountEqualTo(BigDecimal value) {
            addCriterion("TotalManualDiscount =", value, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountNotEqualTo(BigDecimal value) {
            addCriterion("TotalManualDiscount <>", value, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountGreaterThan(BigDecimal value) {
            addCriterion("TotalManualDiscount >", value, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalManualDiscount >=", value, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountLessThan(BigDecimal value) {
            addCriterion("TotalManualDiscount <", value, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalManualDiscount <=", value, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountIn(List<BigDecimal> values) {
            addCriterion("TotalManualDiscount in", values, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountNotIn(List<BigDecimal> values) {
            addCriterion("TotalManualDiscount not in", values, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalManualDiscount between", value1, value2, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalManualDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalManualDiscount not between", value1, value2, "totalManualDiscount");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNull() {
            addCriterion("ListPrice is null");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNotNull() {
            addCriterion("ListPrice is not null");
            return (Criteria) this;
        }

        public Criteria andListPriceEqualTo(BigDecimal value) {
            addCriterion("ListPrice =", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotEqualTo(BigDecimal value) {
            addCriterion("ListPrice <>", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThan(BigDecimal value) {
            addCriterion("ListPrice >", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ListPrice >=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThan(BigDecimal value) {
            addCriterion("ListPrice <", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ListPrice <=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceIn(List<BigDecimal> values) {
            addCriterion("ListPrice in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotIn(List<BigDecimal> values) {
            addCriterion("ListPrice not in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ListPrice between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ListPrice not between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("PayPrice is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("PayPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(BigDecimal value) {
            addCriterion("PayPrice =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("PayPrice <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(BigDecimal value) {
            addCriterion("PayPrice >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PayPrice >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(BigDecimal value) {
            addCriterion("PayPrice <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PayPrice <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<BigDecimal> values) {
            addCriterion("PayPrice in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("PayPrice not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayPrice between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayPrice not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andTuhuCostIsNull() {
            addCriterion("TuhuCost is null");
            return (Criteria) this;
        }

        public Criteria andTuhuCostIsNotNull() {
            addCriterion("TuhuCost is not null");
            return (Criteria) this;
        }

        public Criteria andTuhuCostEqualTo(BigDecimal value) {
            addCriterion("TuhuCost =", value, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostNotEqualTo(BigDecimal value) {
            addCriterion("TuhuCost <>", value, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostGreaterThan(BigDecimal value) {
            addCriterion("TuhuCost >", value, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TuhuCost >=", value, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostLessThan(BigDecimal value) {
            addCriterion("TuhuCost <", value, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TuhuCost <=", value, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostIn(List<BigDecimal> values) {
            addCriterion("TuhuCost in", values, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostNotIn(List<BigDecimal> values) {
            addCriterion("TuhuCost not in", values, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TuhuCost between", value1, value2, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andTuhuCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TuhuCost not between", value1, value2, "tuhuCost");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("DisplayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("DisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("DisplayName =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("DisplayName <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("DisplayName >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayName >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("DisplayName <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("DisplayName <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("DisplayName like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("DisplayName not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("DisplayName in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("DisplayName not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("DisplayName between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("DisplayName not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("ProductName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("ProductName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("ProductName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("ProductName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("ProductName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitIsNull() {
            addCriterion("DisplayUnit is null");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitIsNotNull() {
            addCriterion("DisplayUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitEqualTo(String value) {
            addCriterion("DisplayUnit =", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitNotEqualTo(String value) {
            addCriterion("DisplayUnit <>", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitGreaterThan(String value) {
            addCriterion("DisplayUnit >", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayUnit >=", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitLessThan(String value) {
            addCriterion("DisplayUnit <", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitLessThanOrEqualTo(String value) {
            addCriterion("DisplayUnit <=", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitLike(String value) {
            addCriterion("DisplayUnit like", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitNotLike(String value) {
            addCriterion("DisplayUnit not like", value, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitIn(List<String> values) {
            addCriterion("DisplayUnit in", values, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitNotIn(List<String> values) {
            addCriterion("DisplayUnit not in", values, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitBetween(String value1, String value2) {
            addCriterion("DisplayUnit between", value1, value2, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDisplayUnitNotBetween(String value1, String value2) {
            addCriterion("DisplayUnit not between", value1, value2, "displayUnit");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaIsNull() {
            addCriterion("DiscountSplitCoda is null");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaIsNotNull() {
            addCriterion("DiscountSplitCoda is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaEqualTo(BigDecimal value) {
            addCriterion("DiscountSplitCoda =", value, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaNotEqualTo(BigDecimal value) {
            addCriterion("DiscountSplitCoda <>", value, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaGreaterThan(BigDecimal value) {
            addCriterion("DiscountSplitCoda >", value, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountSplitCoda >=", value, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaLessThan(BigDecimal value) {
            addCriterion("DiscountSplitCoda <", value, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountSplitCoda <=", value, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaIn(List<BigDecimal> values) {
            addCriterion("DiscountSplitCoda in", values, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaNotIn(List<BigDecimal> values) {
            addCriterion("DiscountSplitCoda not in", values, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountSplitCoda between", value1, value2, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andDiscountSplitCodaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountSplitCoda not between", value1, value2, "discountSplitCoda");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("TaxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TaxRate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("TaxRate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("TaxRate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TaxRate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("TaxRate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TaxRate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("TaxRate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("TaxRate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TaxRate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TaxRate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostIsNull() {
            addCriterion("NoTaxCost is null");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostIsNotNull() {
            addCriterion("NoTaxCost is not null");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostEqualTo(BigDecimal value) {
            addCriterion("NoTaxCost =", value, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostNotEqualTo(BigDecimal value) {
            addCriterion("NoTaxCost <>", value, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostGreaterThan(BigDecimal value) {
            addCriterion("NoTaxCost >", value, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NoTaxCost >=", value, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostLessThan(BigDecimal value) {
            addCriterion("NoTaxCost <", value, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NoTaxCost <=", value, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostIn(List<BigDecimal> values) {
            addCriterion("NoTaxCost in", values, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostNotIn(List<BigDecimal> values) {
            addCriterion("NoTaxCost not in", values, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NoTaxCost between", value1, value2, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NoTaxCost not between", value1, value2, "noTaxCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostIsNull() {
            addCriterion("NoTaxTuhuCost is null");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostIsNotNull() {
            addCriterion("NoTaxTuhuCost is not null");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostEqualTo(BigDecimal value) {
            addCriterion("NoTaxTuhuCost =", value, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostNotEqualTo(BigDecimal value) {
            addCriterion("NoTaxTuhuCost <>", value, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostGreaterThan(BigDecimal value) {
            addCriterion("NoTaxTuhuCost >", value, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NoTaxTuhuCost >=", value, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostLessThan(BigDecimal value) {
            addCriterion("NoTaxTuhuCost <", value, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NoTaxTuhuCost <=", value, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostIn(List<BigDecimal> values) {
            addCriterion("NoTaxTuhuCost in", values, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostNotIn(List<BigDecimal> values) {
            addCriterion("NoTaxTuhuCost not in", values, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NoTaxTuhuCost between", value1, value2, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andNoTaxTuhuCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NoTaxTuhuCost not between", value1, value2, "noTaxTuhuCost");
            return (Criteria) this;
        }

        public Criteria andIDCodeIsNull() {
            addCriterion("IDCode is null");
            return (Criteria) this;
        }

        public Criteria andIDCodeIsNotNull() {
            addCriterion("IDCode is not null");
            return (Criteria) this;
        }

        public Criteria andIDCodeEqualTo(String value) {
            addCriterion("IDCode =", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeNotEqualTo(String value) {
            addCriterion("IDCode <>", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeGreaterThan(String value) {
            addCriterion("IDCode >", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IDCode >=", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeLessThan(String value) {
            addCriterion("IDCode <", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeLessThanOrEqualTo(String value) {
            addCriterion("IDCode <=", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeLike(String value) {
            addCriterion("IDCode like", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeNotLike(String value) {
            addCriterion("IDCode not like", value, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeIn(List<String> values) {
            addCriterion("IDCode in", values, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeNotIn(List<String> values) {
            addCriterion("IDCode not in", values, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeBetween(String value1, String value2) {
            addCriterion("IDCode between", value1, value2, "IDCode");
            return (Criteria) this;
        }

        public Criteria andIDCodeNotBetween(String value1, String value2) {
            addCriterion("IDCode not between", value1, value2, "IDCode");
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