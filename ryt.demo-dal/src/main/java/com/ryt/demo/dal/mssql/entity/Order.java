package com.ryt.demo.dal.mssql.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer PKID;

    private String orderNo;

    private String userID;

    private String userName;

    private String userTel;

    private Integer addressID;

    private String carID;

    private String status;

    private Date orderDatetime;

    private Date bookDatetime;

    private String bookPeriod;

    private String abst;

    private String remark;

    private String owner;

    private String submitor;

    private String auditor;

    private Date auditDatetime;

    private Integer sumNum;

    private BigDecimal sumMoney;

    private BigDecimal sumMarkedMoney;

    private BigDecimal sumDisMoney;

    private BigDecimal shippingMoney;

    private BigDecimal installMoney;

    private String discountItem;

    private String installType;

    private Integer installShopID;

    private String installShop;

    private String deliveryCode;

    private String payStatus;

    private BigDecimal sumPaid;

    private String payMothed;

    private String paymentType;

    private Date purchaseDatetime;

    private String deliveryType;

    private String deliveryStatus;

    private Date deliveryDatetime;

    private String deliveryConfirmor;

    private Date installDatetime;

    private String installStatus;

    private Date payToCPDate;

    private String payInfo;

    private String invoiceTitle;

    private String invoiceType;

    private String invoiceStatus;

    private String invoiceDeliveryCode;

    private BigDecimal invoiceAddTax;

    private Date lastUpdateTime;

    private String carPlate;

    private BigDecimal cost;

    private BigDecimal installFee;

    private BigDecimal deliveryFee;

    private BigDecimal otherPayShop;

    private Boolean isOtherPaid;

    private Date otherPaidDate;

    private BigDecimal invAmont;

    private String invAddress;

    private String invTaxNum;

    private String invBank;

    private String invBankAccount;

    private String invRemark;

    private String orderType;

    private String orderChannel;

    private String refNo;

    private String caseId;

    private Integer commentStatus;

    private Boolean reconciliation;

    private Date reconcileTime;

    private Date reconciledTime;

    private Integer shopReconcileVoucher;

    private Integer bankRecieveVoucher;

    private String orderAddress;

    private Date outStockDatetime;

    private Integer incomeVoucher;

    private Integer costVoucher;

    private Boolean orderProcessed;

    private String orderProcessor;

    private Date orderProcessTime;

    private String orderProducts;

    private String deliveryCompany;

    private Date recheiveDate;

    private String deliveryAddressID;

    private String tranRefNum;

    private Boolean checkMark;

    private String checkComment;

    private String tuHuHandler;

    private String handleComment;

    private Boolean isHandle;

    private Integer purchaseStatus;

    private Integer regionID;

    private Integer wareHouseID;

    private String wareHouseName;

    private Integer refOrderState;

    private String buyAgainType;

    private String driverName;

    private Date submitDate;

    private Boolean isReminder;

    private Boolean isGift;

    private Date getGiftDateTime;

    private String installOrderNo;

    private Date gotPayDate;

    private BigDecimal promotionMoney;

    private Date bookSentDateTime;

    private BigDecimal sumPayDeduction;

    private BigDecimal sumPayable;

    private BigDecimal sumListPrice;

    private BigDecimal sumManualDiscount;

    private Integer orderStockID;

    private String orderStockName;

    private Date recieveDatetime;

    private String payCategory;

    private String orderProductType;

    private Long tradeID;

    private Integer sourceID;

    private Integer sourceType;

    public Integer getPKID() {
        return PKID;
    }

    public void setPKID(Integer PKID) {
        this.PKID = PKID;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID == null ? null : carID.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public Date getBookDatetime() {
        return bookDatetime;
    }

    public void setBookDatetime(Date bookDatetime) {
        this.bookDatetime = bookDatetime;
    }

    public String getBookPeriod() {
        return bookPeriod;
    }

    public void setBookPeriod(String bookPeriod) {
        this.bookPeriod = bookPeriod == null ? null : bookPeriod.trim();
    }

    public String getAbst() {
        return abst;
    }

    public void setAbst(String abst) {
        this.abst = abst == null ? null : abst.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getSubmitor() {
        return submitor;
    }

    public void setSubmitor(String submitor) {
        this.submitor = submitor == null ? null : submitor.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditDatetime() {
        return auditDatetime;
    }

    public void setAuditDatetime(Date auditDatetime) {
        this.auditDatetime = auditDatetime;
    }

    public Integer getSumNum() {
        return sumNum;
    }

    public void setSumNum(Integer sumNum) {
        this.sumNum = sumNum;
    }

    public BigDecimal getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(BigDecimal sumMoney) {
        this.sumMoney = sumMoney;
    }

    public BigDecimal getSumMarkedMoney() {
        return sumMarkedMoney;
    }

    public void setSumMarkedMoney(BigDecimal sumMarkedMoney) {
        this.sumMarkedMoney = sumMarkedMoney;
    }

    public BigDecimal getSumDisMoney() {
        return sumDisMoney;
    }

    public void setSumDisMoney(BigDecimal sumDisMoney) {
        this.sumDisMoney = sumDisMoney;
    }

    public BigDecimal getShippingMoney() {
        return shippingMoney;
    }

    public void setShippingMoney(BigDecimal shippingMoney) {
        this.shippingMoney = shippingMoney;
    }

    public BigDecimal getInstallMoney() {
        return installMoney;
    }

    public void setInstallMoney(BigDecimal installMoney) {
        this.installMoney = installMoney;
    }

    public String getDiscountItem() {
        return discountItem;
    }

    public void setDiscountItem(String discountItem) {
        this.discountItem = discountItem == null ? null : discountItem.trim();
    }

    public String getInstallType() {
        return installType;
    }

    public void setInstallType(String installType) {
        this.installType = installType == null ? null : installType.trim();
    }

    public Integer getInstallShopID() {
        return installShopID;
    }

    public void setInstallShopID(Integer installShopID) {
        this.installShopID = installShopID;
    }

    public String getInstallShop() {
        return installShop;
    }

    public void setInstallShop(String installShop) {
        this.installShop = installShop == null ? null : installShop.trim();
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode == null ? null : deliveryCode.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public BigDecimal getSumPaid() {
        return sumPaid;
    }

    public void setSumPaid(BigDecimal sumPaid) {
        this.sumPaid = sumPaid;
    }

    public String getPayMothed() {
        return payMothed;
    }

    public void setPayMothed(String payMothed) {
        this.payMothed = payMothed == null ? null : payMothed.trim();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public Date getPurchaseDatetime() {
        return purchaseDatetime;
    }

    public void setPurchaseDatetime(Date purchaseDatetime) {
        this.purchaseDatetime = purchaseDatetime;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType == null ? null : deliveryType.trim();
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus == null ? null : deliveryStatus.trim();
    }

    public Date getDeliveryDatetime() {
        return deliveryDatetime;
    }

    public void setDeliveryDatetime(Date deliveryDatetime) {
        this.deliveryDatetime = deliveryDatetime;
    }

    public String getDeliveryConfirmor() {
        return deliveryConfirmor;
    }

    public void setDeliveryConfirmor(String deliveryConfirmor) {
        this.deliveryConfirmor = deliveryConfirmor == null ? null : deliveryConfirmor.trim();
    }

    public Date getInstallDatetime() {
        return installDatetime;
    }

    public void setInstallDatetime(Date installDatetime) {
        this.installDatetime = installDatetime;
    }

    public String getInstallStatus() {
        return installStatus;
    }

    public void setInstallStatus(String installStatus) {
        this.installStatus = installStatus == null ? null : installStatus.trim();
    }

    public Date getPayToCPDate() {
        return payToCPDate;
    }

    public void setPayToCPDate(Date payToCPDate) {
        this.payToCPDate = payToCPDate;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo == null ? null : payInfo.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus == null ? null : invoiceStatus.trim();
    }

    public String getInvoiceDeliveryCode() {
        return invoiceDeliveryCode;
    }

    public void setInvoiceDeliveryCode(String invoiceDeliveryCode) {
        this.invoiceDeliveryCode = invoiceDeliveryCode == null ? null : invoiceDeliveryCode.trim();
    }

    public BigDecimal getInvoiceAddTax() {
        return invoiceAddTax;
    }

    public void setInvoiceAddTax(BigDecimal invoiceAddTax) {
        this.invoiceAddTax = invoiceAddTax;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate == null ? null : carPlate.trim();
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

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getOtherPayShop() {
        return otherPayShop;
    }

    public void setOtherPayShop(BigDecimal otherPayShop) {
        this.otherPayShop = otherPayShop;
    }

    public Boolean getIsOtherPaid() {
        return isOtherPaid;
    }

    public void setIsOtherPaid(Boolean isOtherPaid) {
        this.isOtherPaid = isOtherPaid;
    }

    public Date getOtherPaidDate() {
        return otherPaidDate;
    }

    public void setOtherPaidDate(Date otherPaidDate) {
        this.otherPaidDate = otherPaidDate;
    }

    public BigDecimal getInvAmont() {
        return invAmont;
    }

    public void setInvAmont(BigDecimal invAmont) {
        this.invAmont = invAmont;
    }

    public String getInvAddress() {
        return invAddress;
    }

    public void setInvAddress(String invAddress) {
        this.invAddress = invAddress == null ? null : invAddress.trim();
    }

    public String getInvTaxNum() {
        return invTaxNum;
    }

    public void setInvTaxNum(String invTaxNum) {
        this.invTaxNum = invTaxNum == null ? null : invTaxNum.trim();
    }

    public String getInvBank() {
        return invBank;
    }

    public void setInvBank(String invBank) {
        this.invBank = invBank == null ? null : invBank.trim();
    }

    public String getInvBankAccount() {
        return invBankAccount;
    }

    public void setInvBankAccount(String invBankAccount) {
        this.invBankAccount = invBankAccount == null ? null : invBankAccount.trim();
    }

    public String getInvRemark() {
        return invRemark;
    }

    public void setInvRemark(String invRemark) {
        this.invRemark = invRemark == null ? null : invRemark.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel == null ? null : orderChannel.trim();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Boolean getReconciliation() {
        return reconciliation;
    }

    public void setReconciliation(Boolean reconciliation) {
        this.reconciliation = reconciliation;
    }

    public Date getReconcileTime() {
        return reconcileTime;
    }

    public void setReconcileTime(Date reconcileTime) {
        this.reconcileTime = reconcileTime;
    }

    public Date getReconciledTime() {
        return reconciledTime;
    }

    public void setReconciledTime(Date reconciledTime) {
        this.reconciledTime = reconciledTime;
    }

    public Integer getShopReconcileVoucher() {
        return shopReconcileVoucher;
    }

    public void setShopReconcileVoucher(Integer shopReconcileVoucher) {
        this.shopReconcileVoucher = shopReconcileVoucher;
    }

    public Integer getBankRecieveVoucher() {
        return bankRecieveVoucher;
    }

    public void setBankRecieveVoucher(Integer bankRecieveVoucher) {
        this.bankRecieveVoucher = bankRecieveVoucher;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public Date getOutStockDatetime() {
        return outStockDatetime;
    }

    public void setOutStockDatetime(Date outStockDatetime) {
        this.outStockDatetime = outStockDatetime;
    }

    public Integer getIncomeVoucher() {
        return incomeVoucher;
    }

    public void setIncomeVoucher(Integer incomeVoucher) {
        this.incomeVoucher = incomeVoucher;
    }

    public Integer getCostVoucher() {
        return costVoucher;
    }

    public void setCostVoucher(Integer costVoucher) {
        this.costVoucher = costVoucher;
    }

    public Boolean getOrderProcessed() {
        return orderProcessed;
    }

    public void setOrderProcessed(Boolean orderProcessed) {
        this.orderProcessed = orderProcessed;
    }

    public String getOrderProcessor() {
        return orderProcessor;
    }

    public void setOrderProcessor(String orderProcessor) {
        this.orderProcessor = orderProcessor == null ? null : orderProcessor.trim();
    }

    public Date getOrderProcessTime() {
        return orderProcessTime;
    }

    public void setOrderProcessTime(Date orderProcessTime) {
        this.orderProcessTime = orderProcessTime;
    }

    public String getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(String orderProducts) {
        this.orderProducts = orderProducts == null ? null : orderProducts.trim();
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    public Date getRecheiveDate() {
        return recheiveDate;
    }

    public void setRecheiveDate(Date recheiveDate) {
        this.recheiveDate = recheiveDate;
    }

    public String getDeliveryAddressID() {
        return deliveryAddressID;
    }

    public void setDeliveryAddressID(String deliveryAddressID) {
        this.deliveryAddressID = deliveryAddressID == null ? null : deliveryAddressID.trim();
    }

    public String getTranRefNum() {
        return tranRefNum;
    }

    public void setTranRefNum(String tranRefNum) {
        this.tranRefNum = tranRefNum == null ? null : tranRefNum.trim();
    }

    public Boolean getCheckMark() {
        return checkMark;
    }

    public void setCheckMark(Boolean checkMark) {
        this.checkMark = checkMark;
    }

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }

    public String getTuHuHandler() {
        return tuHuHandler;
    }

    public void setTuHuHandler(String tuHuHandler) {
        this.tuHuHandler = tuHuHandler == null ? null : tuHuHandler.trim();
    }

    public String getHandleComment() {
        return handleComment;
    }

    public void setHandleComment(String handleComment) {
        this.handleComment = handleComment == null ? null : handleComment.trim();
    }

    public Boolean getIsHandle() {
        return isHandle;
    }

    public void setIsHandle(Boolean isHandle) {
        this.isHandle = isHandle;
    }

    public Integer getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(Integer purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Integer getRegionID() {
        return regionID;
    }

    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    public Integer getWareHouseID() {
        return wareHouseID;
    }

    public void setWareHouseID(Integer wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName == null ? null : wareHouseName.trim();
    }

    public Integer getRefOrderState() {
        return refOrderState;
    }

    public void setRefOrderState(Integer refOrderState) {
        this.refOrderState = refOrderState;
    }

    public String getBuyAgainType() {
        return buyAgainType;
    }

    public void setBuyAgainType(String buyAgainType) {
        this.buyAgainType = buyAgainType == null ? null : buyAgainType.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Boolean getIsReminder() {
        return isReminder;
    }

    public void setIsReminder(Boolean isReminder) {
        this.isReminder = isReminder;
    }

    public Boolean getIsGift() {
        return isGift;
    }

    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    public Date getGetGiftDateTime() {
        return getGiftDateTime;
    }

    public void setGetGiftDateTime(Date getGiftDateTime) {
        this.getGiftDateTime = getGiftDateTime;
    }

    public String getInstallOrderNo() {
        return installOrderNo;
    }

    public void setInstallOrderNo(String installOrderNo) {
        this.installOrderNo = installOrderNo == null ? null : installOrderNo.trim();
    }

    public Date getGotPayDate() {
        return gotPayDate;
    }

    public void setGotPayDate(Date gotPayDate) {
        this.gotPayDate = gotPayDate;
    }

    public BigDecimal getPromotionMoney() {
        return promotionMoney;
    }

    public void setPromotionMoney(BigDecimal promotionMoney) {
        this.promotionMoney = promotionMoney;
    }

    public Date getBookSentDateTime() {
        return bookSentDateTime;
    }

    public void setBookSentDateTime(Date bookSentDateTime) {
        this.bookSentDateTime = bookSentDateTime;
    }

    public BigDecimal getSumPayDeduction() {
        return sumPayDeduction;
    }

    public void setSumPayDeduction(BigDecimal sumPayDeduction) {
        this.sumPayDeduction = sumPayDeduction;
    }

    public BigDecimal getSumPayable() {
        return sumPayable;
    }

    public void setSumPayable(BigDecimal sumPayable) {
        this.sumPayable = sumPayable;
    }

    public BigDecimal getSumListPrice() {
        return sumListPrice;
    }

    public void setSumListPrice(BigDecimal sumListPrice) {
        this.sumListPrice = sumListPrice;
    }

    public BigDecimal getSumManualDiscount() {
        return sumManualDiscount;
    }

    public void setSumManualDiscount(BigDecimal sumManualDiscount) {
        this.sumManualDiscount = sumManualDiscount;
    }

    public Integer getOrderStockID() {
        return orderStockID;
    }

    public void setOrderStockID(Integer orderStockID) {
        this.orderStockID = orderStockID;
    }

    public String getOrderStockName() {
        return orderStockName;
    }

    public void setOrderStockName(String orderStockName) {
        this.orderStockName = orderStockName == null ? null : orderStockName.trim();
    }

    public Date getRecieveDatetime() {
        return recieveDatetime;
    }

    public void setRecieveDatetime(Date recieveDatetime) {
        this.recieveDatetime = recieveDatetime;
    }

    public String getPayCategory() {
        return payCategory;
    }

    public void setPayCategory(String payCategory) {
        this.payCategory = payCategory == null ? null : payCategory.trim();
    }

    public String getOrderProductType() {
        return orderProductType;
    }

    public void setOrderProductType(String orderProductType) {
        this.orderProductType = orderProductType == null ? null : orderProductType.trim();
    }

    public Long getTradeID() {
        return tradeID;
    }

    public void setTradeID(Long tradeID) {
        this.tradeID = tradeID;
    }

    public Integer getSourceID() {
        return sourceID;
    }

    public void setSourceID(Integer sourceID) {
        this.sourceID = sourceID;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
}