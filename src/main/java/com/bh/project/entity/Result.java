package com.bh.project.entity;

public class Result<T> {
    private Integer code; //错误代码
    private String message; //提示信息
    private T data; //具体数据


    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
