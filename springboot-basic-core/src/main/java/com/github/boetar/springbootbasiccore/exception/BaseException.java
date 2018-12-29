package com.github.boetar.springbootbasiccore.exception;

/**
 * 基础异常类
 *
 * @version 1.0
 * @author bojiangzhou 2017-12-31
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -997101946070796354L;

    /**
     * 错误编码
     */
    protected String code;

    public BaseException() {}

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
