package com.mmall.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable{

    private int status;
    private  String msg;
    private  T data;


    private  ServerResponse(int status){
        this.status=status;
    }
    private  ServerResponse(int status,T data){
        this.status=status;
        this.data=data;
    }
    private  ServerResponse(int status,T data,String msg){
        this.status=status;
        this.data=data;
        this.msg=msg;
    }
    private  ServerResponse(int status,String msg){
        this.status=status;
        this.msg=msg;
    }
    @JsonIgnore
    public boolean isSucess(){
        return this.status==ResponseCode.SUCCUSS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }


    public  static  <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCUSS.getCode());
    }

    public  static  <T> ServerResponse<T> createBySuccessMessage(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCUSS.getCode(),msg);
    }

    public  static  <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCUSS.getCode(),data);
    }

    public  static  <T> ServerResponse<T> createBySuccess(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCUSS.getCode(),data,msg);
    }

    public  static  <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }

    public  static  <T> ServerResponse<T> createByErrorMessgae(String msg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),msg);
    }

    public  static  <T> ServerResponse<T> createByErrorcodeMessgae(int code,String msg){
        return new ServerResponse<T>(code,msg);
    }
}
