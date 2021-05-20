package com.lqq.response;

public class RespBean {
    private Integer code;
    private String msg;
    private Object obj;

    //运行成功
    public static RespBean sucesses(String msg){
        return new RespBean(200,msg,null);
    }

    public static RespBean sucesses(String msg, Object obj){
        return new RespBean(200,msg,obj);
    }
    //运行失败
    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }

    public static RespBean error(String msg, Object obj){
        return new RespBean(500,msg,obj);
    }


    private RespBean(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
    private RespBean(){

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
