package com.incubationplatform.common;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @author liaochaofan
 * @date 2019/3/1 11:04
 */
public class ServerResponse<T> {
    private int net;
    private String msg;
    private T data;
    private ServerResponse(int net){
        this.net = net;
    }
    private ServerResponse(int net, T data){
        this.net = net;
        this.data = data;
    }

    public ServerResponse(int net, String msg, T data) {
        this.net = net;
        this.msg = msg;
        this.data = data;
    }

    public ServerResponse(int net, String msg) {
        this.net = net;
        this.msg = msg;
    }


    public boolean isSuccess(){
        return this.net == ResponseCode.SUCCESS.getCode();
    }

    public int getNet() {
        return net;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }
    public static <T> ServerResponse<T> createBySuccessMessage(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }
    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }
    public static <T> ServerResponse<T> createBySuccess(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }
    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }
    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new ServerResponse<T>(errorCode,errorMessage);
    }

}
