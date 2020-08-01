package com.github.chentianming11.spring.validation.base;

/**
 * @author 陈添明
 * @date 2019/3/5
 */
public enum BusinessCode implements ReturnCode {


    成功(0, "success"),
    未知系统错误(10000, "未知系统错误"),
    缺少参数(10001, "缺少参数"),
    参数类型不匹配(10002, "参数类型不匹配"),
    文件上传错误(10003, "文件上传错误"),
    参数校验失败(10004, "参数校验失败"),
    未知业务失败(20000, "未知业务失败");

    /**
     * 业务编号
     */
    private int code;

    /**
     * 业务值
     */
    private String message;

    BusinessCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取返回编码
     *
     * @return code
     */
    @Override
    public int code() {
        return code;
    }

    /**
     * 获取返回描述信息
     *
     * @return message
     */
    @Override
    public String message() {
        return message;
    }
}
