package com.common;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private Integer code;
    private String msg;
    private T data;
    public ResponseResult(){
        this.code = 200;
    }
    public ResponseResult(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public ResponseResult(Integer code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(Integer code,T data){
        this.code = code;
        this.data = data;
    }
    public static ResponseResult success(Object data){
        return new ResponseResult(200,data);
    }
    public static ResponseResult success(String msg,Object data){
        return new ResponseResult(AppHttpCodeEnum.SUCCESS.getCode(), msg,data);
    }
    public static ResponseResult error(String msg){
        return new ResponseResult(AppHttpCodeEnum.SERVER_ERROR.getCode(), msg);
    }
    public static ResponseResult error(Integer code,String msg,Object data){
        return new ResponseResult(code,msg,data);
    }
    public static ResponseResult error(Integer code,String msg){
        return new ResponseResult(code,msg,null);
    }
}
