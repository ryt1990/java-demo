package com.ryt.demo.dal.mssql.entity;

public class OrderListWithBLOBs extends OrderList {
    private String FUPID;

    private String extCol;

    private byte[] rowVersions;

    public String getFUPID() {
        return FUPID;
    }

    public void setFUPID(String FUPID) {
        this.FUPID = FUPID == null ? null : FUPID.trim();
    }

    public String getExtCol() {
        return extCol;
    }

    public void setExtCol(String extCol) {
        this.extCol = extCol == null ? null : extCol.trim();
    }

    public byte[] getRowVersions() {
        return rowVersions;
    }

    public void setRowVersions(byte[] rowVersions) {
        this.rowVersions = rowVersions;
    }
}