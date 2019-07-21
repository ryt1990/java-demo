package com.ryt.demo.dal.mssql.entity;

public class OrderWithBLOBs extends Order {
    private String systemRemark;

    private byte[] rowVersions;

    public String getSystemRemark() {
        return systemRemark;
    }

    public void setSystemRemark(String systemRemark) {
        this.systemRemark = systemRemark == null ? null : systemRemark.trim();
    }

    public byte[] getRowVersions() {
        return rowVersions;
    }

    public void setRowVersions(byte[] rowVersions) {
        this.rowVersions = rowVersions;
    }
}