package com.incubationplatform.common;

/**
 * @author liaochaofan
 * @date 2019/3/1 11:20
 */
public enum ResponseCode {
    SUCCESS(2000,"SUCCESS"),
    ERROR(4000,"ERROR");
    private final int code;
    private final String desc;
    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
