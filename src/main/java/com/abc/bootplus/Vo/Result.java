package com.abc.bootplus.Vo;

public class Result {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }


    public static Result setOK(Object data){
        Result r=new Result();
        r.setCode(200);
        r.setMsg("OK");
        r.setData(data);
        return r;
    }

    public static Result setERROR(){
        Result r=new Result();
        r.setCode(400);
        r.setMsg("ERROR");
        r.setData(null);
        return r;
    }
    public static Result setResult(boolean isSuccess,Object obj){
        if(isSuccess){
            return setOK(obj);
        }else {
            return setERROR();
        }
    }
}
