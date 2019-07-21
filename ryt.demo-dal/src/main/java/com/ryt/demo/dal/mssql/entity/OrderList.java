package com.ryt.demo.dal.mssql.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderList {
    private Integer PKID;

    private Integer orderID;

    private String orderNo;

    private String PID;

    private Integer poid;

    private String category;

    private String name;

    private String size;

    private String remark;

    private String carCode;

    private String carName;

    private Integer num;

    private BigDecimal markedPrice;

    private BigDecimal discount;

    private BigDecimal price;

    private BigDecimal totalDiscount;

    private BigDecimal totalPrice;

    private Date lastUpdateTime;

    private BigDecimal purchasePrice;

    private BigDecimal cost;

    private BigDecimal installFee;

    private String vendor;

    private Boolean isPaid;

    private String paidVia;

    private Date instockDate;

    private Date paidDate;

    private String purchaseStatus;

    private Boolean isInstallFeePaid;

    private Date installFeePaidDate;

    private Boolean deleted;

    private Date createDate;

    private Double commission;

    private Integer HCNum;

    private Integer origProdId;

    private Integer productType;

    private Integer parentID;

    private String weekYear;

    private String refID;

    private Integer promotionCode;

    private BigDecimal promotionMoney;

    private String matchedProducts;

    private Boolean isDaiFa;

    private String nodeNo;

    private BigDecimal totalManualDiscount;

    private BigDecimal listPrice;

    private BigDecimal payPrice;

    private BigDecimal tuhuCost;

    private String displayName;

    private BigDecimal amount;

    private String unit;

    private String productName;

    private String displayUnit;

    private BigDecimal discountSplitCoda;

    private BigDecimal taxRate;

    private BigDecimal noTaxCost;

    private BigDecimal noTaxTuhuCost;

    private String IDCode;

    public Integer getPKID() {
        return PKID;
    }

    public void setPKID(Integer PKID) {
        this.PKID = PKID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID == null ? null : PID.trim();
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode == null ? null : carCode.trim();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getMarkedPrice() {
        return markedPrice;
    }

    public void setMarkedPrice(BigDecimal markedPrice) {
        this.markedPrice = markedPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getInstallFee() {
        return installFee;
    }

    public void setInstallFee(BigDecimal installFee) {
        this.installFee = installFee;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public String getPaidVia() {
        return paidVia;
    }

    public void setPaidVia(String paidVia) {
        this.paidVia = paidVia == null ? null : paidVia.trim();
    }

    public Date getInstockDate() {
        return instockDate;
    }

    public void setInstockDate(Date instockDate) {
        this.instockDate = instockDate;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus == null ? null : purchaseStatus.trim();
    }

    public Boolean getIsInstallFeePaid() {
        return isInstallFeePaid;
    }

    public void setIsInstallFeePaid(Boolean isInstallFeePaid) {
        this.isInstallFeePaid = isInstallFeePaid;
    }

    public Date getInstallFeePaidDate() {
        return installFeePaidDate;
    }

    public void setInstallFeePaidDate(Date installFeePaidDate) {
        this.installFeePaidDate = installFeePaidDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Integer getHCNum() {
        return HCNum;
    }

    public void setHCNum(Integer HCNum) {
        this.HCNum = HCNum;
    }

    public Integer getOrigProdId() {
        return origProdId;
    }

    public void setOrigProdId(Integer origProdId) {
        this.origProdId = origProdId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getWeekYear() {
        return weekYear;
    }

    public void setWeekYear(String weekYear) {
        this.weekYear = weekYear == null ? null : weekYear.trim();
    }

    public String getRefID() {
        return refID;
    }

    public void setRefID(String refID) {
        this.refID = refID == null ? null : refID.trim();
    }

    public Integer getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(Integer promotionCode) {
        this.promotionCode = promotionCode;
    }

    public BigDecimal getPromotionMoney() {
        return promotionMoney;
    }

    public void setPromotionMoney(BigDecimal promotionMoney) {
        this.promotionMoney = promotionMoney;
    }

    public String getMatchedProducts() {
        return matchedProducts;
    }

    public void setMatchedProducts(String matchedProducts) {
        this.matchedProducts = matchedProducts == null ? null : matchedProducts.trim();
    }

    public Boolean getIsDaiFa() {
        return isDaiFa;
    }

    public void setIsDaiFa(Boolean isDaiFa) {
        this.isDaiFa = isDaiFa;
    }

    public String getNodeNo() {
        return nodeNo;
    }

    public void setNodeNo(String nodeNo) {
        this.nodeNo = nodeNo == null ? null : nodeNo.trim();
    }

    public BigDecimal getTotalManualDiscount() {
        return totalManualDiscount;
    }

    public void setTotalManualDiscount(BigDecimal totalManualDiscount) {
        this.totalManualDiscount = totalManualDiscount;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getTuhuCost() {
        return tuhuCost;
    }

    public void setTuhuCost(BigDecimal tuhuCost) {
        this.tuhuCost = tuhuCost;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDisplayUnit() {
        return displayUnit;
    }

    public void setDisplayUnit(String displayUnit) {
        this.displayUnit = displayUnit == null ? null : displayUnit.trim();
    }

    public BigDecimal getDiscountSplitCoda() {
        return discountSplitCoda;
    }

    public void setDiscountSplitCoda(BigDecimal discountSplitCoda) {
        this.discountSplitCoda = discountSplitCoda;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getNoTaxCost() {
        return noTaxCost;
    }

    public void setNoTaxCost(BigDecimal noTaxCost) {
        this.noTaxCost = noTaxCost;
    }

    public BigDecimal getNoTaxTuhuCost() {
        return noTaxTuhuCost;
    }

    public void setNoTaxTuhuCost(BigDecimal noTaxTuhuCost) {
        this.noTaxTuhuCost = noTaxTuhuCost;
    }

    public String getIDCode() {
        return IDCode;
    }

    public void setIDCode(String IDCode) {
        this.IDCode = IDCode == null ? null : IDCode.trim();
    }
}