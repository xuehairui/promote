package com.example.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 自定义业务异常处理
 * @author xue.hairui
 *
 */
@RestControllerAdvice
public class BusinessExceptionHandler {

    /**
     * 过滤
     */
    private static final Pattern p = Pattern.compile("\\{(.*?)\\}");

    @Autowired
    private ErrorMessageSourceHandler errorMessageSourceHandler;

    @ResponseBody
    @ExceptionHandler(BaseAppException.class)
    public ResponseEntity<?> handlerBaseAppException(BaseAppException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", e.getCode());
        try {
            String localMessage = errorMessageSourceHandler.getMessage(e.getErrorCode());
            map.put("message", replaceArgs(localMessage, e.getArgs()));
        }
        catch (Exception ex) {
            map.put("message", errorMessageSourceHandler.getMessage("common-error"));
            new ResponseEntity<>(map, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(map, HttpStatus.CONFLICT);
    }

    /**
     * 占位符替换
     *
     * @param s
     * @param args
     * @return
     */
    private String replaceArgs(String s, String args[]) {
        int i = 0;
        if (s != null) {
            if (args != null && args.length > 0) {
                StringBuilder sb = new StringBuilder();
                Matcher m = p.matcher(s);
                while (m.find()) {
                    s = s.replaceFirst("\\{(.*?)\\}", Matcher.quoteReplacement(args[i++]));
                }
                sb.append(s);
                return sb.toString();
            }
            else {
                //没有参数直接返回
                return s;
            }
        }
        return "";
    }

}
