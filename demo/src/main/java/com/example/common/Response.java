package com.example.common;

/**
 * 返回类型的包装
 * @author kdm
 * @date 2019/8/3 6:38
 */
public class Response<T> {
    // 状态码,成功为200,失败为404,也封装成常量类
    private Integer status;
    // 消息,成功消息或者失败消息
    private String msg;
    // 要返回的数据
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Response(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Response(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    /**
     * 状态码 + 成功提示信息
     */
    public static <T> Response<T> createResponseBySuccess(String msg) {
        return new Response<>(StatusCode.SUCCESS, msg);
    }

    /**
     * 状态码 + 成功提示信息 + 数据
     */
    public static <T> Response<T> createResponseBySuccess(String msg, T data) {
        return new Response<>(StatusCode.SUCCESS, msg, data);
    }

    /**
     * 状态码 + 错误信息
     */
    public static <T> Response<T> createResponseByError(String msg) {
        return new Response<>(StatusCode.ERROR, msg);
    }


}
