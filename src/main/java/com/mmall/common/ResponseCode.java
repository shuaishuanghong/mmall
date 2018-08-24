package com.mmall.common;

public enum  ResponseCode {
    SUCCUSS(0,"SUCCUSS"),
    ERROR(1,"ERROR"),
    ENDE_LOGIN(10,"ENDE_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private  final String desc;

     ResponseCode(int code,String desc){
        this.code=code;
        this.desc=desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
