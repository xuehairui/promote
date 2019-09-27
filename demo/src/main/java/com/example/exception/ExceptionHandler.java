package com.example.exception;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * 异常辅助类
 * @author xue.hairui
 *
 */
public final class ExceptionHandler {

    /**
     *
     * @param code
     * @param errorCode
     * @return
     * @throws BaseAppException
     */
    public static BaseAppException publish(String code, String errorCode) throws BaseAppException {
        return publish(code, errorCode, null, null, null, null);
    }

    /**
     *
     * @param code
     * @param errorCode
     * @param t
     * @return
     * @throws BaseAppException
     */
    public static BaseAppException publish(String code, String errorCode, Throwable t) throws BaseAppException {
        return publish(code, errorCode, t, null, null);
    }

    /**
     *
     * @param code
     * @param errorCode
     * @param t
     * @param param1
     * @return
     * @throws BaseAppException
     */
    public static BaseAppException publish(String code, String errorCode, Throwable t, String param1) throws BaseAppException {
        return publish(code, errorCode, t, param1, null, null);
    }

    /**
     *
     * @param code
     * @param errorCode
     * @param t
     * @param param1
     * @param param2
     * @return
     * @throws BaseAppException
     */
    public static BaseAppException publish(String code, String errorCode, Throwable t, String param1, String param2) throws BaseAppException {
        return publish(code, errorCode, t, param1, param2, null);
    }

    /**
     * 实现变量可替换  最多3个参数
     * @param code
     * @param errorCode
     * @param t
     * @param param1
     * @param param2
     * @param param3
     * @return
     * @throws BaseAppException
     */
    public static BaseAppException publish(String code, String errorCode, Throwable t, String param1, String param2, String param3) throws BaseAppException {

        BaseAppException BaseAppException;
        if (t instanceof BaseAppException) {
            BaseAppException = (BaseAppException) t;
        }
        else if (t instanceof InvocationTargetException) {
            // 仅仅对此情况进行处理，不能进行深层检查！
            Throwable cause = t.getCause();
            if (cause instanceof BaseAppException) {
                BaseAppException = (BaseAppException) cause;
            }
            else {
                BaseAppException = new BaseAppException(code, errorCode, t, param1, param2, param3);
            }
        }
        else {
            BaseAppException = new BaseAppException(code, errorCode, t, param1, param2, param3);
        }
        throw BaseAppException;
    }
}
