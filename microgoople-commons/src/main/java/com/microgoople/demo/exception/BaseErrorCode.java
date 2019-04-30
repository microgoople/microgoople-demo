package com.microgoople.demo.exception;

/**
 * baseError
 * @author sean
 * @date 2019-4-30 10:41:50
 */
public interface BaseErrorCode {
    /**
     * 错误码
     * @return java.lang.String
     */
    String getErrorCode();

    /**
     * 错误描述
     * @return java.lang.String
     */
    String getErrorDesc();

    /**
     * setErrorDesc
     * @param var1
     */
    void setErrorDesc(String var1);
}
