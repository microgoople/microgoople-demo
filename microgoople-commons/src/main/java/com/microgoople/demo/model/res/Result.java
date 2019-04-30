package com.microgoople.demo.model.res;

import com.google.common.base.Objects;
import com.microgoople.demo.exception.BaseErrorCode;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author sean
 * @description 通用响应对象
 * @date 2019-4-30 10:38:58
 */
@SuppressWarnings("AliDeprecation")
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -3189331135386948171L;

    private boolean success;
    private T result;
    private String errorCode;
    private String errorMsg;

    public Result() {
    }

    public Result(T result) {
        this.success = true;
        this.result = result;
    }

    public Result(boolean flag, T result) {
        if (flag) {
            this.success = true;
            this.result = result;
        } else {
            this.success = false;
            this.errorCode = (String)result;
        }

    }

    public Result(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Result(BaseErrorCode errorCode) {
        this.errorCode = errorCode.getErrorCode();
        this.errorMsg = errorCode.getErrorDesc();
    }

    public boolean isSuccess() {
        return this.success;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.success = true;
        this.result = result;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        if (errorCode != null) {
            this.success = false;
            this.errorCode = errorCode;
        }

    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Result response = (Result)o;
            return this.success == response.success && this.result.equals(response.result) && this.errorCode.equals(response.errorCode);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result1 = this.success ? 1 : 0;
        result1 = 31 * result1 + this.result.hashCode();
        if (StringUtils.isNotBlank(this.errorCode)) {
            result1 = 31 * result1 + this.errorCode.hashCode();
        }

        return result1;
    }

    @SuppressWarnings("AliDeprecation")
    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("success", this.success).add("result", this.result).add("errorCode", this.errorCode).add("errorMsg", this.errorMsg).omitNullValues().toString();
    }
}
