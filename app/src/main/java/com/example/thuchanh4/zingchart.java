package com.example.thuchanh4;

public class zingchart {

    int anh;
    String ten;
    String casi;
    int top;

    public zingchart(int top, String ten, String casi,int anh ) {
        this.anh = anh;
        this.ten = ten;
        this.casi = casi;
        this.top = top;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
