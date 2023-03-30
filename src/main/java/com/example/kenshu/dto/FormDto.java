package com.example.kenshu.dto;


public class FormDto {
    private Integer num;
    private Integer num2;
    private String type;

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public int getNum2() {
        return num2;
    }

    public String getType() {
        return type;
    }
}
