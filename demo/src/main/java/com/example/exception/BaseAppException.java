package com.example.exception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 自定义异常类
 * @author xue.hairui
 *
 */
public class BaseAppException extends Exception {

    /**
     * 返回code
     */
    private String code;

    /**
     * 异常码key
     */
    private String errorCode;

    /**
     * 参数
     */
    private String[] args;


    /**
     * 为了可对异常信息进行参数替换，扩展了String arg0,String arg1,String arg2 三个参数
     *
     * @param code String 定义前端接口到的code
     * @param errorCode String 异常码code
     * @param cause Throwable 异常
     * @param arg0 String 参数1
     * @param arg1 String 参数2
     * @param arg2 String 参数3
     */
    public BaseAppException(String code, String errorCode, Throwable cause, String arg0, String arg1,
                             String arg2) {
        super("", cause);
        List<String> list = new ArrayList<String>(3);
        if (arg0 != null) {
            list.add(arg0);
        }
        if (arg1 != null) {
            list.add(arg1);
        }
        if (arg2 != null) {
            list.add(arg2);
        }
        if (list.size() > 0) {
            args = new String[list.size()];
            int i = 0;
            for (String s : list) {
                args[i++] = s;
            }
        }
        this.code = code;
        this.errorCode = errorCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String[] getArgs() {
        return args;
    }
}
